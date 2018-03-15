/* Principal.java 15/03/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package Calculadora;

/**
 *funcion que recoge los valores convertidos y realiza los operaciones con los
 * numeros decimales.
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.0
 */
public class Calculadora {
    int valor1;
    int valor2;
    int resultado;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    /**
     * suma los valores
     */
    public void suma(){
        resultado = valor1 + valor2;
    }
    /**
     * resta los valores
     */
    public void resta(){
        resultado = valor1 - valor2;
    }
    /**
     * multiplica los valores
     */
    public void multiplicacion (){
        resultado = valor1 * valor2;
    }
    /**
     * division los valores
     */
    public void division (){
        resultado = valor1 / valor2;
    }
    
}
