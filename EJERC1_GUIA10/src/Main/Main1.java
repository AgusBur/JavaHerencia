/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package Main;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

public class Main1 {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich","pollito",5,"Doberman");
        perro1.Alimentar();
        System.out.println("======================================");
        Animal perro2 = new Perro("Teddy","croquetas",7,"Chihuahua");
        perro2.Alimentar();
        System.out.println("======================================");
        Animal gato = new Gato("Pelusa","galletas",8,"Siamés");
        gato.Alimentar();
        System.out.println("======================================");
        Animal caballo = new Caballo("Spark","pasto",10,"Fino");
        caballo.Alimentar();
        System.out.println("======================================");
    }
    
}
