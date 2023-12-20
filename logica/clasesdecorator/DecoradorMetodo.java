package logica.clasesdecorator;

public class DecoradorMetodo extends DecoradorAbstracto {

    public DecoradorMetodo(Clase clase) {
        super(clase);
    }

    @Override
    public String[] getModulo() {
        String[] moduloBase = super.getModulo();
        String[] nuevoModulo = new String[moduloBase.length + 1];
        System.arraycopy(moduloBase, 0, nuevoModulo, 0, moduloBase.length);
        nuevoModulo[moduloBase.length] = "<Metodo>";
        return nuevoModulo;
    }
}