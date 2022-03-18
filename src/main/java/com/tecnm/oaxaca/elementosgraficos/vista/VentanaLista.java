/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;

import com.tecnm.oaxaca.elementosgraficos.controller.VentanaListaController;
import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
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
    private DefaultListModel modeloDatos;
    private JButton botonRecuperar;
    private String nombres[];
    private JLabel etiqueta;
    
    public VentanaLista() {
        super(new BorderLayout());
        this.setVisible(true);
    }

    @Override
    public void configurarComponentes() {
        nombres = new String[]{"Adrian","Juan","Pedro","Roberto"};
        modeloDatos = new DefaultListModel();
        listaNombre = new JList(modeloDatos);
        
        for (String nombre : nombres) {
          modeloDatos.addElement(nombre);
        }


        
        VentanaListaController controllador = new VentanaListaController(this);
        
        listaNombre.addListSelectionListener(controllador);
        this.add(listaNombre,BorderLayout.WEST);
        
        botonRecuperar = new JButton("Recuperar");
        botonRecuperar.addActionListener(controllador);
        this.add(botonRecuperar,BorderLayout.NORTH);
        
        etiqueta = new JLabel("soy una etiqueta");
        this.add(etiqueta,BorderLayout.CENTER);
    }

    public String[] getNombres() {
        return nombres;
    }

    public JList getListaNombre() {
        return listaNombre;
    }

    public DefaultListModel getModeloDatos() {
        return modeloDatos;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }
 
    
    
}
