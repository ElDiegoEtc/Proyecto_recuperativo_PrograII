package logica.flechasdecorator;

import java.io.Serializable;

public class DecoradorRomboRelleno extends Decorador_Abstracto implements Serializable {

    public DecoradorRomboRelleno(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 5;
        return nuevoTipo;
    }
}
