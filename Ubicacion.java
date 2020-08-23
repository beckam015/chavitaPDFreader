
/**
 * Esta clase se encarga de encontrar las coordenadas correspondientes para que
 * la nota pueda ser ubicada en la posición elegida por el usuario dentro del
 * archivo PDF.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ubicacion
{
    // instance variables - replace the example below with your own
    
    private int x;
    private  int y;
    private  int pagina;
    public static void main ( String[] args)
    {
        
    }
    
    /**
     * Constructor for objects of class Ubicacion
     */
    public Ubicacion(int x, int y, int pagina)
    {
        this.x=x;
        this.y=y;
        this.pagina=pagina;
        
    }
    
    public String getUbicacion(){
        return ""+this.x+" "+this.y+" "+this.pagina;
    }
}
