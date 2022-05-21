import java.util.Scanner;
/*
    Clase principal donde se ejecutará el método main.
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero = 0;
        String opcion;
        int centinela = 1;
        //Creación del objeto calculadora.
        Calculadora calculadora = new Calculadora();

        System.out.print("Número: ");
        numero = teclado.nextDouble();
        calculadora.setAcumulador(numero);
        /*
    Menú inicial: Se ingresa el respectivo simbolo matemático.
    suma [+], resta [-], multiplicación [*], división[/], modulo [%].
    [c] es para reiniciar o limpiar el resultado. Si selecciona esta opción y
    anteriormente habia un valor de resultado este pasará a ser 0 nuevamente.
    [o] sirve para finalizar el programa.
     */
        calculadora.menuCalcuadra();
        opcion = teclado.next();

        while (centinela == 1){
            //Validación de la opción seleccionada.

            if (opcion.equals("+")){
                System.out.print("Número: ");
                numero = teclado.nextDouble();
                calculadora.suma(numero);
                System.out.printf("%.2f %n", calculadora.getAcumulador());

                calculadora.menuCalcuadra();
                opcion = teclado.next();

            } else if (opcion.equals("-")) {
                System.out.print("Número: ");
                numero = teclado.nextDouble();
                calculadora.resta(numero);
                System.out.printf("%.2f %n", calculadora.getAcumulador());

                calculadora.menuCalcuadra();
                opcion = teclado.next();

            } else if (opcion.equals("*")) {
                System.out.print("Número: ");
                numero = teclado.nextDouble();
                calculadora.multiplicacion(numero);
                System.out.printf("%.2f %n", calculadora.getAcumulador());

                calculadora.menuCalcuadra();
                opcion = teclado.next();

            } else if (opcion.equals("/")) {
                System.out.print("Número: ");
                numero = teclado.nextDouble();
                if (numero == 0){
                    System.out.println("Systax Error");
                }else {
                    calculadora.division(numero);
                    System.out.printf("%.2f %n", calculadora.getAcumulador());

                    calculadora.menuCalcuadra();
                    opcion = teclado.next();
                }
            } else if (opcion.equals("%")) {
                System.out.print("Número: ");
                numero = teclado.nextDouble();
                calculadora.modulo(numero);
                System.out.printf("%.2f %n", calculadora.getAcumulador());

                calculadora.menuCalcuadra();
                opcion = teclado.next();

            } else if (opcion.equals("c")) {
                calculadora.setAcumulador(0);
                System.out.printf("%.2f %n", calculadora.getAcumulador());

                System.out.print("Número: ");
                numero = teclado.nextDouble();
                calculadora.suma(numero);

                calculadora.menuCalcuadra();
                opcion = teclado.next();

            } else if (opcion.equals("o")) {
                System.out.println("Proceso finalizado");
                centinela = 0;
            }
        }
    }
}