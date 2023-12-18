package logica.clasesdecorator;

import java.io.Serializable;

/**
 * Clase concreta que implementa la interfaz Clase y representa un componente base en el contexto UML.
 */
public class ComponenteBase implements Clase, Serializable {

    private String titulo;
    private int coordX, coordY, width, heigth;


    /**
     * Constructor que inicializa el componente base con un título.
     *
     * @param titulo Título del componente base.
     */
    public ComponenteBase(String titulo) {
        this.titulo = titulo;
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
    /**@return coordenada y
     */
    public int getCoordY(){
        return coordY;
    }

    /**
     * {@inheritDoc}
     *
     * @return Un array de cadenas que representa los componentes base.
     */
    @Override
    public String[] modulo() {
        return new String[]{titulo};
    }
}