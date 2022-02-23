/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Adrian
 */
public class Ventana extends JFrame{
    
    private JLabel etiquetaSaludo;
    private JButton botonSolicitud;


    public Ventana(){
    }

    public void inicializar(){
        this.setSize(500, 500);
        //this.setLocation(0,0);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        configurarEtiquetaSaludo();
        configurarBotonSolicitud();
        
        this.setVisible(true);
    }
    
    
    private void configurarEtiquetaSaludo(){
        etiquetaSaludo = new JLabel("Hola, mi nombre es Adrian");
        etiquetaSaludo.setBounds(50, 50, 150, 50);
        this.add(etiquetaSaludo);
    }
    
    private void configurarBotonSolicitud(){
        botonSolicitud = new JButton("Dame dineros paro");
        botonSolicitud.setBounds(50, 150, 150, 50);
        this.add(botonSolicitud);
    }
    
    
}
