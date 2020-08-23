

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RecordatorioTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RecordatorioTest
{
    /**
     * Default constructor for test class RecordatorioTest
     */
    public RecordatorioTest()
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
    public void get_texto_recordatorio()
    {
        Recordatorio recordat1 = new Recordatorio("Probando", "si sirve");
        assertEquals("si sirve", recordat1.getTextoSeleccionado());
        recordat1.editaRecordatorio("este tambien", "sirve");
        assertEquals("sirve", recordat1.getTextoSeleccionado());
    }
}

