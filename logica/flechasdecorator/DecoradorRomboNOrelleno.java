package logica.flechasdecorator;

import java.io.Serializable;

public class DecoradorRomboNOrelleno extends Decorador_Abstracto implements Serializable {

    public DecoradorRomboNOrelleno(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 3;
        return nuevoTipo;
    }
}
