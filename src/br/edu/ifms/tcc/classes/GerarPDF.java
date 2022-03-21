/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.classes;


import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chrigor
 */
public class GerarPDF {
    
    
       public void PDF1(){  
           try {
               File arquivo = new File(getClass().getResource("/br/edu/ifms/tcc/abrirpdf/pdf6.pdf").toURI());
               Desktop.getDesktop().open(arquivo);
           } catch (IOException | URISyntaxException ex) {
               System.out.println("Error: "+ex);
           }
           
       }
        public void PDF2(){  
           try {
               File arquivo = new File(getClass().getResource("/br/edu/ifms/tcc/abrirpdf/pdf7.pdf").toURI());
               Desktop.getDesktop().open(arquivo);
           } catch (IOException | URISyntaxException ex) {
               System.out.println("Error: "+ex);
           }
       }
         public void PDF3(){  
           try {
               File arquivo = new File(getClass().getResource("/br/edu/ifms/tcc/abrirpdf/pdf8.pdf").toURI());
               Desktop.getDesktop().open(arquivo);
           } catch (IOException | URISyntaxException ex) {
               System.out.println("Error: "+ex);
           }
       }
          public void PDF4(){  
           try {
               File arquivo = new File(getClass().getResource("/br/edu/ifms/tcc/abrirpdf/pdf9.pdf").toURI());
               Desktop.getDesktop().open(arquivo);
           } catch (IOException | URISyntaxException ex) {
               System.out.println("Error: "+ex);
           } 
       }
}
