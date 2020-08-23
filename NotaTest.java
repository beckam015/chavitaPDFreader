

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NotaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NotaTest
{
    /**
     * Default constructor for test class NotaTest
     */
    public NotaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void mostrarNota()
    {
        Nota nota1 = new Nota("esta es una nota para estudiar", 133, 133, 4);
        assertEquals("esta es una nota para estudiar", nota1.mostrarNota());
    }

    @Test
    public void editarNota()
    {
        Nota nota1 = new Nota("Esta es una nota que editaremos", 255, 255, 25);
        nota1.editarNota("Esta es la nueva edicion", 256, 256, 26);
        Ubicacion ubicacio1 = nota1.ubicacion;
        assertEquals("256 256 26", ubicacio1.getUbicacion());
        assertEquals("Esta es la nueva edicion", nota1.mostrarNota());
        assertEquals("256 256 26", ubicacio1.getUbicacion());
    }
}


