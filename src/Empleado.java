public class Empleado {
    private String nombre;
    private double salarioBase;

    // Constructor que establece el salario y nombre
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método que devuelve el salario base
    public double calcularSalario() {
        return salarioBase;
    }

    // Getter para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Setter para actualizar el nombre del empleado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el salario base
    public double getSalarioBase() {
        return salarioBase;
    }

    // Setter para actualizar el salario base
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}


