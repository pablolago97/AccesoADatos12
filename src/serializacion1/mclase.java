package serializacion1;

import java.io.Serializable;

/**
 *
 * @author plago-bergonpazos
 */
public class mclase implements Serializable {
    private String nombre;
    private transient int numero1;
    private double numero2;

    public mclase(String nombre, int numero1, double numero2) {
        this.nombre = nombre;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public mclase() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "mclase{" + "nombre=" + nombre + ", numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
    
}
