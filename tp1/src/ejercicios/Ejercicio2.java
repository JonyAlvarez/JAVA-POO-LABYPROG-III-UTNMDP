package ejercicios;

// 2.Modele el objeto Empleado que posee las siguientes características, dni, nombre, 
// apellido y salario. El mismo debe contar con la posibilidad de calcular el salario 
// anual. A su vez se requiere otro método que permita aumentar el salario 
// dependiendo del porcentaje que se le pase por parámetro. Considere crear un 
// método que facilite imprimir por pantalla las características del objeto de la 
// siguiente forma: 
// Empleado[dni=?, nombre=?, apellido=?, salario=?] 
// a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 
// 25000. 
// b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 
// 27500. 
// c. Imprima ambos objetos por pantalla 
// d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el 
// salario anual del mismo.

public class Ejercicio2 {

    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Ejercicio2(int dni, String n, String a, double salario) {

        this.dni = dni;
        this.nombre = n;
        this.apellido = a;
        this.salario = salario;

    }

    // getters setters
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public String MuestraEmpleado() {
        return "Empleado: dni= " + getDni() + ",  nombre= " + getNombre() + ", apellido= " + getApellido() + ", salario= " + getSalario();
    }

    public double salarioAnual() {
        double salario = getSalario();
        return salario * 12;
    }

    public void aumentarSalario(int aumento){
       double calculo = getSalario() / 100;
       double salarioPorcentaje = calculo * aumento;
       double salarioFinal = getSalario() + salarioPorcentaje;
       setSalario(salarioFinal);
    }
}
