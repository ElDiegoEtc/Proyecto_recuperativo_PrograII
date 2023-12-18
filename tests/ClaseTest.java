package tests;
import logica.clasesdecorator.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClaseTest {

    // Caso de prueba 1
    @Test
    public void testComponenteBaseModulo() {
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        assertArrayEquals(new String[]{"ComponenteBaseTitulo"}, componenteBase.modulo());
    }

    // Caso de prueba 2
    @Test
    public void testClaseAtributoModulo() {
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        Clase claseAtributo = new ClaseAtributo(componenteBase, "atributo");
        assertArrayEquals(new String[]{"ComponenteBaseTitulo", "atributo"}, claseAtributo.modulo());
    }

    // Caso de prueba 3
    @Test
    public void testClaseMetodoModulo() {
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        Clase claseMetodo = new ClaseMetodo(componenteBase, "metodo");
        assertArrayEquals(new String[]{"ComponenteBaseTitulo", "metodo"}, claseMetodo.modulo());
    }

    // Caso de prueba 4
    @Test
    public void testDecoradorCompuestoModulo() {
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        Clase claseAtributo = new ClaseAtributo(componenteBase, "atributo");
        Clase claseMetodo = new ClaseMetodo(claseAtributo, "metodo");

        assertArrayEquals(new String[]{"ComponenteBaseTitulo", "atributo", "metodo"}, claseMetodo.modulo());
    }

    // Caso de prueba 5
    @Test
    public void testVariosAtributosYMetodos() {
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        Clase claseAtributo1 = new ClaseAtributo(componenteBase, "atributo1");
        Clase claseAtributo2 = new ClaseAtributo(claseAtributo1, "atributo2");
        Clase claseMetodo1 = new ClaseMetodo(claseAtributo2, "metodo1");
        Clase claseMetodo2 = new ClaseMetodo(claseMetodo1, "metodo2");

        assertArrayEquals(
                new String[]{"ComponenteBaseTitulo", "atributo1", "atributo2", "metodo1", "metodo2"},
                claseMetodo2.modulo()
        );
    }

    // Caso de prueba 6
    @Test
    public void testComponenteBaseModuloNoVacio() {
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        assertFalse(componenteBase.modulo().length == 0);
    }

    // Caso de prueba 7
    @Test
    public void testClaseAtributoModuloNoVacio() {
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        Clase claseAtributo = new ClaseAtributo(componenteBase, "atributo");
        assertFalse(claseAtributo.modulo().length == 0);
    }

    // Caso de prueba 8
    @Test
    public void testClaseMetodoModuloNoVacio() {
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        Clase claseMetodo = new ClaseMetodo(componenteBase, "metodo");
        assertFalse(claseMetodo.modulo().length == 0);
    }

    // Caso de prueba 9
    @Test
    public void testDecoradorCompuestoModuloNoVacio() {
        Clase componenteBase = new ComponenteBase("ComponenteBaseTitulo");
        Clase claseAtributo = new ClaseAtributo(componenteBase, "atributo");
        Clase claseMetodo = new ClaseMetodo(claseAtributo, "metodo");
        assertFalse(claseMetodo.modulo().length == 0);
    }
}
