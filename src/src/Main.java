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
    //Función para rehacer elementos
    public static void rehacer(){
        if(stack2.isEmpty() == true){ //Pregunta si el Stack2 está vacío
            System.out.println("No se han eliminado elementos del Stack");
        }else {
            stack1.push(stack2.pop()); //Elimina el dato del stack2 y lo añade al stack1
            System.out.println("-- SE HAN REHECHO LOS ELEMENTOS EN EL STACK --");
            System.out.println("Texto Rehecho en el Stack1: " + stack1.peek()); //Trae el dato del Stack1 y lo muestra
        }
    }

    public static void elementosTotales(){
        if(stack1.isEmpty() == true){ //Pregunta si el stack1 está vacio
            System.out.println("El Stack está vacio: " + stack1.isEmpty()); //Imprime verdadero o falso(Boolean)
        } else {
            System.out.println("Elementos Totales del Stack: " + stack1); //Imprime el stack1
        }
    }

    public static void main(String[] args) {

    }
}
