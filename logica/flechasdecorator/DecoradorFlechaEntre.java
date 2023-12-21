package logica.flechasdecorator;

public class DecoradorFlechaEntre extends Decorador_Abstracto {

    public DecoradorFlechaEntre(Conector conector) {
        super(conector);
    }

    @Override
    public int getTipo() {
        int nuevoTipo = 6;
        return nuevoTipo;
    }
}
