package EJERCICIOS_S2;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         double salariobase = 800.00;
         double salario = 0.0;
         double precio = 0.0;
         double comision = 0.0;
         System.out.println("Introuzca el nombre del vendedor");
         String nombre = leer.nextLine();
         System.out.println("Introduzca la cantidad de autos vendidos");
         double n = leer.nextDouble();
         for (int i=1; i<=n; i++)
         {
             System.out.println("Introduzca el precio del auto (" + i + "):");
             precio = leer.nextDouble();
             comision = comision + (precio * 0.05);
         }
         salario = salariobase + comisionAutosVendidos(n) + comision;
         System.out.println("El nombre del vendedor es de: " + nombre);
         System.out.println("El salario del trabajador es de: $" + salario);
    }
    public static double comisionAutosVendidos( double cantidad) {
        
        double totalComision = 170 * cantidad;
        return totalComision;
    }
    
}
