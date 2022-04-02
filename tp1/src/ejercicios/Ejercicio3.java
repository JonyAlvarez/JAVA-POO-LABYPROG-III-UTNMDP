package Ejercicios;

// 3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,

// descripción, cantidad y precio unitario. Cree los métodos para calcular el precio 
// total teniendo en cuenta el precio unitario y cantidad. Un método que permita 
// imprimir por pantalla los atributos del objeto de la siguiente forma: 
// ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?] 
// a. Inicialice el objeto con los atributos necesarios 
// b. Imprima por pantalla el objeto inicializado.

public class Ejercicio3 {

    private int identificador;
    private String descripción;
    private int cantidad;
    private double precioUnitario;

    public Ejercicio3(int identificador, String descripción, int cantidad, double precioUnitario) {//constructor
        this.identificador = identificador;
        this.descripción = descripción;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    
    //GETTERS


    public int getIdentificador() {
        return identificador;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripción() {
        return descripción;
    }
    //SETTERS
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }






}
