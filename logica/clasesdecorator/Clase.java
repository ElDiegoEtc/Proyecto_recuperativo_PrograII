package logica.clasesdecorator;

import java.io.Serializable;

/**
 * ClaseBase abstracta que implementa la interfaz ClaseBase y actúa como base para los decoradores.
 */
public abstract class Clase implements Serializable {
    public abstract String[] getModulo();;

    public abstract void setX(int x);
    public abstract void setY(int y);
    public abstract void setWidth(int width);
    public abstract void setHeigth(int heigth);
    public abstract int getX();
    public abstract int getWidth();
    public abstract int getHeigth();
    public abstract int getY();

}
