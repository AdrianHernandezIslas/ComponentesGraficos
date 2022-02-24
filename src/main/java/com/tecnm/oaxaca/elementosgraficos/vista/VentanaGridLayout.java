/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class VentanaGridLayout extends JFrame {

    public VentanaGridLayout() {

    }

    public void inicializar() {
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,3));
        //configurarElementos();
        agregarVariosElementos(9);
        this.setVisible(true);
    }

    private void configurarElementos() {
        JButton boton = new JButton("soy un boton");
        JLabel etiqueta = new JLabel("soy una etiqueta");
        this.add(boton);
        this.add(etiqueta);
    }
    
    private void agregarVariosElementos(int cantidadElementos){
        JButton boton = null;
        for (int i = 0; i < cantidadElementos; i++) {
            boton = new JButton(String.valueOf(i));
            this.add(boton);
        }
        JTextField cuadroDeTexto = new JTextField();
        this.add(cuadroDeTexto);
    }

}
