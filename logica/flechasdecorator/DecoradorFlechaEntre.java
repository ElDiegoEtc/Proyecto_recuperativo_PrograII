package logica.flechasdecorator;

import java.io.Serializable;

public class DecoradorFlechaEntre extends Decorador_Abstracto implements Serializable {

    public DecoradorFlechaEntre(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 6;
        return nuevoTipo;
    }
}
