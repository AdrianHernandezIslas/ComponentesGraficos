/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Adrian
 */
public class VentanaPanelController implements ActionListener{
    private final String PIN = "5678";
    private String inputClave = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton)e.getSource();
        inputClave += boton.getText();
        if(inputClave.length() == 4){
            if(PIN.equals(inputClave)){
                System.out.println("Simon si eres tu :P");
            }else{
                System.out.println("Nel, intenta de nuevo");
                inputClave = "";
            }
        }
    }
    
}
