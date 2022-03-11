/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.elementosgraficos.vista;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MarcoBotonOpcion extends JFrame 
{
   private JTextField campoTexto; // se utiliza para mostrar los cambios en el tipo de letra
   private Font tipoLetraSimple; // tipo de letra para texto simple
   private Font tipoLetraNegrita; // tipo de letra para texto en negrita
   private Font tipoLetraCursiva; // tipo de letra para texto en cursiva
   private Font tipoLetraNegritaCursiva; // tipo de letra para texto en negrita y cursiva
   private JRadioButton simpleJRadioButton; // selecciona texto simple
   private JRadioButton negritaJRadioButton; // selecciona texto en negrita
   private JRadioButton cursivaJRadioButton; // selecciona texto en cursiva
   private JRadioButton negritaCursivaJRadioButton; // negrita y cursiva
   private ButtonGroup grupoOpciones; // grupo de botones que contiene los botones de opci�n

   // El constructor de MarcoBotonOpcion agrega los objetos JRadioButton a JFrame
   public MarcoBotonOpcion()
   {
      super( "Prueba de RadioButton" );
      setLayout( new FlowLayout() ); // establece el esquema del marco

      campoTexto = new JTextField( "Observe el cambio en el estilo del tipo de letra", 28 );
      add( campoTexto ); // agrega campoTexto a JFrame

      // crea los botones de opci�n
      simpleJRadioButton = new JRadioButton( "Simple", true );
      negritaJRadioButton = new JRadioButton( "Negrita", false );
      cursivaJRadioButton = new JRadioButton( "Cursiva", false );
      negritaCursivaJRadioButton = new JRadioButton( "Negrita/Cursiva", false );
      add( simpleJRadioButton ); // agrega bot�n simple a JFrame
      add( negritaJRadioButton ); // agrega bot�n negrita a JFrame
      add( cursivaJRadioButton ); // agrega bot�n cursiva a JFrame
      add( negritaCursivaJRadioButton ); // agrega bot�n negrita y cursiva

      // crea una relaci�n l�gica entre los objetos JRadioButton
      grupoOpciones = new ButtonGroup(); // crea ButtonGroup
      grupoOpciones.add( simpleJRadioButton ); // agrega simple al grupo
      grupoOpciones.add( negritaJRadioButton ); // agrega negrita al grupo
      grupoOpciones.add( cursivaJRadioButton ); // agrega cursiva al grupo
      grupoOpciones.add( negritaCursivaJRadioButton ); // agrega negrita y cursiva

      // crea objetos tipo de letra
      tipoLetraSimple = new Font( "Serif", Font.PLAIN, 14 );
      tipoLetraNegrita = new Font( "Serif", Font.BOLD, 14 );
      tipoLetraCursiva = new Font( "Serif", Font.ITALIC, 14 );
      tipoLetraNegritaCursiva = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
      campoTexto.setFont( tipoLetraSimple ); // establece tipo letra inicial a simple
      
      // registra eventos para los objetos JRadioButton
      simpleJRadioButton.addItemListener( 
         new ManejadorBotonOpcion( tipoLetraSimple ) );
      negritaJRadioButton.addItemListener(
         new ManejadorBotonOpcion( tipoLetraNegrita ) );
      cursivaJRadioButton.addItemListener( 
         new ManejadorBotonOpcion( tipoLetraCursiva ) );
      negritaCursivaJRadioButton.addItemListener( 
         new ManejadorBotonOpcion( tipoLetraNegritaCursiva ) );
         setVisible(true);
   } // fin del constructor de MarcoBotonOpcion

   // clase interna privada para manejar eventos de botones de opci�n
   private class ManejadorBotonOpcion implements ItemListener 
   {
      private Font tipoLetra; // tipo de letra asociado con este componente de escucha

      public ManejadorBotonOpcion( Font f )
      {
         tipoLetra = f; // establece el tipo de letra de este componente de escucha
      } // fin del constructor ManejadorBotonOpcion
           
      // maneja los eventos de botones de opci�n
      public void itemStateChanged( ItemEvent evento )
      {
         campoTexto.setFont( tipoLetra ); // establece el tipo de letra de campoTexto
      } // fin del m�todo itemStateChanged
   } // fin de la clase interna privada ManejadorBotonOpcion
} // fin de la clase MarcoBotonOpcion 
