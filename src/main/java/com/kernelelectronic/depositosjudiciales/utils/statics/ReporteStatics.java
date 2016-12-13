package com.kernelelectronic.depositosjudiciales.utils.statics;

import com.kernelelectronic.depositosjudiciales.controller.DepositoController;
import com.kernelelectronic.depositosjudiciales.model.Deposito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.kernelelectronic.depositosjudiciales.utils.statics.constants.ApplicationConstantsStatic;
import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JRDesignBand;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.xml.JRXmlWriter;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.collections.map.HashedMap;

public class ReporteStatics {

    public static void moverReporte(int x, int y) throws JRException {
        JasperDesign jasperDesign = JRXmlLoader.load(ApplicationConstantsStatic.FILE_JASPER_REPORT_JRXML);
        JRDesignBand detail = (JRDesignBand) jasperDesign.getAllBands()[0];
        JRElement[] elements = detail.getElements();
        for (JRElement jrElements : elements) {

            if (jrElements instanceof JRDesignStaticText) {
                JRDesignStaticText elemento = (JRDesignStaticText) jrElements;
                elemento.setX(elemento.getX() + x);
                elemento.setY(elemento.getY() + y);

            } else if (jrElements instanceof JRDesignTextField) {
                JRDesignTextField elemento = (JRDesignTextField) jrElements;
                elemento.setX(elemento.getX() + x);
                elemento.setY(elemento.getY() + y);
            }
        }
        JRXmlWriter.writeReport(jasperDesign, ApplicationConstantsStatic.FILE_JASPER_REPORT_JRXML
                , ApplicationConstantsStatic.DEFAULT_ENCODING);
    }

    private static void print(Collection beanCollectionDataSource) {
        try {
            JasperReport report = null;
            JasperPrint print = null;
            JasperDesign design = null;

            design = JRXmlLoader.load(ApplicationConstantsStatic.FILE_JASPER_REPORT_JRXML);

            report = JasperCompileManager.compileReport(design);
            print = JasperFillManager.fillReport(report, new HashedMap(),
                    new JRBeanCollectionDataSource(beanCollectionDataSource));
            //JasperExportManager.exportReportToPdfFile(print, ApplicationConstantsStatic.FILE_OUT_PDF);
            JasperViewer jasperViewer = new JasperViewer(print, false);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            System.out.println(ex);
        }
    }

    public static void printAll() {
        print(DepositoController.getAllCollection());
    }

    public static void printToday() {
        print(DepositoController.getToday());
    }

    public static void printSelected(List<Deposito> depositos) {
        print(DepositoController.printSelected(depositos));
    }

    public static void print(Deposito deposito) {
        List<Deposito> depositos = new ArrayList<>();
        depositos.add(deposito);
        printSelected(depositos);
    }
}
