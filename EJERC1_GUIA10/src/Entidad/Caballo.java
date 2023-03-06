/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package Entidad;

public final class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String name, String food, Integer age, String race) {
        super(name, food, age, race);
    }

    @Override
    public void Alimentar() {
        System.out.println("El caballo "+name+" se alimenta de: "+food);
    }
  
    
}
