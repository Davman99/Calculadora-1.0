/* Principal.java 15/03/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package Calculadora;


import Calculadora.gui.Interfaz;


/**
 * La clase principal llama a la interfaz.
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.0
 */
public class Principal {

    /**
     * llama a la interfaz y la muestra al usuario
     */
    public static void main(String[] args) {
        Interfaz ventana = new Interfaz();
        ventana.setVisible(true);  
    }
   
}

