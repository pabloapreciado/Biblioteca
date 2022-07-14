package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaPrincipal;
import modelo.Libro;

public class Controlador implements ActionListener
{
    
        //------------
        // Atributos
        //------------
    
        private VentanaPrincipal vista;
        private Libro modelo;
    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public Controlador(VentanaPrincipal pVista, Libro pModelo)
        {
            this.vista = pVista;
            this.modelo= pModelo;
            this.vista.miPanelOperaciones.btHallar.addActionListener(this);
            this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);      
        }
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            // Identificar el comando generado [hallar,borrar, salir]
            String comando = ae.getActionCommand();
    if(comando.equals("Salir"))
            {
                System.exit(0);
            }
            
            if(comando.equals("Borrar"))
            {
                this.vista.miPanelEntradaDatos.borrar();
                this.vista.miPanelResultados.borrarDatos();
            }
    
            if(comando.equals("Añadir"))
            {
                modelo.setNombreLibro(vista.miPanelEntradaDatos.getColor());
                modelo.setNombreAutores(vista.miPanelEntradaDatos.getPosX());
                modelo.setAñoEdicion(Integer.parseInt(vista.miPanelEntradaDatos.getPosD()));
                modelo.setEdicionLujo(vista.miPanelEntradaDatos.getPosY());
                vista.miPanelResultados.mostrarResultados(modelo);
            }
        }
}