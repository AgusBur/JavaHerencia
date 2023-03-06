/*
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;

/**
 * @author Agustina
 */
public class Rectangulo implements CalculoFormas {
 
    private int altura;
    private int base;

    public Rectangulo() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearRectangulo() {
        System.out.println("Ingrese la base:");
        base = leer.nextInt();
        System.out.println("Ingrese la altura:");
        altura = leer.nextInt();
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del rectángulo es:"+(base*altura));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del rectángulo es:"+((2*base)+(2*altura)));
    }
    
}
