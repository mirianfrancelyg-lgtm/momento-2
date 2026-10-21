package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos implements IOperaciones<Vehiculo> {
    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    @Override
    public void guardar(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
        System.out.println("¡Vehículo guardado exitosamente!");
    }

    @Override
    public Vehiculo buscar(String placa) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    @Override
    public void eliminar(String placa) {
        Vehiculo v = buscar(placa);
        if (v != null) {
            listaVehiculos.remove(v);
            System.out.println("¡Vehículo eliminado con éxito!");
        } else {
            System.out.println("No se encontró un vehículo con la placa especificada.");
        }
    }

    @Override
    public void listar() {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            System.out.println("\n--- LISTA DE VEHÍCULOS ---");
            for (Vehiculo v : listaVehiculos) {
                v.mostrarDetalles();
            }
        }
    }
}