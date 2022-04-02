package Ejercicios;

// 1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor 
// 1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También 
// debe contar con un método para calcular el área y perímetro del mismo. Ejecute las 
// siguientes pruebas: 
// a. Inicializar un objeto Rectángulo estableciendo ancho y alto. 
// b. Imprimir por pantalla el alto y ancho. 
// c. Imprimir por pantalla el área y perímetro. 
// d. Modificar el alto y el ancho de la instancia. 
// e. Imprimir por pantalla nuevamente el cálculo del área y perímetro. 
// f. Inicializar un objeto Rectángulo con los valores por defecto y verificar. 

public class Ejercicio1 {

    private double alto;
    private double ancho;

    // constructor a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
    public Ejercicio1(double alto, double ancho) {

        this.alto = (alto <= 0) ? 1.0 : alto;
        this.ancho = (ancho <= 0) ? 1.0 : ancho;

    }

    // getters y setters
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String anchoYalto() { // b. Imprimir por pantalla el alto y ancho.
        return "Alto: " + alto + " Ancho: " + ancho;

    }

    // c. Imprimir por pantalla el área y perímetro.
    public double getArea() {

        return ancho * alto;
    }

    public double getPerimetro() {

        return 2 * (ancho + alto);

    }

    public String AreaPerimetro() {

        return "Area: " + getArea() + "\n" + "Perimetro: " + getPerimetro();

    }

    // d. Modificar el alto y el ancho de la instancia.
    public void CambiarAltoAncho(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

}
