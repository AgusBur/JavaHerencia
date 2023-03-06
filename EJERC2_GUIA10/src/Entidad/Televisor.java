/*
Crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class Televisor extends Electrodomestico{
    
    private int pulgadas;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador, Double price, String color, String consumEnergy, Double weight) {
        super(price, color, consumEnergy, weight);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("De cuántas pulgadas es el televisor?");
        pulgadas = leer.nextInt();
        System.out.println("Tiene sintonizador TDT? S/N");
        if (leer.next().equalsIgnoreCase("S")) {
            sintonizador = true;
        } else {
            sintonizador = false;
        }
    }

    @Override
    public double precioFinal() {
        double pf=0, total=0;
        if (pulgadas>40) {
            pf = (super.price*0.30);
        }  
        if (sintonizador) {
            pf+=500;
        }    
        total= pf+super.precioFinal();
        return total;
    } 
    
}
