package vehiculos;

public interface IOperaciones<T> {
    void guardar(T entidad);
    T buscar(String id);
    void eliminar(String id);
    void listar();
}