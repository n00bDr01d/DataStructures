/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.Lista;
import java.io.IOException;
/**
 *
 * @author n00bDr01d
 */
public class ListaEnlazada {
    //campos de la clase lista
    private int cantidad;
    private Nodo lista;

    public ListaEnlazada() {
        this.cantidad = 0;
        this.lista = null;
    }
    
    public boolean insertarNodo(Object dato){
        boolean resultado = false;
        Nodo nodoNuevo = new Nodo();
        nodoNuevo.setDato(dato);
        
        if(lista == null){
            nodoNuevo.setEnlaceSiguente(null);
            lista = nodoNuevo;
            resultado = true;
        }else{
            nodoNuevo.setEnlaceSiguente(lista);
            lista = nodoNuevo;
            resultado = true;
        }
        this.cantidad++;
        
        return resultado;
    }

    @Override
    public String toString() {
        String resultado = "";
        Nodo auxiliar = new Nodo();
        auxiliar.setEnlaceSiguente(lista.getEnlaceSiguente());
        auxiliar.setDato(lista.getDato());
        
        do{
            resultado = resultado + auxiliar.getDato().toString() + " -> ";
            //System.out.println(auxiliar.getDato().toString() + " -> ");
            auxiliar = auxiliar.getEnlaceSiguente();
        }while (auxiliar.getEnlaceSiguente() != null) ; 
        resultado = resultado + auxiliar.getDato().toString() + " -> null ";
        return "ListaEnlazada = {" + resultado + '}';
        
    }
    
    
    
}
