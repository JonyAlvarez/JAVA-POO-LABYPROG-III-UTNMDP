import ejercicios.Ejercicio1;
import ejercicios.Ejercicio2;
import ejercicios.Ejercicio3;
import ejercicios.Ejercicio4;
import ejercicios.Ejercicio3;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hola");

        // ###################### Ejercicio 1 ######################
        /*
         * jercicio1 ej1 = new Ejercicio1(5, 3);// a
         * 
         * System.out.println("B:");
         * System.out.println(ej1.anchoYalto());// b
         * 
         * System.out.println("C:");
         * System.out.println(ej1.AreaPerimetro());// c
         * 
         * System.out.println("D:");
         * ej1.CambiarAltoAncho(6, 4);// d
         * System.out.println(ej1.anchoYalto());// d
         * System.out.println(ej1.AreaPerimetro());// d
         * 
         * Ejercicio1 ej1b = new Ejercicio1(0, 0);// f.
         * System.out.println(ej1b.anchoYalto());// f
         */

        // ###################### Ejercicio 2 ######################

        // Ejercicio2 empleado = new Ejercicio2(23456345, "Carlos", "Gutiérrez", 25000); // a. Inicialice un empleado
        //                                                                               // Carlos Gutiérrez, con dni
        //                                                                               // 23456345 y salario 25000.

        // Ejercicio2 empleada = new Ejercicio2(34234123, "Ana", "Sánchez", 27000); // b. Inicialice un empleado Ana
        //                                                                          // Sánchez, con dni 34234123 y salario
        //                                                                          // inicial de 27500.

        // System.out.println(empleado.MuestraEmpleado());// c. Imprima ambos objetos por pantalla
        // System.out.println(empleada.MuestraEmpleado());// c. Imprima ambos objetos por pantalla
        // System.out.println("Empleado salario anual: " + empleado.salarioAnual());
        // System.out.println("Empleada salario anual: " + empleada.salarioAnual());

        // // d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        // // salario anual del mismo.
        // empleado.aumentarSalario(15);
        // empleada.aumentarSalario(15);
        // System.out.println("Salario aumentado un 15%");
        // System.out.println(empleado.MuestraEmpleado());// c. Imprima ambos objetos por pantalla
        // System.out.println(empleada.MuestraEmpleado());// c. Imprima ambos objetos por pantalla
        // System.out.println("Empleado salario anual: " + empleado.salarioAnual());
        // System.out.println("Empleada salario anual: " + empleada.salarioAnual());





        // ###################### Ejercicio 3 ######################

        
        

        // Ejercicio3 producto = new Ejercicio3(1, "remera escote V", 35, 1400);// a. Inicialice el objeto con los atributos necesarios 
        // System.out.println(producto.getProducto());// b. Imprima por pantalla el objeto inicializado.
       
        // ###################### Ejercicio 4 ######################

        Ejercicio4 cuenetaBancaria = new Ejercicio4(1, "Jony", 15000);     // 1. Inicialice una cuenta con un monto inicial de 15000. 

        cuenetaBancaria.credito(2500);        // 2. Realice una operación de crédito de 2500. 


        cuenetaBancaria.compra(1500);        // 3. Realice una operación de compra de 1500. 
        cuenetaBancaria.compra(30000);        // 4. Realice una operación de compra de 30000. 

        System.out.println(cuenetaBancaria.PrintAccount());        // 5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto. 
        


    }

}
