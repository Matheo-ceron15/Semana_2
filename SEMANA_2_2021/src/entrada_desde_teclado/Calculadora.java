package entrada_desde_teclado;

import java.io.BufferedReader; //importa las clases para la lectura desde el teclado
import java.io.InputStreamReader; //Son tipos string habra que convertir los datos
        
public class Calculadora {
    public static void main(String[] args) {
        double cantidad1=0 , cantidad2=0;
        //crear el objeto leer de las clases correspondientes para obtener los datos
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try { //se utiliza el manejador de errores de lo contrario genera error
            System.out.println("Ingrese cantidad 1");
            //hace la lectura desde el teclado y lo convierte a double
            cantidad1= Double.parseDouble(leer.readLine());
            System.out.println("Ingrese cantiadad 2");
            cantidad2= Double.parseDouble(leer.readLine());
            //llamando metos desde las clases y sua parametros
            System.out.println("El resultado de la suma es de: " + Calculadora.sumar(cantidad1, cantidad2));
            System.out.println("El resultado de la resta es de: " + Calculadora.restar(cantidad1, cantidad2));
            System.out.println("El resultado de la multiplicacion es de: " + Calculadora.multiplicar(cantidad1, cantidad2));
            System.out.println("El resultado de la division es de: " +  Calculadora.dividir(cantidad1, cantidad2));
            
        }
        catch (Exception e){ //captura errores
            System.out.println(e.getMessage());
        }
        System.out.println(cantidad1 + " " + cantidad2);
    }
    public static double sumar(double cantidad1, double cantidad2) {
            double suma = cantidad1 + cantidad2;
        return suma;
    }
    public static double restar(double cantidad1, double cantidad2) {
            double resta = cantidad1 - cantidad2;
        return resta;
    }
    public static double multiplicar (double cantidad1, double cantidad2) {
            double multiplicacion = cantidad1 * cantidad2;
        return multiplicacion;
    }
    public static double dividir(double cantidad1, double cantidad2) {
        double division = cantidad1 / cantidad2;
        return division;
    }
}
    