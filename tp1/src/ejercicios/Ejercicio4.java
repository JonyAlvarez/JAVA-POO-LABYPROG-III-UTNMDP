package ejercicios;


// Modele el objeto que representa la cuenta de un banco, con identificador, nombre 
// y balance. Considere los getters, setters y constructores necesarios. Tenga en 
// cuenta los siguientes métodos. 
// a. El método crédito que representa un depósito de dinero en la cuenta. Este 
// método debe devolver el balance luego de la operación. 
// b. El método débito que representa una sustracción de dinero de la cuenta. 
// Este método debe devolver el balance luego de la operación. Si el dinero en 
// la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por 
// pantalla un aviso.  
// c. Un método que imprima por pantalla las características del objeto. 
// Realice las siguientes operaciones: 
// 1. Inicialice una cuenta con un monto inicial de 15000. 
// 2. Realice una operación de crédito de 2500. 
// 3. Realice una operación de compra de 1500. 
// 4. Realice una operación de compra de 30000. 
// 5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea 
// correcto. 

public class Ejercicio4 {
    
    private int identificador;
    private String nombre;
    private double valance;


    public Ejercicio4(int identificador, String nombre, double valance) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.valance = valance;
    }


    //Getters Setters
    public int getIdentificador() {
        return identificador;
    }
    public double getValance() {
        return valance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValance(double valance) {
        this.valance = valance;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }



        // c. Un método que imprima por pantalla las características del objeto. 
        // Realice las siguientes operaciones: 
        // 1. Inicialice una cuenta con un monto inicial de 15000. 
        // 2. Realice una operación de crédito de 2500. 
        // 3. Realice una operación de compra de 1500. 
        // 4. Realice una operación de compra de 30000. 
        // 5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea 
        // correcto. 

    public double credito(double credito){
        // a. El método crédito que representa un depósito de dinero en la cuenta. Este 
        // método debe devolver el balance luego de la operación.
        if(credito < 0){
            System.out.println("error");
        }else{
            double saldo = getValance();
            saldo += credito;
            setValance(saldo);
    
        }

        return getValance();
    }

    public double debito(double debito){
        // b. El método débito que representa una sustracción de dinero de la cuenta. 
        // Este método debe devolver el balance luego de la operación. Si el dinero en 
        // la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por 
        // pantalla un aviso. 
        double valance = getValance(); 
        if(debito > valance){

            System.out.println("No posee dinero suficiente");
        }else{
            double saca = valance - debito;
            setValance(saca);
        }
        
        return getValance();

    }
    public void compra(double cantidad){

        debito(cantidad);

    }
    // c. Un método que imprima por pantalla las características del objeto. 
    
    public String PrintAccount() {
        return "Identificador: " + getIdentificador() + ", Nombre: " + getNombre() + ", Valance: "+ getValance();
    }

}
