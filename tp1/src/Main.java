import Ejercicios.Ejercicio1;
import Ejercicios.Ejercicio2;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hola");

        // ###################### Ejercicio 1 ######################
        /*
        jercicio1 ej1 = new Ejercicio1(5, 3);// a

        System.out.println("B:");
        System.out.println(ej1.anchoYalto());// b

        System.out.println("C:");
        System.out.println(ej1.AreaPerimetro());// c

        System.out.println("D:");
        ej1.CambiarAltoAncho(6, 4);// d
        System.out.println(ej1.anchoYalto());// d
        System.out.println(ej1.AreaPerimetro());// d

        Ejercicio1 ej1b = new Ejercicio1(0, 0);// f.
        System.out.println(ej1b.anchoYalto());// f
        */


        // ###################### Ejercicio 2 ######################
        // a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario
        // inicial de
        // 25000.
        // b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
        // 27500.
        Ejercicio2 empleado = new Ejercicio2(23456345, "Carlos", "Gutiérrez", 25000);
        Ejercicio2 empleada = new Ejercicio2(34234123, "Ana", "Sánchez", 27000);

        empleado.MuestraEmpleado();
        System.out.println(empleado.MuestraEmpleado());
        System.out.println(empleada.MuestraEmpleado());
    }

}
