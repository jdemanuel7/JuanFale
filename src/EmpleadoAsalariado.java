public class EmpleadoAsalariado extends Empleado {
    private double bonoAnual;

    // Constructor  nombre, salario base y bono anual
    public EmpleadoAsalariado(String nombre, double salarioBase, double bonoAnual) {
        // Llamo al constructor de empleado
        super(nombre, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    // Sobrescribe el método calcularSalario para incluir el bono anual
    public double calcularSalario() {
        // Llamo al metodo de empleado y agrego el bono anual
        return super.calcularSalario() + bonoAnual;
    }
    public double getBonoAnual() {
        return bonoAnual;
    }
    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }
}
