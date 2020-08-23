
/**
 * Write a description of class Demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fabrica
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Demo
     */
    public Fabrica()
    {
        
        
    }
    public static void main ( String[] args)
    {
        
    }
        /**
         * An example of a method - replace this comment with your own
         * 
         * @param  y   a sample parameter for a method
         * @return     the sum of x and y 
         */
        public Nota iniciaNota()
        {
            return new Nota("Nota para recordar ",255,255,24);
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public PestanaFlashcards iniciaFlashCard()
    {
        return new PestanaFlashcards();
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Recordatorio iniciaRecordatorio()
    {
        return new Recordatorio("texto   "," seleccion");
    }
}
