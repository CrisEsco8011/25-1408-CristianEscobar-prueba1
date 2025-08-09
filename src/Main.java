import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Gestor gestor = new Gestor();
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

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String descripcion = teclado.nextLine();
                    System.out.print("Fecha límite: ");
                    String fecha = teclado.nextLine();
                    System.out.print("Prioridad (Alta/Media/Baja): ");
                    String prioridad = teclado.nextLine();
                    System.out.print("Categoría (Trabajo/Estudio/Personal/Otro): ");
                    String categoria = teclado.nextLine();
                    gestor.agregarTarea(new Tarea(descripcion, fecha, prioridad, categoria));
                    System.out.println("Tarea agregada correctamente.");
                    break;

                case 2:
                    gestor.listarTareas();
                    break;

                case 3:
                    System.out.print("Número de tarea a marcar como completada: ");
                    int numCompletar = teclado.nextInt() - 1;
                    gestor.marcarTareaComoCompletada(numCompletar);
                    break;

                case 4:
                    System.out.print("Número de tarea a editar: ");
                    int numEditar = teclado.nextInt() - 1;
                    teclado.nextLine(); // limpiar buffer
                    System.out.print("Nueva descripción: ");
                    String nuevaDescripcion = teclado.nextLine();
                    System.out.print("Nueva fecha límite: ");
                    String nuevaFecha = teclado.nextLine();
                    System.out.print("Nueva prioridad: ");
                    String nuevaPrioridad = teclado.nextLine();
                    System.out.print("Nueva categoría: ");
                    String nuevaCategoria = teclado.nextLine();
                    gestor.editarTarea(numEditar, nuevaDescripcion, nuevaFecha, nuevaPrioridad, nuevaCategoria);
                    break;

                case 5:
                    gestor.listarTareasPorEstado(false);
                    break;

                case 6:
                    gestor.listarTareasPorEstado(true);
                    break;

                case 7:
                    System.out.print("Número de tarea a eliminar: ");
                    int numEliminar = teclado.nextInt() - 1;
                    gestor.eliminarTarea(numEliminar);
                    break;

                case 8:
                    System.out.println("Nos Vemos.");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 8);

        teclado.close();
    }
}