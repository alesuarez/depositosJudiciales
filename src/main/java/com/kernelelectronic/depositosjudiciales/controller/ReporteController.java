package com.kernelelectronic.depositosjudiciales.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JRDesignBand;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteController {

    public static final String FILE = "DepositosJudiciales.jrxml";

    private JasperDesign jasperDesign;

    public static Map getReportParameter() {
        Map parameters = new HashMap();

        parameters.put("printer", "1010111");

        return parameters;
    }

    public ReporteController() {
    }

    public void obtenerDetail() {
        JRDesignBand detail = (JRDesignBand) jasperDesign.getAllBands()[0];
        JRElement[] elements = detail.getElements();
        JRDesignStaticText elementoCero = (JRDesignStaticText) elements[0];
        elementoCero.setY(300);
        elementoCero.setX(600);
    }

    public static void printAll() {
        try {
            JasperReport report = null;
            JasperPrint print = null;
            JasperDesign design = null;

            Map params = new HashMap();

            design = JRXmlLoader.load(FILE);

            report = JasperCompileManager.compileReport(design);
            print = JasperFillManager.fillReport(report, params, new JRBeanCollectionDataSource(DepositoController.getAllCollection()));
            JasperExportManager.exportReportToPdfFile(print, "person.pdf");
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            System.out.println(ex);
        }
    }
}
