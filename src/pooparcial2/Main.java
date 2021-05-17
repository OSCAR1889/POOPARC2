/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooparcial2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author op181
 */
public class Main {

    public static void main(String[] args) {
        Administrador Ad = new Administrador("Oscar", "20", "AD", 777);
        System.out.println(Ad.Mostrar());
        Cliente Cl = new Cliente("Oscar", "20", "CL", "1000");
        System.out.println(Cl.Mostrar());
        Usuario Us = new Usuario("Oscar", "20", "US", "POSIBLE ADMI");
        System.out.println(Us.Mostrar());
    }
}
