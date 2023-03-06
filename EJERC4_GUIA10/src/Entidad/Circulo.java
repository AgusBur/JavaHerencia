/*
 Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class Circulo implements CalculoFormas {
 
    private int radio;
    private int diametro;

    public Circulo() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearCirculo() {
        System.out.println("Ingrese el radio:");
        radio = leer.nextInt();
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del círculo es:"+(3.14*(radio*radio)));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del círculo es:"+(2*3.14*radio));
    }
}
