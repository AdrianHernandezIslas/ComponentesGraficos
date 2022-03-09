/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import com.tecnm.oaxaca.elementosgraficos.controller.VentanaListaController;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;

/**
 *
 * @author Adrian
 */
public class VentanaLista extends Ventana{
    
    private JList listaNombre;
    private JButton botonRecuperar;
    
    public VentanaLista() {
        super(new BorderLayout());
        this.setVisible(true);
    }

    @Override
    public void configurarComponentes() {
        String nombres[] = {"Adrian","Juan","Pedro","Roberto"};
        listaNombre = new JList(nombres);
        this.add(listaNombre,BorderLayout.WEST);
        
        botonRecuperar = new JButton("Recuperar");
        botonRecuperar.addActionListener(new VentanaListaController(this));
        this.add(botonRecuperar,BorderLayout.NORTH);
        
        JLabel etiqueta = new JLabel("soy una etiqueta");
        this.add(etiqueta,BorderLayout.CENTER);
    }

    public JList getListaNombre() {
        return listaNombre;
    }
 
}
