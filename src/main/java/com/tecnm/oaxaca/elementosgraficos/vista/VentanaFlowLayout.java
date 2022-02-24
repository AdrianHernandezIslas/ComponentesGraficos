/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class VentanaFlowLayout extends JFrame{
    
    
    public void inicializar(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        configurarElementos();
        this.setVisible(true);
    }
    
    private void configurarElementos(){
        JButton boton = new JButton("Agregar");
        JLabel etiqueta = new JLabel("Escribe tu nombre");
        JTextField cuadroDeTexto = new JTextField(10);
        //JTextField cuadroDeTexto2 = new JTextField(45);
        
        this.add(etiqueta);
        this.add(cuadroDeTexto);
        this.add(boton);
        //this.add(cuadroDeTexto2);
    }
}

