/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package Entidad;

import java.util.*;

/**
 * @author Agustina
 */
public class Alquiler {
    
    private String name;
    private int dni;
    private Date in;
    private Date out;
    private int position;
    private Barco boat;

    public Alquiler() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getIn() {
        return in;
    }

    public void setIn(Date in) {
        this.in = in;
    }

    public Date getOut() {
        return out;
    }

    public void setOut(Date out) {
        this.out = out;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Barco getBoat() {
        return boat;
    }

    public void setBoat(Barco boat) {
        this.boat = boat;
    }
    
    
    
}
