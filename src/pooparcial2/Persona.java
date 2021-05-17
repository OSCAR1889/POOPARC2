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
public class Persona {
    String nombre,edad,cod;
    public Persona (String nombre, String edad,String cod){
        this.nombre=nombre;
        this.edad=edad;
         this.cod=cod;
    }
    public String Mostrar(){
     return "el nobre es: "+nombre+" \n la edad es: "+edad;   
    }
}
