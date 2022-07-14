package modelo;

public class Libro 
{
    //--------------------------
    //Atributos
    //-------------------------

    public String titulo;
    public String autor;
    public int aedicion;
    public String lujo;

    
    //--------------------------
    //Métodos
    //--------------------------
    
   
    //Constructor
    public Libro(String titulo, String autor, int aedicion, String lujo)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.aedicion = aedicion;
        this.lujo = lujo;
        
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
     public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    } 
    public int getAedicion() {
        return aedicion;
    }

    public void setAedicion(int aedicion) {
        this.aedicion = aedicion;
    }

    public String getLujo() {
        return lujo;
    }

    public void setLujo(String lujo) {
        this.lujo = lujo;
    }

    public Libro(Libro pb)
    {
        this.titulo = pb.getNombreLibro();
        this.autor = pb.getNombreAutores();
        this.aedicion = (int) pb.getAñoEdicion();
        this.lujo = pb.getEdicionLujo();
    }

    //Metodos de acceso
    public String getNombreLibro() {
        return titulo;
    }

    public void setNombreLibro(String nombreLibro) {
        this.titulo = nombreLibro;
    }
    public String getNombreAutores() {
        return autor;
    }

    public void setNombreAutores(String nombreAutores) {
        this.autor = nombreAutores;
    }
    public int getAñoEdicion() {
        return aedicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.aedicion = añoEdicion;
    }
    public String getEdicionLujo() {
        return lujo;
    }

    public void setEdicionLujo(String edicionLujo) {
        this.lujo = edicionLujo;
    }
    
    //________

    public String toString()
    {
        return "Información del libro: "+ "\n✓ El titulo del libro es : " + titulo +"\n✓ El autor es: " + autor 
        + "\n✓ El año de la edicion del libro es: "+ aedicion + "\n✓ La colección es : "+ lujo; 
    }
}