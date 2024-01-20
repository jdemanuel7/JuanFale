public class Empleado {
    private string nombre;
    private double salarioBase;

    // Constructor que da el salario y nombre
    public Empleado(string nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método que devuelve salario base
    public double calcularSalario() {
        return salarioBase;
    }

    // Getter para obtener el nombre del empleado
    public string getNombre() {
        return nombre;
    }

    // Setter para actualizar el nombre del empleado
    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }


    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}


