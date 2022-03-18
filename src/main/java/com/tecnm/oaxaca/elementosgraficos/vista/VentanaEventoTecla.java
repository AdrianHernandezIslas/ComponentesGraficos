/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import com.tecnm.oaxaca.elementosgraficos.controller.VentanaEventoTeclaController;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class VentanaEventoTecla extends Ventana{
    
    private JTextField cuadroText;

    public VentanaEventoTecla() {
        super(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void configurarComponentes() {
        cuadroText = new JTextField(10);
        cuadroText.addKeyListener(new VentanaEventoTeclaController());
        cuadroText.setEditable(true);
        cuadroText.setText("");
        this.add(cuadroText);
    }
    
}
