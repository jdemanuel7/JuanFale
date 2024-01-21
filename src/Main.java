public class Main {
    public static void main(String[] args) {
        EmpleadoHora empleadoPorHora = new EmpleadoHora("Juan Carlos", 15.0, 12, 60);
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Rafa", 1200.0, 5000.0);

        // Mostrar información detallada para EmpleadoAsalariado
        System.out.println("Empleado Asalariado:");
        System.out.println("Nombre: " + empleadoAsalariado.getNombre());
        System.out.println("Salario Base: $" + empleadoAsalariado.calcularSalario());
        System.out.println("Bono Anual: $" + empleadoAsalariado.getBonoAnual());
        System.out.println("Salario Total: $" + empleadoAsalariado.calcularSalario());
        System.out.println();

        // Mostrar información detallada para EmpleadoPorHora
        System.out.println("Empleado Por Hora:");
        System.out.println("Nombre: " + empleadoPorHora.getNombre());
        System.out.println("Salario Base: $" + empleadoPorHora.calcularSalario());
        System.out.println("Salario Total: $" + empleadoPorHora.calcularSalario());
        System.out.println("Horas Trabajadas: " + empleadoPorHora.getHorasTrabajadas());
    }
}










