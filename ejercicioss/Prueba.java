package Laboratorio2.ejercicioss;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de dato:"); //Selección del tipo de dato
        System.out.println("1. Entero");
        System.out.println("2. Double");
        int tipoDato = scanner.nextInt();
        
       // System.out.print("\033[H\033[2J");
        //System.out.flush();

        System.out.println("-----------------Menú de Operaciones-------------"); 
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Producto.");
        System.out.println("4. División.");
        System.out.println("5. Potencia.");
        System.out.println("6. Raíz Cuadrada.");
        System.out.println("7. Raíz Cúbica.");
        System.out.println("8. Salir.");
        int opcion = scanner.nextInt();

        switch (tipoDato) {
            case 1: // Entero
                OperacionesMatInteger numeroEntero = new OperacionesMatInteger();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese dos enteros:");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        System.out.println("Resultado: " + numeroEntero.suma(a, b));
                        break;
                    case 2:
                        System.out.println("Ingrese dos enteros:");
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        System.out.println("Resultado: " + numeroEntero.resta(a, b));
                        break;
                    case 3:
                        System.out.println("Ingrese dos enteros:");
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        System.out.println("Resultado: " + numeroEntero.producto(a, b));
                        break;
                    case 4:
                        System.out.println("Ingrese dos enteros:");
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        System.out.println("Resultado: " + numeroEntero.division(a, b));
                        break;
                    case 5:
                        System.out.println("Ingrese base y exponente:");
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        System.out.println("Resultado: " + numeroEntero.potencia(a, b));
                        break;
                    case 6:
                        System.out.println("Ingrese número:");
                        a = scanner.nextInt();
                        System.out.println("Resultado: " + numeroEntero.raizCuadrada(a));
                        break;
                    case 7:
                        System.out.println("Ingrese número:");
                        a = scanner.nextInt();
                        System.out.println("Resultado: " + numeroEntero.raizCubica(a));
                        break;
                    case 8:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            case 2: // Double
                OperacionesMatDouble numeroDouble = new OperacionesMatDouble();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese dos decimales:");
                        double x = scanner.nextDouble();
                        double y = scanner.nextDouble();
                        System.out.println("Resultado: " + numeroDouble.suma(x, y));
                        break;
                    case 2:
                        System.out.println("Ingrese dos decimales:");
                        x = scanner.nextDouble();
                        y = scanner.nextDouble();
                        System.out.println("Resultado: " + numeroDouble.resta(x, y));
                        break;
                    case 3:
                        System.out.println("Ingrese dos decimales:");
                        x = scanner.nextDouble();
                        y = scanner.nextDouble();
                        System.out.println("Resultado: " + numeroDouble.producto(x, y));
                        break;
                    case 4:
                        System.out.println("Ingrese dos decimales:");
                        x = scanner.nextDouble();
                        y = scanner.nextDouble();
                        System.out.println("Resultado: " + numeroDouble.division(x, y));
                        break;
                    case 5:
                        System.out.println("Ingrese base y exponente:");
                        x = scanner.nextDouble();
                        y = scanner.nextDouble();
                        System.out.println("Resultado: " + numeroDouble.potencia(x, y));
                        break;
                    case 6:
                        System.out.println("Ingrese número:");
                        x = scanner.nextDouble();
                        System.out.println("Resultado: " + numeroDouble.raizCuadrada(x));
                        break;
                    case 7:
                        System.out.println("Ingrese número:");
                        x = scanner.nextDouble();
                        System.out.println("Resultado: " + numeroDouble.raizCubica(x));
                        break;
                    case 8:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            default:
                System.out.println("Error: Tipo de dato erroneo");
        }

        scanner.close();
    }
}
