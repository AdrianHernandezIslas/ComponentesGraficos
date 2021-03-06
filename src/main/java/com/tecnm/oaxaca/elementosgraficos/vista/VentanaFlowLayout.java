/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import com.tecnm.oaxaca.elementosgraficos.controller.VentanaFlowLayoutController;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class VentanaFlowLayout extends JFrame{
    private JTextField cuadroDeTexto;
    private JTextArea cuadroAreaTexto;
    private JLabel etiqueta;
    private JRadioButton radio;
    
    public void inicializar(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        configurarElementos();
        this.setVisible(true);
    }
    
    private void configurarElementos(){
        JButton boton = new JButton("Confesar");
        VentanaFlowLayoutController controlladorEscuchador = new VentanaFlowLayoutController(this);
        boton.addActionListener(controlladorEscuchador);
        
        etiqueta = new JLabel("Escribe el texto a evaluar");
        cuadroDeTexto = new JTextField(10);
        //JTextField cuadroDeTexto2 = new JTextField(45);
        
        radio = new JRadioButton("Habilidar",false);
        //cuadroAreaTexto = new JTextArea(20, 20);
        
        this.add(radio);
        this.add(etiqueta);
        this.add(cuadroDeTexto);
        this.add(boton);
        //this.add(cuadroAreaTexto);
        //this.add(cuadroDeTexto2);
    }

    public JRadioButton getRadio() {
        return radio;
    }

    public JTextField getCuadroDeTexto() {
        return cuadroDeTexto;
    }

    public JTextArea getCuadroAreaTexto() {
        return cuadroAreaTexto;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }
    
    
}

