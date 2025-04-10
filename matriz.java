public class matriz {

    public static void main(String[] args) {
    }

    public static boolean validarDimensiones(int filas, int columnas) {
        return filas > 0 && columnas > 0;
    }


    public static int[][] crearMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }

    public static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);  // Genera un número aleatorio entre 0 y 9
            }
        }
    }

    public static void mostrarFila(int[][] matriz, int fila) {
        // Verificamos que la fila solicitada esté dentro del rango válido
        if (fila >= 0 && fila < matriz.length) {
            // Imprimir todos los elementos de la fila
            for (int i = 0; i < matriz[fila].length; i++) {
                System.out.print(matriz[fila][i] + " ");
            }
            System.out.println();  // Salto de línea al final
        } else {
            System.out.println("La fila no es válida.");
        }
    }

    public static boolean matrizCero(int[][] matriz) {
        int totalElementos = 0;
        int totalCeros = 0;

        // Contamos los ceros y el total de elementos de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                totalElementos++;
                if (matriz[i][j] == 0) {
                    totalCeros++;
                }
            }
        }

        // Verificamos si los ceros representan más del 50% de los elementos
        return totalCeros > totalElementos / 2;
    }
}
