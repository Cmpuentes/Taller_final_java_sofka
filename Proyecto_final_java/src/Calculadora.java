/**
 * La clase calculadora contiene todas las funciones que
 * el programa necesita para su posterior ejecución.
 * @author Carlos Mario Puentes Diz.
 */
public class Calculadora {
    private double acumulador;

    /**
     * Permite mostrar lo que está almacenado en la variable acumulador.
     * @return devuelve el valor de la variable acumulador.
     */
    public double getAcumulador() {
        return acumulador;
    }

    /**
     * Permite ingresar valores a la variable acumulador.
     * @param acumulador recibe el argumento que dará valor a la variable de clase acumulador.
     */
    public void setAcumulador(double acumulador) {
        this.acumulador = acumulador;
    }

    /**
     * Muestra un menú con el que el usuario podrá seleccionar la operación
     * que desee realizar.
     */
    public void menuCalcuadra(){
        System.out.println("***************");
        System.out.println("| [+] [-] [*] |");
        System.out.println("| [/] [%] [c] |");
        System.out.println("|     [o]     |");
        System.out.println("***************");
    }

    /**
     * Realizará la operación suma.
     * @param numero recibe el argumento que se sumará a la variable acumulador.
     * @return devuelve el valor de la variable acumulador.
     */
    public double suma(double numero){
        acumulador += numero;
        return acumulador;
    }

    /**
     * Realizará la operación de resta.
     * @param numero recibe el argumento que se restará a la variable acumulador.
     * @return devuelve el valor de la variable acumulador.
     */
    public double resta(double numero){
        acumulador -= numero;
        return acumulador;
    }

    /**
     * Realizará la operación de multiplicación.
     * @param numero recibe el argumento que multiplicará a la variable acumulador.
     * @return devuelve el valor de la variable acumulador.
     */
    public double multiplicacion(double numero){
        acumulador *= numero;
        return acumulador;
    }

    /**
     * Realizará la operación de división.
     * @param numero recibe el argumento que dividirá a la variable acumulador.
     * @return devuelve el valor de la variable acumulador.
     */
    public double division(double numero){
        acumulador /= numero;
        return acumulador;
    }

    /**
     * Realizará la operación de modulo.
     * @param numero recibe el argumento con el que se sacará el modulo a la variable acumulador.
     * @return devuelve el valor de la variable acumulador.
     */
    public double modulo(double numero){
        acumulador %= numero;
        return acumulador;
    }
}