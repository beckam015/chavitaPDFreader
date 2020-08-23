
/**
 * Write a description of class recordatorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recordatorio
{
    // instance variables - replace the example below with your own
    public String texto_recordatorio;
    public String texto_seleccionado;
    public static TextoRepetido textoRepetido;

    /**
     * Constructor for objects of class recordatorio
     */
    public Recordatorio(String texto_recordatorio, String texto_seleccionado)
    {
        this.texto_recordatorio=texto_recordatorio;
        this.texto_seleccionado=texto_seleccionado;        
        this.textoRepetido=new TextoRepetido(this);
    }
    /**
     * ELIMINAR ESOOO
     */
    public TextoRepetido getObjeto()
    {
       
        return this.textoRepetido;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void editaRecordatorio(String texto_recordatorio, String texto_seleccionado)
    {
        this.texto_recordatorio=texto_recordatorio;
        this.texto_seleccionado=texto_seleccionado;
        this.textoRepetido=new TextoRepetido(this);
    }
}
