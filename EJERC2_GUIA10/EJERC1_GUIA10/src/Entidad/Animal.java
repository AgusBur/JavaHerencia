/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package Entidad;

public class Animal {
    
    protected String name;
    protected String food;
    protected Integer age;
    protected String race;

    public Animal() {
    }

    public Animal(String name, String food, Integer age, String race) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.race = race;
    }
        
    public void Alimentar(){
        System.out.println("Se alimenta de: ");
    }
}
