public class Coche {
    //definimos los atributos propios del coche
    private final int numero_puertas;
    private final String marca;
    private final String modelo;
    private final String color;


    //creamos el constructor para poder
    public Coche(String marca, String modelo, String color, int numero_puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numero_puertas = numero_puertas;

    }
    //devuelve un string con la marca y el modelo
    public String getModeloMarca() {
        String m = marca + " " + modelo;
        return m;
    }
    //devuelve un string con el color
    public String getColor() {
        return color;
    }
    //devuelve el numero de puertas
    public int getNumero_puertas() {
        return numero_puertas;
    }
    //devuelve un string con la marca
    public String getMarca() {
        return marca;

    }
    //devuelve un string con  el modelo
    public String getModelo(){
        return modelo;
    }
    //simula un arranque
    public void arrancar() {

        System.out.println("Arrancando coche");
        System.out.println("Coche arrancado");
    }

    //simula una frenada
    public void frenar(){
        System.out.println("Frenando coche");
        System.out.println("Coche frenado");
    }
}


/*
La abstracción nos permite enfocarnos en lo esencial de un objeto, ignorando los detalles no importantes. Esto se logra
definiendo clases, que son como plantillas o modelos para crear objetos. Las clases contienen los atributos (características)
y métodos (comportamiento) de los objetos.

Ejemplo: Pensemos en una clase Coche. La abstracción nos permite definir solo los atributos y métodos relevantes para
un coche, como marca, modelo, color, velocidad, arrancar, frenar, etc., sin necesidad de entrar en detalles técnicos
complejos del motor, la transmisión, etc.
 */