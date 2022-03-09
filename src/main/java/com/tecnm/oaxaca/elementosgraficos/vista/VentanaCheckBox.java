/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import com.tecnm.oaxaca.elementosgraficos.controller.VentanaCheckBoxController;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

/**
 *
 * @author Adrian
 */
public class VentanaCheckBox extends Ventana{
    
    private JCheckBox checkColorVerde;
    private JCheckBox checkColorRojo;
    private JCheckBox checkColorAzul;
    
    private JTextArea areaTexto;

    public VentanaCheckBox() {
        super(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void configurarComponentes() {
        checkColorVerde = new JCheckBox("Verde");
        checkColorAzul = new JCheckBox("Azul");
        checkColorRojo = new JCheckBox("Rojo");
        
        VentanaCheckBoxController controlador  = new VentanaCheckBoxController(this);
        
        checkColorAzul.addItemListener(controlador);
        checkColorRojo.addItemListener(controlador);
        checkColorVerde.addItemListener(controlador);
        
        areaTexto = new JTextArea(10, 10);
        
        this.add(checkColorVerde);
        this.add(checkColorAzul);
        this.add(checkColorRojo);  
        this.add(areaTexto);
        
    }

    public JTextArea getAreaTexto() {
        return areaTexto;
    }

    public JCheckBox getCheckColorVerde() {
        return checkColorVerde;
    }

    public JCheckBox getCheckColorRojo() {
        return checkColorRojo;
    }

    public JCheckBox getCheckColorAzul() {
        return checkColorAzul;
    }
    
    
    
}
