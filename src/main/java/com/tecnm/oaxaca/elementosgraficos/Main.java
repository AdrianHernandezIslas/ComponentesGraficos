/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos;

import com.tecnm.oaxaca.elementosgraficos.vista.Ventana;
import com.tecnm.oaxaca.elementosgraficos.vista.VentanaBorderLayout;
import com.tecnm.oaxaca.elementosgraficos.vista.VentanaCheckBox;
import com.tecnm.oaxaca.elementosgraficos.vista.VentanaEventoTecla;
import com.tecnm.oaxaca.elementosgraficos.vista.VentanaFlowLayout;
import com.tecnm.oaxaca.elementosgraficos.vista.VentanaGridLayout;
import com.tecnm.oaxaca.elementosgraficos.vista.VentanaLista;
import com.tecnm.oaxaca.elementosgraficos.vista.VentanaPanel;

/**
 *
 * @author Adrian
 */
public class Main {
    public static void main(String[] args) {
        /*VentanaFlowLayout ventana = new VentanaFlowLayout();
        ventana.inicializar();
        
       
        
        /*VentanaBorderLayout ventana = new VentanaBorderLayout();
        ventana.inicializar();*/
        
        /*VentanaPanel ventana = new VentanaPanel();
        ventana.inicializar();*/
        
        //Ventana ventana = new VentanaCheckBox();
         //VentanaGridLayout ventana2 = new VentanaGridLayout();
        //ventana2.inicializar();
        
        Ventana ventana = new VentanaEventoTecla();
    }
}
