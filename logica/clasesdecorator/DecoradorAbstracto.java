package logica.clasesdecorator;


public abstract class DecoradorAbstracto extends Clase {
    protected Clase clase;

    public DecoradorAbstracto(Clase clase) {
        this.clase = clase;
    }

    @Override
    public String[] getModulo() {
        return clase.getModulo();
    }

    @Override
    public void setX(int x) {
        clase.setX(x);
    }

    @Override
    public void setY(int y) {
        clase.setY(y);
    }

    @Override
    public void setWidth(int width) {
        clase.setWidth(width);
    }

    @Override
    public void setHeigth(int heigth) {
        clase.setHeigth(heigth);
    }

    @Override
    public int getX() {
        return clase.getX();
    }

    @Override
    public int getY() {
        return clase.getY();
    }

    @Override
    public int getWidth() {
        return clase.getWidth();
    }

    @Override
    public int getHeigth() {
        return clase.getHeigth();
    }
}
