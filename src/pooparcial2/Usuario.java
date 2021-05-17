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
public class Usuario extends Persona {
    String usu;
    public Usuario(String nombre, String edad, String cod,String usu) {
        super(nombre, edad, cod);
        this.usu=usu;
    }
    public String Mostrar(){
        return super.Mostrar()+"\n El usuario pasa a ser: " + usu;
    } 
}
