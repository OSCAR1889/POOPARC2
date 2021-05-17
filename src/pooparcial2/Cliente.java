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
public class Cliente extends Persona {
    String  Comprar;
    public Cliente(String nombre, String edad, String cod,String Comprar) {
        super(nombre, edad, cod);
        this.Comprar=Comprar;
        
    }
    public String Mostrar(){
        return super.Mostrar()+"\nGastando dinero"
                +Comprar;
    }
    
}
