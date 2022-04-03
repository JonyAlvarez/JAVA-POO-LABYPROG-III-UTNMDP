package ejercicios;

// 3. Modele el objeto item de Venta con las siguientes propiedades, identificador,
// descripción, cantidad y precio unitario. Cree los métodos para calcular el precio 
// total teniendo en cuenta el precio unitario y cantidad. Un método que permita 
// imprimir por pantalla los atributos del objeto de la siguiente forma: 
// ItemVentaid=?, descripción=?, cantidad=?, pUnitario=?, pTotal=? 
// a. Inicialice el objeto con los atributos necesarios 
// b. Imprima por pantalla el objeto inicializado.

public class Ejercicio3 {

    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Ejercicio3(int identificador, String descripcion, int cantidad, double precioUnitario) {//constructor
        this.identificador = identificador;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }
    //SETTERS
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    //Cree los métodos para calcular el precio  total teniendo en cuenta el precio unitario y cantidad.
    public double getPrecioTotal(){

        int cant = getCantidad();
        double precioUnitario = getPrecioUnitario();

        return precioUnitario * cant;

    }
   
// Un método que permita  imprimir por pantalla los atributos del objeto de la siguiente forma: 
// ItemVenta id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]

    public String getProducto(){
        return " ID: " + getIdentificador() + "," + " Descripcion: " + getDescripcion()+ "," + " Cantidad: " + getCantidad()+ ","  + " pUnitario: " + getPrecioUnitario()+ ","  + " pTotal: " + getPrecioTotal();
    }




}
