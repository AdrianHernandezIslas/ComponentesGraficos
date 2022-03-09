/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.controller;

import com.tecnm.oaxaca.elementosgraficos.vista.VentanaCheckBox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Adrian
 */
public class VentanaCheckBoxController implements ItemListener {

    private final VentanaCheckBox ventanaCheckBox;
    private int resultado = 0;

    //le juro por dios que este es mi contructor
    public VentanaCheckBoxController(VentanaCheckBox ventanaCheckBox) {
        this.ventanaCheckBox = ventanaCheckBox;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        if (e.getSource() == ventanaCheckBox.getCheckColorAzul() && ventanaCheckBox.getCheckColorAzul().isSelected() ) {
            resultado += 100;
        }else if(e.getSource() == ventanaCheckBox.getCheckColorAzul() && !ventanaCheckBox.getCheckColorAzul().isSelected() ){
            resultado -= 100;
        }

        if (e.getSource() == ventanaCheckBox.getCheckColorVerde() && ventanaCheckBox.getCheckColorVerde().isSelected()) {
            
            resultado += 50;
        }

        System.out.println("ejemplo\notra cosa");
        ventanaCheckBox.getAreaTexto().setText(String.valueOf(resultado));
    }

}
