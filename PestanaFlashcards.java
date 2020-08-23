import java.util.HashMap;
/**
 * El usuario podrá acceder a esta pestana para visualizar las Flashcards 
 * ya creadas, editarlas y eliminarlas. También podrá crear Flashcards nuevas.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PestanaFlashcards
{
    // instance variables - replace the example below with your own

    public FlashCards flashcards;
    public static void main ( String[] args)
    {
        
    }
    
    /**
     * Constructor for objects of class PestanaFlashcards
     */
    public PestanaFlashcards()
    {
        this.flashcards = new FlashCards();                
    }
    
    public void mostrar_Flashcards()
    {
        System.out.println( this.flashcards.getAllFlashCards() );
    }   
    public void crear_Flashcards(String key,String value)
    {
        this.flashcards.putValue(key,value);
    }   

    }
