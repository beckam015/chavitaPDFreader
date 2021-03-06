import java.util.HashMap;
/**
 * Esta clase permite crear una Flashcard.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlashCards
{
    // instance variables - replace the example below with your own
    public static HashMap<String,String> FlashCards;
    
    public static void main ( String[] args)
    {
        
    }
    
    /**
     * Constructor for objects of class flashCard
     */
    public FlashCards()
    {
        // initialise instance variables
       this.FlashCards = new HashMap<String,String>();        
        
    }
    /**
     * Insert a new FlashCard
     */
    public void putValue(String key,String value)
    {
        FlashCards.put(key, value);
    }
    /**
     * Return the value of the FlashCard
     */
    public String getValue(String key)
    {
        return (FlashCards.get(key));
    }
    /**
     * Return the value of the FlashCard
     */
    public String getAllFlashCards()
    {   String contenido ="";
        for (String i : FlashCards.keySet()) {
            contenido = contenido + ("key: " + i + " value: " + FlashCards.get(i));
        }
        
        return contenido;
    }
     /**
     * Return the value of the FlashCard
     */
    public void removeFlashCard(String key)
    {
        FlashCards.remove(key);
    }
     /**
     * Return the value of the FlashCard
     */
    public void modificarFlashCard(String key,String value)
    {
        boolean noExiste= true;
        for (String i : FlashCards.keySet()) {
            if(i.equals(key)){
                noExiste=false;
                FlashCards.put(key, value);
                break;
            }
        }
        if(noExiste){
        System.out.println("No se encontro esa flashcard");
        }
    }
}
