public class EmpleadoHora extends Empleado {
    public int horasTrabajadas;
    private int tarifaHora;
    private int horasRegulares = 40;

    public EmpleadoHora(String nombre, double salarioBase, int tarifaHora, int horasTrabajadas) {
        // Llamo al constructor de empleado
        super(nombre, salarioBase);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getHorasTrabajadas() {           //Metodo que nos devolvera las horas trabajadas
            return horasTrabajadas;
        }



    public double calcularSalario() {           //Metodo para calcular salario
        if (horasTrabajadas <= horasRegulares) {
            return super.calcularSalario() + (horasTrabajadas * tarifaHora);
        } else {
            int horasExtras = horasTrabajadas - horasRegulares;
            return super.calcularSalario() + (horasRegulares * tarifaHora) + (horasExtras * 1.5 * tarifaHora);
        }
    }
}
