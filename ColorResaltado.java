
/**
 * Esta clase se encarga de resaltar el TextoRepetido y de permitir al usuario
 * resaltar términos y texto que considere importante.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ColorResaltado
{
    // instance variables - replace the example below with your own
    private String color;
    private String texto;
    private String posicionEnTexto;
    public static void main ( String[] args)
    {
        
    }
    
    /**
     * Constructor for objects of class ColorResaltado
     */
    public ColorResaltado(String color, String texto, String posicionEnTexto)
    {
        this.color=color;
        this.texto=texto;
        this.posicionEnTexto=posicionEnTexto;      
        resaltarColor();
    }
    
    public void resaltarColor()
    {
       System.out.println("Resaltando texto");
        
    }
    
}
