/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package Entidad;

import java.util.Scanner;

/**
 * @author Agustina
 */
public class Barco {
    
    protected int matricula;
    protected int eslora;
    protected int year;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearBarco() {
        System.out.println("Ingrese el numero de matrícula");
        matricula = leer.nextInt();
        System.out.println("Ingrese eslora en metros:");
        eslora = leer.nextInt();
        System.out.println("Ingrese año de fabricación:");
        year = leer.nextInt();
    }
    
}
