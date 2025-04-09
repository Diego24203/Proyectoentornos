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
        // Llamada a métodos sin documentación
        imprimirMensaje();
        calcularSuma(5, 10);
        System.out.println("Resultado: " + calcularSuma(5, 10));
    }

    // Método sin Javadoc y con código duplicado
    public static void imprimirMensaje() {
        System.out.println("Este es un mensaje.");
        System.out.println("Este es un mensaje."); // Código duplicado
    }

    // Método sin validación de entradas
    public static int calcularSuma(int a, int b) {
        return a + b;
    }

    // Método con alta complejidad (no sigue el principio KISS)
    public static void procesarDatos(int opcion) {
        if (opcion == 1) {
            System.out.println("Opción 1 seleccionada");
        } else if (opcion == 2) {
            System.out.println("Opción 2 seleccionada");
        } else if (opcion == 3) {
            System.out.println("Opción 3 seleccionada");
        } else if (opcion == 4) {
            System.out.println("Opción 4 seleccionada");
        } else {
            System.out.println("Opción desconocida");
        }
    }
}
