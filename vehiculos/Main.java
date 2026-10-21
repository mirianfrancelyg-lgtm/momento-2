package vehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorVehiculos gestor = new GestorVehiculos();
        int opcion = 0;

        do {
            System.out.println("\n=== SIMULADOR FRONTEND - GESTIÓN VEHÍCULOS ===");
            System.out.println("1. Registrar Auto");
            System.out.println("2. Listar Vehículos");
            System.out.println("3. Buscar Vehículo por Placa");
            System.out.println("4. Eliminar Vehículo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar búfer

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese placa: ");
                        String placa = scanner.nextLine();
                        System.out.print("Ingrese marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Ingrese precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese número de puertas: ");
                        int puertas = scanner.nextInt();
                        scanner.nextLine(); // Limpiar búfer

                        Auto nuevoAuto = new Auto(placa, marca, precio, puertas);
                        gestor.guardar(nuevoAuto);
                        break;

                    case 2:
                        gestor.listar();
                        break;

                    case 3:
                        System.out.print("Ingrese la placa del vehículo a buscar: ");
                        String placaBuscar = scanner.nextLine();
                        Vehiculo encontrado = gestor.buscar(placaBuscar);
                        if (encontrado != null) {
                            System.out.println("¡Vehículo encontrado!");
                            encontrado.mostrarDetalles();
                        } else {
                            System.out.println("Vehículo no encontrado.");
                        }
                        break;

                    case 4:
                        System.out.print("Ingrese la placa del vehículo a eliminar: ");
                        String placaEliminar = scanner.nextLine();
                        gestor.eliminar(placaEliminar);
                        break;

                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
        } while (opcion != 5);

        scanner.close();
    }
}