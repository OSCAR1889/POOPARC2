/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooparcial2;

/**
 *
 * @author op181
 */
public class Administrador extends Persona {

    String regAd;
    int numAD;

    public Administrador(String nombre, String edad,
            String cod, int numAD) {
        super(nombre, edad, cod);
        this.regAd = ("por ser el admi");
        this.numAD = numAD;
    }

    public String Mostrar() {
        return super.Mostrar() + "\n El hace lo que quiera " + regAd
                + "y su numeros seria " + numAD;
    }
}
