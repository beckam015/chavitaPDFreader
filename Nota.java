
/**
 * Permite crear, editar y eliminar notas.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nota
{
    // instance variables - replace the example below with your own
   
    private Ubicacion ubicacion;
    private String textoNota;
    public static void main ( String[] args)
    {
        
    }
    
    /**
     * Constructor for objects of class Nota
     */
    public Nota(String textoNota, int ubicacionX, int ubicacionY, int pagina)
    {
        this.textoNota=textoNota;
        this.ubicacion = new Ubicacion(ubicacionX,ubicacionY, pagina);       
    }
    
}
