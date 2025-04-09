/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Diego
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("Hola, Codacy!");
        imprimeMensaje();
    }

    public static void imprimeMensaje() {
        System.out.println("Este es un mensaje.");
        System.out.println("Este es un mensaje."); // Bloque duplicado
    }
}
