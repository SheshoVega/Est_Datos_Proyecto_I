/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @authors Denis Rodriguez, Sergio Vega
 */
public class Iterador<T> {
    private Nodo<T> inicio;
    private Nodo<T> actual;

    public Iterador(Lista<T> lista) {
        inicio = actual = lista.getInicio();
    }
    
    public Nodo<T> siguiente(){
        Nodo<T> a;
        a = actual;
	if (actual != null){
            actual = actual.getSiguiente();
	}
	return a;
    }
    public T getDato() {
        return actual.getDato();
    }
    public void setDato(T dat) {
        actual.setDato(dat);
    }
    public void iniciarIte(){
        actual = inicio;
    }
    
}
