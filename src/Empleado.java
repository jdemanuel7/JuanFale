public class Empleado {
    private string nombre;
    private double salarioBase;

    // Constructor que recibe nombre y salario base
    public Empleado(string nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método que devuelve el salario base
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

    // Getter para obtener el salario base del empleado
    public double getSalarioBase() {
        return salarioBase;
    }

    // Setter para actualizar el salario base del empleado
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}


