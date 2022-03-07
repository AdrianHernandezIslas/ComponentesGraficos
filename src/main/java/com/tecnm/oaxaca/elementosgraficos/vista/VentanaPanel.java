/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import com.tecnm.oaxaca.elementosgraficos.controller.VentanaPanelController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class VentanaPanel extends JFrame {

    private JPanel panelArriba;
    private JPanel panelAbajo;

    public void inicializar() {
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        configurarElementos();
        this.setVisible(true);
    }

    private void configurarElementos() {
        configurarPaneles();
        agragarElementosPanelArriba();
        agregarElementosPanelAbajo();
        this.add(panelArriba,BorderLayout.NORTH);
        this.add(panelAbajo,BorderLayout.CENTER);

    }
    
    private void configurarPaneles(){
        panelArriba = new JPanel();
        panelArriba.setLayout(new FlowLayout());
        
        panelAbajo = new JPanel();
        panelAbajo.setLayout(new GridLayout(3,3));
    }
    
    private void agragarElementosPanelArriba(){
        JLabel etiqueta = new JLabel("Nombre");
        JTextField cuadritoTexto = new JTextField(15);
        JButton bonton = new JButton("Saludar");
        
        panelArriba.add(etiqueta);
        panelArriba.add(cuadritoTexto);
        panelArriba.add(bonton);
    }
    
    private void agregarElementosPanelAbajo(){
        JButton boton = null;
        VentanaPanelController controlador  = new VentanaPanelController();
        for (int i = 1; i < 10; i++) {
            boton = new JButton(String.valueOf(i));
            boton.addActionListener(controlador);
            panelAbajo.add(boton);
        }
        
    }
}
