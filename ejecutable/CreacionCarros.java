package ejecutable;

import controlador.Controlador;
import modelo.Libro;
import vista.VentanaPrincipal;

public class CreacionCarros 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Libro miLibro= new Libro(null, null, 0, null);
        Controlador miControlador = new Controlador(miVentana, miLibro);
    }
}