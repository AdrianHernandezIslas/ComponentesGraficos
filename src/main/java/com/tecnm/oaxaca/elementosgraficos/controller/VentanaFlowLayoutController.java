/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.controller;

import com.tecnm.oaxaca.elementosgraficos.vista.VentanaFlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adrian
 */
public class VentanaFlowLayoutController implements ActionListener{
    
    private final VentanaFlowLayout ventanaFlowLayout;

    public VentanaFlowLayoutController(VentanaFlowLayout ventanaFlowLayout) {
        this.ventanaFlowLayout = ventanaFlowLayout;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String texto = ventanaFlowLayout.getCuadroDeTexto().getText();
        ventanaFlowLayout.getEtiqueta().setText(texto);
        
        /*String texto = ventanaFlowLayout.getCuadroDeTexto().getText();
        String alReves = new StringBuilder(texto).reverse().toString();
        JOptionPane.showMessageDialog(null,"Tu escribiste:\n".concat(alReves.equalsIgnoreCase(texto)?"Simon si son":"nel no son"));
        */
    }
    
}
