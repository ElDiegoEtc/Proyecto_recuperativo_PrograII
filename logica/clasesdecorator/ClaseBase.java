package logica.clasesdecorator;

public class ClaseBase extends Clase {
    private String[] modulo = {"<titulo>"};
    private int x, y, width, heigth;
    @Override
    public String[] getModulo() {
        return modulo;
    }
    public void setModulo(String[] modulo) {
        this.modulo = modulo;
    }

    /**recibe la coordenada de la clase dibujada
     * @param x: Coordenada x de la clase
     */
    public void setX(int x) {
        this.x = x;
    }

    /**recibe la coordenada de la clase dibujada
     * @param y: Coordenada x de la clase
     */
    public void setY(int y){
        this.y= y;
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
    public int getX(){
        return x;
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
    public int getY(){
        return y;
    }


}