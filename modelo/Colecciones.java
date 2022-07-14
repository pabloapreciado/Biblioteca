package modelo;

public class Colecciones extends Libro {
    //constructor
    protected String ncoleccion;
    protected int numlibro;
    //

    public Colecciones(String titulo, String autor, int aedicion, String lujo, String ncoleccion, int numlibro)
    {
        super(titulo, autor, aedicion,lujo);
        this.ncoleccion= ncoleccion;
        this.numlibro= numlibro;
    }    

    //metodos
    
}
