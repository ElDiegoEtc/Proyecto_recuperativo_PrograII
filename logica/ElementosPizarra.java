package logica;

import logica.clasesdecorator.Clase;
import logica.clasesdecorator.ClaseBase;
import logica.clasesdecorator.DecoradorAtributo;
import logica.clasesdecorator.DecoradorMetodo;

import java.io.Serializable;
import java.util.ArrayList;

public class ElementosPizarra implements Serializable {
    /** Añade una clase con 2 strings, se activa con el boton 3
     * @param p: Pizarra a la que se le añadira las clase con titulo y campo para atributos
     */
    public void AddClaseAtrbuto(Pizarra p){
        Clase clasebase = new ClaseBase();
        clasebase = new DecoradorAtributo(clasebase);
        p.addClase(clasebase);
    }
    /** Añade una clase con 2 strings, se activa con el boton 4
     * @param p: Pizarra a la que se le añadira las clase con titulo y campo para metodos
     */
    public void AddClaseMetodo(Pizarra p){
        Clase clasebase = new ClaseBase();
        clasebase = new DecoradorMetodo(clasebase);
        p.addClase(clasebase);
    }

    /**
     * Añade una clase con 3 strings, se activa con el boton 6
     *
     * @param p: Pizarra a la que se le añadira las clase Completa
     * @return
     */
    public void AddClaseCompleta(Pizarra p){
        Clase clasebase = new ClaseBase();
        clasebase = new DecoradorAtributo(clasebase);
        clasebase = new DecoradorMetodo(clasebase);
        p.addClase(clasebase);
    }

    public void DeleteElement(){
        
    }

    /** Metodo que sirve para borrar todas las clases y conectores del UML almacenadas en sus arraylists
     * en la pizarra p
     * @param p: instancia de la pizarra donde se borrara sus contenidos
     */
    public void DeleteAll(Pizarra p){
        ArrayList conectores = p.getArrayconectores();
        ArrayList clases = p.getArrayclases();
        for (int i = 0; i < conectores.size(); i++) {
            conectores.remove(i);
        }
        for (int i = 0; i < clases.size(); i++) {
            clases.remove(i);
        }
    }
}
