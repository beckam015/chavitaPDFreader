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
    private static String texto_seleccionado;
    private static ColorResaltado color;
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
        System.out.println(color);
        this.texto_seleccionado=recordatorio.texto_seleccionado;
        ubicarTextoEnPdf(color);
    }
    /**
     * Constructor for objects of class TextoRepetido
     */
    public void ubicarTextoEnPdf(String color)
    {
        System.out.println("Ubicando texto...");
        System.out.println("Ubicando texto...");
        System.out.println("Ubicando texto...");        
        String ubicacionTexto="112344";
        for(int i=1;i<=5;i++){
            ubicacionTexto=ubicacionTexto + "1";
            resaltar(color , ubicacionTexto);
        }
        
    }
    /**
     * Constructor for objects of class TextoRepetido
     */
    public void resaltar(String color, String ubicacionTexto)
    {
        this.color=new ColorResaltado(color,texto_seleccionado,ubicacionTexto);
        
    }
    

}
