package com.kernelelectronic.depositosjudiciales.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.kernelelectronic.depositosjudiciales.model.Deposito;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JRDesignBand;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.type.PositionTypeEnum;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteController {

    public final String FILE = "./DepositosJudiciales.jrxml";
    public final String FILE_EXAMPLE = "C:\\Users\\laptop\\Documents\\NetBeansProjects\\DepositosJudiciales\\reporteEjemplo.jasper";

    private JasperDesign jasperDesign;

    public static Map getReportParameter() {
        Map parameters = new HashMap();

        parameters.put("printer", "1010111");

        return parameters;
    }
    public ReporteController() {
        try {
            //get report file and then load into jasperDesign
            jasperDesign = JRXmlLoader.load(FILE);
            //compile the jasperDesign
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            //fill the ready report with data and parameter
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, getReportParameter(), new JRBeanCollectionDataSource(
                    findReportData()));
            //view the report using JasperViewer
            JasperViewer.viewReport(jasperPrint);
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
    
    public void obtenerDetail() {
        JRDesignBand detail = (JRDesignBand) jasperDesign.getAllBands()[0];
        JRElement[] elements = detail.getElements();
        JRDesignStaticText elementoCero = (JRDesignStaticText) elements[0];
        elementoCero.setY(300);
        elementoCero.setX(600);
    }

    public void generarReporteDeposito(Deposito deposito) {

    }
}
