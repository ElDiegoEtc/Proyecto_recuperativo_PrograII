package logica.flechasdecorator;

import java.io.Serializable;

public abstract class Decorador_Abstracto extends Conector implements Serializable {
    protected Conector conector;

    public Decorador_Abstracto(Conector conector) {
        this.conector = conector;
    }

    @Override
    public int getTipo() {
        return conector.getTipo();
    }

    @Override
    public void setX(int x) {
        conector.setX(x);
    }

    @Override
    public void setY(int y) {
        conector.setY(y);
    }

    @Override
    public void setX2(int x2) {
        conector.setX2(x2);
    }

    @Override
    public void setY2(int y2) {
        conector.setY2(y2);
    }

    @Override
    public int getX() {
        return conector.getX();
    }

    @Override
    public int getY() {
        return conector.getY();
    }

    @Override
    public int getX2() {
        return conector.getX2();
    }

    @Override
    public int getY2() {
        return conector.getY2();
    }
}
