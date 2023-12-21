package logica.flechasdecorator;

public class ConectorBase extends Conector {
    private int tipo = 4;
    private int x, y, x2, y2;
    @Override
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
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

    /**recibe el segunda coordenada de la clase dibujada
     * @param x2: Ancho de la clase
     */
    public void setX2(int x2){
        this.x2 = x2;
    }

    /**recibe la altura de la clase dibujada
     * @param y2: Altura de la clase
     */
    public void setY2(int y2){
        this.y2 = y2;
    }

    /**@return coordenada x
     */
    public int getX(){
        return x;
    }

    /**@return segunda coordenada x
     */
    public int getX2(){
        return x2;
    }
    /**@return segunda coordenada y
     */
    public int getY2(){
        return y2;
    }
    /**@return coordenada y
     */
    public int getY(){
        return y;
    }


}