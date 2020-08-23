import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Esta clase se encarga de identificar y recordar los términos sobre los cuales
 * se crean los recordatorios.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextoRepetido
{
    // instance variables - replace the example below with your own
    public static String texto_seleccionado;
    public static ColorResaltado color;
    //private ColorResaltado colorresaltado;
    
    
    public static void main ( String[] args)
    {
        
    }

    /**
     * Constructor for objects of class TextoRepetido
     */
    public TextoRepetido(Recordatorio recordatorio)
    {
        // initialise instance variables
        String entradaTeclado = "";
        System.out.println("Escriba el color");
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        String color = entradaEscaner.nextLine ();
        this.texto_seleccionado=recordatorio.texto_seleccionado;
        ubicarTextoEnPdf(color);
    }
    /**
     * Constructor for objects of class TextoRepetido
     */
    public void ubicarTextoEnPdf(String color)
    {
        System.out.println("Ubicando texto...");       
        String ubicacionTexto="112344";        
        resaltar(color , ubicacionTexto);
        
        
    }
    /**
     * Constructor for objects of class TextoRepetido
     */
    public ColorResaltado resaltar(String color, String ubicacionTexto)
    {
        return this.color= new ColorResaltado(color,texto_seleccionado,ubicacionTexto);
        
    }
    /**
     * Constructor for objects of class TextoRepetido
     */
    public String getTexto_seleccionado()
    {
        return texto_seleccionado;
        
    }
    

}
