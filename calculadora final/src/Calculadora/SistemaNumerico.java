/* Principal.java 15/03/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package Calculadora;

/**
 *funcion abstract que recoge los datos y los proporciona segunel sistema numerico seleciionado
 * numeros decimales.
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.0
 */
public abstract class SistemaNumerico {
    
    public abstract int convertirADecimal(String valor);
    
    public abstract String convertirASistema(int valor);
    
}
