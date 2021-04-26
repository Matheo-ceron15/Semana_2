package MiSegundaAplicacionJava;

public class CrearMetodoConParametros {
    public static void main(String[] args) {
        System.out.println("Metodo Void");
        metodoConParametrosVoid(1, 24.34,"Lucas");
        System.out.println("------------------");
        System.out.println("Metodo Int");
        metodoConParametrosInt(1);
        System.out.println("------------------");
        metodoConParametrosDouble(24.34);
        System.out.println("------------------");
        metodoConParametrosString("Lucas");
    }
    
    public static void metodoConParametrosVoid(int valorInt, double valorDouble, String valorString) {
        System.out.println("Valor Int " + valorInt);
        System.out.println("Valor Double " + valorDouble);
        System.out.println("Valor String " + valorString);
    }
    public static int metodoConParametrosInt(int valorInt) {
        System.out.println("El valor int es: " + valorInt);
        return valorInt;
    }
    public static double metodoConParametrosDouble(Double valorDouble) {
        System.out.println("El valor de Double es: " + valorDouble);
        return valorDouble;
    }
    public static String metodoConParametrosString(String valorString) {
        System.out.println("El valor de String es: " + valorString);   
        return valorString;
    }
}
