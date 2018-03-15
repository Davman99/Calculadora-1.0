/* Principal.java 15/03/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package Calculadora;

/**
 *funcion que convierte los string binario a decimal y los decimal a string binario
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.0
 */
public class SistemaBinario extends SistemaNumerico{

    @Override
    public int convertirADecimal(String valor) {
        return Integer.valueOf(valor, 2);
    }

    @Override
    public String convertirASistema(int valor) {
        return Integer.toBinaryString(valor);
    }
    
}
