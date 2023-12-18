package tests;

import logica.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * Clase de prueba para verificar el funcionamiento correcto de los decoradores de conectores.
 */

public class ConectorDecoratorTest {
    /**
     * Se utiliza un ByteArrayOutputStream para capturar la salida estándar durante las pruebas.
     */

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    /**
     * Configura la redirección de la salida estándar o esperada antes de ejecutar cada prueba.
     */

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    /**
     * Restaura la salida estándar esperada después de ejecutar cada prueba.
     */

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    /**
     * Prueba para verificar el comportamiento correcto de los decoradores de conectores.
     */

    @Test
    public void testConectorDecorator() {
        /**
         * Primero creamos un conector simple
         */
        Conector simpleConector = new SimpleConector(0, 0, Flecha.SIMPLE, true, 1, 1);
/**
 * Ahora creamos los decoradores
 */
        ConectorDecorator herenciaDecorator = new HerenciaConectorDecorator(simpleConector);
        ConectorDecorator composicionDecorator = new ComposicionConectorDecorator(simpleConector);
        ConectorDecorator asociacionDecorator = new AsociationConectorDecorator(simpleConector);
        ConectorDecorator agregacionDecorator = new AgregationConectorDecorator(simpleConector);
/**
 * Ponemos a prueba el herencia decorator
 */
        herenciaDecorator.draw();
        /**
         *Nos asegurarse de que la salida contiene el mensaje esperado
         */

        assertTrue(systemOut().contains("Añadiendo punta triangular o rombo de herencia"));
        /**
         * ponemos a prueba el decorador de composicion
         */

        composicionDecorator.draw();

        assertTrue(systemOut().contains("Añadiendo rombo o punta triangular de composición"));

        asociacionDecorator.draw();
        assertTrue(systemOut().contains("Añadiendo rombo o punta triangular de Agregación"));

        agregacionDecorator.draw();
        assertTrue(systemOut().contains("Añadiendo punta triangular o rombo de agregación"));
    }

    /**
     *
     * @return para capturar la salida estándar
     */

    private String systemOut() {
        return outContent.toString();
    }
}


