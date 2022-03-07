/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import com.tecnm.oaxaca.elementosgraficos.controller.VentanaFlowLayoutController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class VentanaBorderLayout extends JFrame {

    private JTextField cuadroDeTexto;
    private JTextArea cuadroAreaTexto;

    public void inicializar() {
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        configurarElementos();
        this.setVisible(true);
    }

    private void configurarElementos() {
        JButton boton = new JButton("Confesar");

        JLabel etiqueta = new JLabel("Escribe el texto a evalular");
        cuadroDeTexto = new JTextField(10);
        //JTextField cuadroDeTexto2 = new JTextField(45);

        cuadroAreaTexto = new JTextArea(20, 20);
        this.add(etiqueta,BorderLayout.NORTH);
        this.add(cuadroDeTexto,BorderLayout.SOUTH);
        this.add(boton,BorderLayout.CENTER);
        this.add(cuadroAreaTexto,BorderLayout.EAST);
        //this.add(cuadroDeTexto2);
    }
}
