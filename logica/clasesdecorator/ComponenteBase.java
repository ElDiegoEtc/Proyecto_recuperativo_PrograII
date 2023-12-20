package logica.clasesdecorator;

import java.io.Serializable;

/**
 * Clase concreta que implementa la interfaz Clase y representa un componente base en el contexto UML.
 */
public class ComponenteBase implements Clase, Serializable {

    private String titulo;


    /**
     * Constructor que inicializa el componente base con un título.
     *
     * @param titulo Título del componente base.
     */
    public ComponenteBase(String titulo) {
        this.titulo = titulo;
    }

    /**
     * {@inheritDoc}
     *
     * @return Un array de cadenas que representa los componentes base.
     */
    @Override
    public String[] modulo() {
        return new String[]{titulo};
    }
}