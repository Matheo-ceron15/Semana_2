package EJERCICIOS_S2;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        
        Scanner leer =  new Scanner (System.in);
        double valordeCompra,ivaIngresado, valorConIva, iva, total;
        System.out.println("Escriba el precio de la maquina: ");
        valordeCompra = leer.nextDouble(); 
        System.out.println("Escriba el porcentaje del IVA: ");
        ivaIngresado=leer.nextDouble();
        //calculando iva
        valorConIva= ivaIngresado/100;
        iva = valorConIva * valordeCompra; //iva total del presio de compra
        total = valordeCompra + iva;
        
        System.out.println("El precio de la computadora es de: $" + valordeCompra);
        System.out.println("El precio con IVA es de: $" + total);
         }
}
