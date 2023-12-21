package logica.flechasdecorator;

import java.io.Serializable;

/**
 * ClaseBase abstracta que implementa la interfaz ClaseBase y actúa como base para los decoradores.
 */
public abstract class Conector implements Serializable {
    public abstract int getTipo();;

    public abstract void setX(int x);
    public abstract void setY(int y);
    public abstract void setX2(int x2);
    public abstract void setY2(int y2);
    public abstract int getX();
    public abstract int getX2();
    public abstract int getY2();
    public abstract int getY();

}
