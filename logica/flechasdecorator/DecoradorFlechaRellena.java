package logica.flechasdecorator;

public class DecoradorFlechaRellena extends Decorador_Abstracto {

    public DecoradorFlechaRellena(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 1;
        return nuevoTipo;
    }
}
