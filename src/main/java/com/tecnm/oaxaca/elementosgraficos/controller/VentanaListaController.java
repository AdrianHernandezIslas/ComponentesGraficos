/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.controller;

import com.tecnm.oaxaca.elementosgraficos.vista.VentanaLista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ListModel;

/**
 *
 * @author Adrian
 */
public class VentanaListaController implements ActionListener{
    
    private VentanaLista ventana;

    public VentanaListaController(VentanaLista ventana) {
        this.ventana = ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ListModel modelo = ventana.getListaNombre().getModel();
    
    }
    
}
