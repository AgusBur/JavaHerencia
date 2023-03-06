/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package Entidad;

import java.util.Scanner;

/**
 * @author Agustina
 */
public abstract class Electrodomestico {

    protected Double price;
    protected String colour;
    protected String consumEnergy;
    protected Double weight;

    public Electrodomestico() {
    }

    public Electrodomestico(Double price, String color, String consumEnergy, Double weight) {
        this.price = price;
        this.colour = color;
        this.consumEnergy = consumEnergy;
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getConsumEnergy() {
        return consumEnergy;
    }

    public void setConsumEnergy(String consumEnergy) {
        this.consumEnergy = consumEnergy;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String comprobarConsumoEnergetico(String letter) {

        String vectLetter[] = new String[]{"A", "B", "C", "D", "E", "F"};

        for (int i = 0; i < vectLetter.length; i++) {
            if (letter.equalsIgnoreCase(vectLetter[i])) {
                return letter;
            }
        }
        return "F";
    }

    public String comprobarColor(String colour) {

        String vectLetter[] = new String[]{"blanco", "negro", "rojo", "azul", "gris"};

        for (int i = 0; i < vectLetter.length; i++) {
            if (colour.equalsIgnoreCase(vectLetter[i])) {
                return colour;
            }
        }
        return "blanco";
    }

    public void crearElectrodomestico() {
        String col, consume;
        System.out.println("Qué precio tiene?");
        price = leer.nextDouble();
        System.out.println("De qué color es?");
        col = leer.next();
        colour = comprobarColor(col);
        System.out.println("Qué consumo de energético tiene? (entre A y F)");
        consume = leer.next();
        consumEnergy = comprobarConsumoEnergetico(consume);
        System.out.println("Cuánto pesa?");
        weight = leer.nextDouble();
    }

    public double precioFinal() {

        double finalp, pweight=0, pconsume=0;

        switch (consumEnergy) {
            case "A":
                pconsume = 1000;
                break;
            case "B":
                pconsume = 800;
                break;
            case "C":
                pconsume = 600;
                break;
            case "D":
                pconsume = 500;
                break;
            case "E":
                pconsume = 300;
                break;
            case "F":
                pconsume = 100;
                break;
        }

        if (weight >= 80) {
            pweight = 1000;
        } else if (weight >= 50 && weight <= 79) {
            pweight = 800;
        } else if (weight >= 20 && weight <= 49) {
            pweight = 500;
        } else if (weight<=19 && weight>=1){
            pweight = 100;
        }
        
        finalp = price+pconsume+pweight+1000;
        return finalp;
    }
}
