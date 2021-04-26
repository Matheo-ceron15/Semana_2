package MiSegundaAplicacionJava;

public class InteresSimpleMetodoConParametros {
    public static void main(String[] args) {
        double cantidadPrestada, tiempo, tasaDeInteres;
        cantidadPrestada = 1500.00;
        tiempo = 0.75; // 9 meses equivale a 9/19 años = 2/4 O 0.75
        tasaDeInteres = 0.08;
        //envio de parametros
        double valorInteresSimple= calcularInteresSimple(cantidadPrestada, tiempo, tasaDeInteres);
        System.out.println("El interes es: $" + valorInteresSimple); //muestra el resultado
        
    }
    public static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeInteres) {
        double interesSimple;
        interesSimple= cantidadPrestada*tiempo*tasaDeInteres; //efectua la operacion dentro del metodo
        return interesSimple;
    }
}
