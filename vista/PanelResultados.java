/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import modelo.Libro;

/**
 *
 * @author NESTOR JESUS PAEZ
 */
public class PanelResultados extends JPanel
{
    /*
    Elementos del panel (atributos)
    */
    private JTextArea taResultado;
    private JScrollPane spResultado;
    
    /*
    Método constructor de panel
    */
    public PanelResultados()
    {
        /*
        Definición contenedor del panel
        */
        setLayout(null);
        
        /*
        Definición color del panel
        */
        setBackground(Color.WHITE);
        
        /*
        Definición borde y titulo del panel
        */
        TitledBorder borde = BorderFactory.createTitledBorder("RESULTADOS");
        borde.setTitleColor(Color.red);
        setBorder(borde);
        
        /*
        Area de texto y scroll para el resultado
        */
        taResultado = new JTextArea("Aqui aparecerá el resultado\n");
        taResultado.setFont(new Font("Arial",Font.BOLD,15));
        taResultado.setForeground(Color.black);
        
        spResultado = new JScrollPane(taResultado);
        add(spResultado);
        spResultado.setBounds(20,20,380,150);
          
    }
    
    //Metodo de refresco de datos y resultados
    public void mostrarResultados(Libro modelo)
    {
        taResultado.append(modelo + "\n");
    }
    
    //Metodo para borrar los datos
    public void borrarDatos()
    {
        taResultado.setText("");
    }
}
