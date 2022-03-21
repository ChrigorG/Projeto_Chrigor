/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.classes;

import br.edu.ifms.tcc.telas.Creditos;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

/**
 *
 * @author aluno
 */
public class Background {

    private Color initialColor;
    private Color finalColor;

    public Background() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void corBranca(Creditos c){
        c.getContentPane().setBackground(Color.white);
    }
    
     public void corEscura(Creditos c){
         c.getContentPane().setBackground(Color.lightGray);
    }
    
}
