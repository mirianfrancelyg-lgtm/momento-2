package vehiculos;

public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected double precio;

    public Vehiculo(String placa, String marca, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void mostrarDetalles();
}