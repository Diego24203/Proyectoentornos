// Main.java

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando programa...");
        procesarDatos(1);
        mostrarMensaje();
        calcularSuma(5, 10);
        System.out.println("Resultado: " + calcularSuma(5, 10));
        imprimirLista();
        verificarNumero(10);
        verificarNumero(20);
        verificarNumero(30);
        imprimirTexto("Hola");
        imprimirTexto("Hola");
        imprimirTexto("Hola");
        metodoConCodigoDuplicado();
    }

    // Método sin Javadoc y con alta complejidad ciclomática
    public static void procesarDatos(int opcion) {
        if (opcion == 1) {
            System.out.println("Opción 1 seleccionada");
        } else if (opcion == 2) {
            System.out.println("Opción 2 seleccionada");
        } else if (opcion == 3) {
            System.out.println("Opción 3 seleccionada");
        } else if (opcion == 4) {
            System.out.println("Opción 4 seleccionada");
        } else if (opcion == 5) {
            System.out.println("Opción 5 seleccionada");
        } else if (opcion == 6) {
            System.out.println("Opción 6 seleccionada");
        } else if (opcion == 7) {
            System.out.println("Opción 7 seleccionada");
        } else if (opcion == 8) {
            System.out.println("Opción 8 seleccionada");
        } else if (opcion == 9) {
            System.out.println("Opción 9 seleccionada");
        } else {
            System.out.println("Opción desconocida");
        }
    }

    // Método sin documentación y con código duplicado
    public static void mostrarMensaje() {
        System.out.println("Este es un mensaje.");
        System.out.println("Este es un mensaje."); // Código duplicado
        System.out.println("Este es un mensaje."); // Código duplicado
        System.out.println("Este es un mensaje."); // Código duplicado
    }

    // Método sin validación de entradas
    public static int calcularSuma(int a, int b) {
        return a + b;
    }

    // Método con malas prácticas (nombre poco descriptivo y lógica confusa)
    public static void x() {
        int y = 0;
        for (int i = 0; i < 10; i++) {
            y += i;
        }
        System.out.println("Valor de y: " + y);
    }

    // Método con una lista mal implementada
    public static void imprimirLista() {
        String[] lista = {"A", "B", "C", "D"};
        for (int i = 0; i <= lista.length; i++) { // Error de índice fuera de rango
            System.out.println(lista[i]);
        }
    }

    // Método con código duplicado
    public static void verificarNumero(int numero) {
        if (numero == 10) {
            System.out.println("El número es 10");
        } else if (numero == 20) {
            System.out.println("El número es 20");
        } else if (numero == 30) {
            System.out.println("El número es 30");
        } else {
            System.out.println("Número desconocido");
        }
    }

    // Método con código duplicado repetido varias veces
    public static void imprimirTexto(String texto) {
        System.out.println(texto);
        System.out.println(texto); // Código duplicado
        System.out.println(texto); // Código duplicado
    }

    // Método con código duplicado intencional
    public static void metodoConCodigoDuplicado() {
        System.out.println("Bloque 1");
        System.out.println("Bloque 1"); // Código duplicado
        System.out.println("Bloque 2");
        System.out.println("Bloque 2"); // Código duplicado
        System.out.println("Bloque 3");
        System.out.println("Bloque 3"); // Código duplicado
    }

    // Clase interna sin uso ni propósito claro
    static class ClaseSinUso {
        private String nombre;

        public ClaseSinUso(String nombre) {
            this.nombre = nombre;
        }

        public void mostrarNombre() {
            System.out.println(nombre);
        }
    }

    // Otro método con código innecesariamente complejo
    public static void metodoComplejo() {
        int resultado = 0;
        for (int i = 0; i < 10; i++) {
            resultado += i;
        }
        for (int i = 0; i < 10; i++) {
            resultado -= i;
        }
        System.out.println("Resultado final: " + resultado);
    }
}
