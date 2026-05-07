package refactorizaciondam;

public class Empleado extends Persona {
    protected int idEmpleado;
    protected double salarioBase;

    public Empleado(String nombre, String dni, int idEmpleado, double salarioBase) {
        super(nombre, dni);
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarResumen() {
        System.out.println("Empleado: " + nombre + " | ID: " + idEmpleado + " | Salario: " + calcularSalario());
    }
}