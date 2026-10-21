package vehiculos;

public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String placa, String marca, double precio, int numeroPuertas) {
        super(placa, marca, precio);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[Auto] Placa: " + placa + " | Marca: " + marca + 
                           " | Precio: $" + precio + " | Puertas: " + numeroPuertas);
    }
}