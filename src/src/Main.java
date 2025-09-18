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
    //Función para eliminar del stack1
    public static void eliminarPop(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Deseas eliminar el ultimo elemento ingresado?");
        System.out.print("S/N: ");
        String texto = entrada.nextLine();
        if(texto.equalsIgnoreCase("S")){ //compara el texto ingresado por consola (no distingue de Mayu o Min)
            stack2.push(stack1.pop()); //añade al stack2 el dato del stack1(lo elimina del stack1)
            System.out.println("-- HAZ ELIMINADO UN ELEMENTO DEL STACK --");
        } else if (texto.equalsIgnoreCase("N")) { //compara el texto ingresado por consola (no distingue de Mayu o Min)
            System.out.println("No eliminaste ningun elemento");
        } else {
            System.out.println("Opcion incorrecta");
        }
    }


    public static void main(String[] args) {
    //aquí inicializaremos la actividad
    }
}
