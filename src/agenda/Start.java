package agenda;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		  // Crear una instancia de la clase Agenda
        Agenda agenda = new Agenda();
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar el menú de opciones
        System.out.println("Menú de opciones:");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Verificar si existe contacto");
        System.out.println("3. Listar contactos");
        System.out.println("4. Buscar contacto por nombre");
        System.out.println("5. Eliminar contacto");
        System.out.println("6. Verificar si la agenda está llena");
        System.out.println("7. Verificar cuántos huecos libres hay en la agenda");
        System.out.println("8. Salir");
        
        // Leer la opción del usuario
        int opcion = scanner.nextInt();
        
        // Procesar la opción del usuario
        while (opcion != 8) {
            switch (opcion) {
                case 1:
                    // Añadir contacto
                    System.out.println("Introduce el nombre del contacto:");
                    String nombre = scanner.next();
                    System.out.println("Introduce el teléfono del contacto:");
                    String telefono = scanner.next();
                    Contacto c = new Contacto(nombre, telefono);
                    agenda.aniadirContacto(c);
                    break;
                case 2:
                    // Verificar si existe contacto
                    System.out.println("Introduce el nombre del contacto:");
                    nombre = scanner.next();
                    c = new Contacto(nombre, "");
                    if (agenda.existeContacto(c)) {
                        System.out.println("El contacto existe en la agenda.");
                    } else {
                        System.out.println("El contacto no existe en la agenda.");
                    }
                    break;
                case 3:
                    // Listar contactos
                    agenda.listarContactos();
                    break;
                case 4:
                    // Buscar contacto por nombre
                    System.out.println("Introduce el nombre del contacto:");
                    nombre = scanner.next();
                    telefono = agenda.buscaContacto(nombre);
                    if (telefono != null) {
                        System.out.println(telefono);
                    } else {
                        System.out.println("El contacto no existe en la agenda.");
                    }
                    break;
                case 5:
                    // Eliminar contacto
                    System.out.println("Introduce el nombre del contacto:");
                    nombre = scanner.next();
                    c = new Contacto(nombre, "");
                    agenda.eliminarContacto(c);
                    break;
                case 6:
                    // Verificar si la agenda está llena
                    if (agenda.agendaLlena()) {
                        System.out.println("La agenda está llena.");
                    } else {
                        System.out.println("La agenda no está llena.");
                    }
                    break;
                case 7:
                    // Verificar cuántos huecos libres hay en la agenda
                    int huecosLibres = agenda.huecosLibres();
                    System.out.println("Hay " + huecosLibres + " huecos libres en la agenda.");
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opción no válida.");
            }
            
            // Mostrar el menú de opciones nuevamente
            System.out.println("Menú de opciones:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Verificar si existe contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Buscar contacto por nombre");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Verificar si la agenda está llena");
            System.out.println("7. Verificar cuántos huecos libres hay en la agenda");
            System.out.println("8. Salir");
            
            // Leer la opción del usuario nuevamente
            opcion = scanner.nextInt();
        }
        
        // Cerrar el objeto Scanner
        scanner.close();

	}

}
