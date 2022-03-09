/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import java.awt.LayoutManager;
import javax.swing.JFrame;

/**
 *
 * @author Adrian
 */
public abstract class Ventana extends JFrame{
    
    //protected LayoutManager layoutManager;


    public Ventana(LayoutManager layout){
        this.setLayout(layout);
        inicializar();
        configurarComponentes();
    }

    public void inicializar(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    
    public abstract void configurarComponentes();
}
