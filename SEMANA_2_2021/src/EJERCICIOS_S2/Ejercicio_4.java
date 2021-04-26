package EJERCICIOS_S2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
            Scanner leer =  new Scanner(System.in);
            double salariobase = 300.00;
            double comisionV = 50.00;
            double salarioDevengado = 0.00;
            System.out.println("Ingrese el nombre del vendedor: ");
            String nombre = leer.nextLine();
            System.out.println("Introduzca cantidad de comutadoras vendidas en un mes: ");
            int cantidadPCvendidas = leer.nextInt();
            
            for (int i = 1; i<=cantidadPCvendidas; i++){ 
                System.out.println("Escrina el precio de la computadora: (" + i + "):");
                double precioPC = leer.nextDouble();
                salarioDevengado = salariobase + (comisionV*cantidadPCvendidas);
            }
            double rentabase = Ejercicio_4.rentabase(salarioDevengado);
            double total =  salarioDevengado-rentabase;
            System.out.println("---------------------------");
            System.out.println("El nombre del vendedor es: " + nombre);
            System.out.println("El salario del empleado sin renta es de: $" + salarioDevengado);
            System.out.println("El valor de la renta es de: $" + rentabase);
            System.out.println("El salario total de un mes del empleado es de: $" + total);
    }
    public static double rentabase(double salarioDevengado) {
        double renta=0.00;
        renta = salarioDevengado * 0.1;
        return renta;
    }
}
