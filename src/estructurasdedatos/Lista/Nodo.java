/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.Lista;

/**
 *
 * @author n00bDr01d
 */
public class Nodo {
    //Campos de la clase Nodo
    private Nodo enlaceSiguente;
    private Object dato;

    /**
     * Constructor de la clase nodo 
     */
    public Nodo() {
        enlaceSiguente = null;
        dato= null;
    }
    
    /**
     * Método que devueve el enlace del nodo siguiente
     * @return devielve el enlace al nodo siguiente
     */
    public Nodo getEnlaceSiguente() {
        return enlaceSiguente;
    }

    /**
     * Método que establece el enlace al siguiente nodo
     * @param enlaceSiguente 
     * @
     */
    public void setEnlaceSiguente(Nodo enlaceSiguente) {
        this.enlaceSiguente = enlaceSiguente;
    }

    /**
     * Metodo que devuelve el objeto o dato contenido en el nodo
     * @return dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * Establece el valor o dato contenido en el nodo
     * @param dato 
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

}
