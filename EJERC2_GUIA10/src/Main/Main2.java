/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
____________________________________________________
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package Main;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        
        Televisor t = new Televisor();
        Lavadora l = new Lavadora();
        ArrayList <Electrodomestico> electList = new ArrayList();
        
        System.out.println("-----------------Calcular precios:--------------------");
        System.out.println("======================TELEVISOR:======================");
        t.crearTelevisor();
        System.out.println("El precio final del televisor elegido es:"+t.precioFinal());
        System.out.println("======================LAVADORA:======================");
        l.crearLavadora();
        System.out.println("El precio final de la lavadora elegida es:"+l.precioFinal());
        l.precioFinal();
                
        electList.add(l);
        electList.add(t);
        Lavadora lav = new Lavadora (30,1000.0,"rojo","A",45.0);
        electList.add(lav);
        Televisor tel = new Televisor (41, true, 1000.0, "blanco", "D", 30.5);
        electList.add(tel);
        
        double total=0;
        for (Electrodomestico e : electList) {
            System.out.println("El precio final es:"+e.precioFinal());
            total+=e.precioFinal();   
        }
        
        System.out.println("El total de todos los electrodomésticos es: "+total);
    }
    
}
