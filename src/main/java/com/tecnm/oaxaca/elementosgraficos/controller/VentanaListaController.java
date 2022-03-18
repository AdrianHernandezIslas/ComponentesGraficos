/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.controller;

import com.tecnm.oaxaca.elementosgraficos.vista.VentanaLista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Adrian
 */
public class VentanaListaController implements ActionListener,ListSelectionListener{
    
    private final VentanaLista ventana;

    public VentanaListaController(VentanaLista ventana) {
        this.ventana = ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       //int indexSelect  = ventana.getListaNombre().getSelectedIndex();
       //String nombres[] = ventana.getNombres();
       ventana.getModeloDatos().addElement("Lo que me traigo  del text fiel");
        //ventana.getEtiqueta().setText(nombres[indexSelect]);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        System.out.println("El valor seleccionado es "+ventana.getListaNombre().getSelectedValue());
    }
    
}
