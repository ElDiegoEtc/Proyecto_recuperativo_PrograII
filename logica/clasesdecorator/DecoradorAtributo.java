package logica.clasesdecorator;

import java.io.Serializable;

public class DecoradorAtributo extends DecoradorAbstracto implements Serializable {

    public DecoradorAtributo(Clase clase) {
        super(clase);
    }

    @Override
    public String[] getModulo() {
        String[] moduloBase = super.getModulo();
        String[] nuevoModulo = new String[moduloBase.length + 1];
        System.arraycopy(moduloBase, 0, nuevoModulo, 0, moduloBase.length);
        nuevoModulo[moduloBase.length] = "<Atributos>";
        return nuevoModulo;
    }
}
