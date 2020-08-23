
/**
 * Con esta clase, el usuario podrá cargar un archivo PDF.
 * No se harán test con esta clase pues depende de la GUI!
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArchivoPDF_GUI
{
    // instance variables - replace the example below with your own
    private String contenidoPDF;
    private Nota nota;
    private Recordatorio recordatorio;
    private PestanaFlashcards pestanaflashcards;
    private FlashCards flashcard;
    public static void main ( String[] args)
    {
        
    }
    
    /**
     * Constructor for objects of class cargarArchivoPDF_GUI
     */
    public ArchivoPDF_GUI(String contenidoPDF)
    {
        // initialise instance variables
        this.contenidoPDF=contenidoPDF;
    }

    /**
     * This method is going to find the file in pdf format.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void buscarArchivo()
    {
        // put your code here
        
    }
    
    /**
     * This method is going to find the file in pdf format.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void buscaraArchivo()
    {
        // put your code here
        
    }
    /**
     * This method is going to find the file in pdf format.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Nota crearNota(String textoNota, int ubicacionX, int ubicacionY, int pagina)
    {
        return this.nota= new Nota(textoNota,ubicacionX,ubicacionY,pagina);
        
    }
    /**
     * This method is going to find the file in pdf format.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void eliminarNota()
    {
        this.nota=null;
        
    }
        /**
     * This method is going to find the file in pdf format.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Recordatorio crearRecordatorio(String texto_recordatorio, String texto_seleccionado)
    {
       return this.recordatorio= new Recordatorio(texto_recordatorio, texto_seleccionado);
        
    }
    /**
     * This method is going to find the file in pdf format.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void eliminarRecordatorio()
    {
        this.recordatorio=null;
        
    }
}
