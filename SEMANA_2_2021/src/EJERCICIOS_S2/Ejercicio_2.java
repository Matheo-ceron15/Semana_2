package EJERCICIOS_S2;
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double precioVehiculo, flete, seguroVehiculo;
        System.out.println("Escriba el precio del vehiculo: ");
        precioVehiculo=leer.nextDouble();
        System.out.println("Escriba valor del flete: ");
        flete= leer.nextDouble();
        System.out.println("Escriba el valor del seguro: ");
        seguroVehiculo=leer.nextDouble();
     
        double valorDai = Ejercicio_2.obtenerDai(precioVehiculo, flete, flete, seguroVehiculo);
        System.out.println("-------------------------------");
        System.out.println("El valor del vehiulo en USA es de: $" + precioVehiculo);
        System.out.println("El valor del flete es de: $" + flete);
        System.out.println("El valor del seguro es de: $" + seguroVehiculo);
        System.out.println("El valor del DAI es de: " + valorDai);
    }
    public static double obtenerDai(double precioVehiculo, double flete, double seguro, double depreciacion) {
        double dai =0;
        depreciacion= precioVehiculo*0.10;
        dai = (precioVehiculo-depreciacion-flete-seguro)*0.25;
    return dai;
    }
}
