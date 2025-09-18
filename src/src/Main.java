import java.util.Stack;
import java.util.Scanner;

public class Main {

    static Stack<String> stack1 = new Stack<>();//creación del stack1
    static Stack<String> stack2 = new Stack<>();//creación del stack2

    Scanner entrada = new Scanner(System.in);
    String consola = entrada.nextLine();
    //Función que ingresa los datos de la consola al stack1
    public static void ingresarPush() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el Texto a guardar (Push): ");
        String texto = entrada.nextLine();
        stack1.push(texto);//lo añade
    }

    public static void main(String[] args) {

    }
}
