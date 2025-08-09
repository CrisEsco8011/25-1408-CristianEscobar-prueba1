import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE GESTIÓN DE TAREAS =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Editar una tarea");
            System.out.println("5. Listar solo tareas pendientes");
            System.out.println("6. Listar solo tareas completadas");
            System.out.println("7. Eliminar tarea");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

        }while(opcion !=8);
    }
}