package logica.flechasdecorator;

public class DecoradorFlechaNOrellena extends Decorador_Abstracto {

    public DecoradorFlechaNOrellena(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 2;
        return nuevoTipo;
    }
}
