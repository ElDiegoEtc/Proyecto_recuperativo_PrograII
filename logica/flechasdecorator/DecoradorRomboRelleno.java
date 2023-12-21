package logica.flechasdecorator;

public class DecoradorRomboRelleno extends Decorador_Abstracto {

    public DecoradorRomboRelleno(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 5;
        return nuevoTipo;
    }
}
