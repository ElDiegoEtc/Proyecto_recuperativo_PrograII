package logica.flechasdecorator;

import java.io.Serializable;

public class DecoradorFlechaNOrellena extends Decorador_Abstracto implements Serializable {

    public DecoradorFlechaNOrellena(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 2;
        return nuevoTipo;
    }
}
