package logica.flechasdecorator;

import java.io.Serializable;

public class DecoradorFlechaRellena extends Decorador_Abstracto implements Serializable {

    public DecoradorFlechaRellena(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 1;
        return nuevoTipo;
    }
}
