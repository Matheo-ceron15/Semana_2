package MiSegundaAplicacionJava;

public class MiSegundaAplicacionJava {

    public static void main(String[] args) {
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
    }
    public static void metodoConVoid() {
        System.out.println("Contenido del metodo void");
    }
    public static int metodoConInt() {
        System.out.println("Contenido del metodo int");
        return 0;
    }
    public static double metodoConDouble() {
        System.out.println("Contenido del metodo double");
        return 0.0;
    }
    public static String metodoConString() {
        System.out.println("Contenido del metodo string");
        return "";
    }
}
