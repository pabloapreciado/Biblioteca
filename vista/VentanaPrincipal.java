package vista;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    //public PanelResultados miPanelResultado;
    private Color qcolor= new Color(220, 255, 209);
    private Color wcolor= new Color(209, 209, 209 );
    private Font fuente= new Font("Monospaced", java.awt.Font.BOLD, 25);

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,380,190);
        miPanelEntradaDatos.setBackground(qcolor);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,380,60);
        miPanelOperaciones.setBackground(wcolor);
        add(miPanelOperaciones);
        
        //Creación y adición del PanelOperaciones
        
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(9,290,380,180);
        add(miPanelResultados);
        

        
        //Caracteristicas de la ventana
        setTitle("Biblioteca");
        setSize(400,500);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
}