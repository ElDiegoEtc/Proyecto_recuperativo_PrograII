package logica.flechasdecorator;

public class DecoradorRomboNOrelleno extends Decorador_Abstracto {

    public DecoradorRomboNOrelleno(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 3;
        return nuevoTipo;
    }
}
