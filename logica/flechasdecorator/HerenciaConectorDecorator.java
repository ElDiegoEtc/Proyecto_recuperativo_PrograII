package logica.flechasdecorator;

import logica.flechasdecorator.Conector;
import logica.flechasdecorator.ConectorDecorator;

/**
 * ClaseBase que representa un decorador para agregar la punta triangular o rombo de herencia a un conector.
 */
public class HerenciaConectorDecorator extends ConectorDecorator {

    /**
     * Constructor que inicializa el decorador con un conector decorado.
     *
     * @param decoratedArrow Conector decorado al que se le añadirá la punta triangular o rombo de herencia.
     */
    public HerenciaConectorDecorator(Conector decoratedArrow) {
        super(decoratedArrow);
    }

    /**
     * {@inheritDoc}
     * Añade la funcionalidad de imprimir un mensaje sobre la adición de la punta triangular o rombo de herencia.
     */
    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo punta triangular o rombo de herencia");
    }

    /**
     * @param relleno true si se debe tener relleno, false de lo contrario.
     */
    @Override
    public void setRelleno(boolean relleno) {

    }
}
