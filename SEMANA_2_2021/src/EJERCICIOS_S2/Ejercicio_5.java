package EJERCICIOS_S2;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //variables
        double descuentoHora = 2.50;
        //ingreso de datos 
        System.out.println("Escriba el nombre del empleado");
        String nombre = leer.nextLine();
        System.out.println("Escriba su salario mensual");
        double salarioMensual = leer.nextDouble();
        System.out.println("Escriba cuantas horas a llegado tarde en un mes");
        int horasPerdidas =  leer.nextInt();
        //proceso
        double descuentoTarde = descuentoHora * horasPerdidas; 
        double renta = salarioMensual * 0.1;
        double neto = salarioMensual - descuentoTarde - renta;
        //salida de datos
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("El descuento por llegadas tardias en un mes es de: $" + descuentoTarde);
        System.out.println("La retencion de renta es de: $" + renta);
        System.out.println("El salario bruto del empleado es de: " + neto);
    }
}
