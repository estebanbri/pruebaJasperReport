/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebajasperreport;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author esteban
 */
public class GenerarReporte {
    public static void main(String[] args) throws JRException{
        String rutaReporte = "C:\\Users\\esteban\\Documents\\NetBeansProjects\\PruebaJasperReport\\src\\reportes\\miReporte.jasper";
        String rutaReportePDF = "C:\\Users\\esteban\\Documents\\NetBeansProjects\\PruebaJasperReport\\src\\reportes\\miReporte.pdf";
        JasperPrint jasperprint = JasperFillManager.fillReport(rutaReporte, null, new JREmptyDataSource());
        JasperExportManager.exportReportToPdfFile(jasperprint, rutaReportePDF);
    }
    
}
