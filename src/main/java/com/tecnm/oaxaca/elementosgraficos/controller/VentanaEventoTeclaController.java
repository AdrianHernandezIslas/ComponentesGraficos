/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Adrian
 */
public class VentanaEventoTeclaController implements KeyListener {

    private boolean flag;
    
    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("Tecla oprimida" + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char key = e.getKeyChar();
        flag = key == '.';
        if(flag){
            e.consume();
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("Tecla liberada -> " + e.getKeyChar());
    }

}
