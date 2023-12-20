package logica.clasesdecorator;

/**
 * Decorador para posiblemente agregar coordenadas a una clase como forma de decoracion adicional.
 */
public class DecoracionCoordenadas extends Decorador {

    private int coordX, coordY, width, heigth;

    public DecoracionCoordenadas(Clase clase, int coordX, int coordY, int width, int heigth){
        super(clase);
        this.coordX = coordX;
        this.coordY = coordY;
        this.width = width;
        this.heigth = heigth;
    }

    /**recibe la coordenada de la clase dibujada
     * @param x: Coordenada x de la clase
     */
    public void setCoordX(int x){
        this.coordX = x;
    }

    /**recibe la coordenada de la clase dibujada
     * @param y: Coordenada x de la clase
     */
    public void setCoordY(int y){
        this.coordY = y;
    }

    /**recibe el ancho de la clase dibujada
     * @param width: Ancho de la clase
     */
    public void setWidth(int width){
        this.width = width;
    }

    /**recibe la altura de la clase dibujada
     * @param heigth: Altura de la clase
     */
    public void setHeigth(int heigth){
        this.heigth = heigth;
    }

    /**@return coordenada x
     */
    public int getCoordX(){
        return coordX;
    }

    /**@return ancho
     */
    public int getWidth(){
        return width;
    }
    /**@return alto
     */
    public int getHeigth(){
        return heigth;
    }
    /**@return coordenada y
     */
    public int getCoordY(){
        return coordY;
    }

    @Override
    public String[] modulo(){
        return super.modulo();
    }
}

