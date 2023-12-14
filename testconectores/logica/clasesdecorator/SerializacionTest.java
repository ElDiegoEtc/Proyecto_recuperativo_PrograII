package logica.clasesdecorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class SerializacionTest {

    @Test
    public void testSerializacionDeserializacion() {
        /**
         *Creamos instancia de ComponenteBase
         */
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        /**
         * decoramos con atributos y metodos
         */

        Clase claseAtributo = new ClaseAtributo(componenteBase, "atributo");
        Clase claseMetodo = new ClaseMetodo(claseAtributo, "metodo");
        /**
         * Serializamos
         */

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(claseMetodo);
        } catch (IOException e) {
            fail("Error al serializar: " + e.getMessage());
        }
        /**
         * deserializamos
         */

        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            Clase claseDeserializada = (Clase) ois.readObject();
            /**
             * verificar que al deserializar no sea nulo
             */

            assertNotNull(claseDeserializada);

            /**
             * Verificar que la clase deserializada sea igual al original
              */
            assertArrayEquals(claseMetodo.modulo(), claseDeserializada.modulo());
        } catch (IOException | ClassNotFoundException e) {
            fail("Error al deserializar: " + e.getMessage());
        }
    }
}
