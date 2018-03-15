/* Principal.java 15/03/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package Calculadora;

/**
 *funcion que convierte los string decimal a decimal y los decimal a string decimal
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.0
 */
public class SistemaDecimal extends SistemaNumerico {
    @Override
    public int convertirADecimal(String valor) {
         return Integer.valueOf(valor, 10);
    }

    @Override
    public String convertirASistema(int valor) {
        return Integer.toString(valor);
    }
    
}
