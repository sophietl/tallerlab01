import java.util.Scanner;

public class matriz {

    // Dimensiones.
    public static void main(String[] args) {
        int[] dimensiones = solicitarDimensiones();
        int filas = dimensiones[0];
        int columnas = dimensiones[1];

        // Verificar si el valor de las dimensiones es válido.
        if (validarDimensiones(filas, columnas)) {
            int[][] matriz = crearMatriz(filas, columnas);
            llenarMatriz(matriz);

            // Menú.
            menu(matriz);
        } else {
            System.out.println("Las dimensiones de la matriz no son válidas.");
        }
    }

    public static int[] solicitarDimensiones() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();
        return new int[]{filas, columnas};
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
                matriz[i][j] = (int) (Math.random() * 10);  // Genera un número aleatorio entre 0 y 9.
            }
        }
    }

    public static void mostrarFila(int[][] matriz, int fila) {
        // Verificar que los valores son válidos.
        if (fila >= 0 && fila < matriz.length) {
            // Mostrar todos los elementos de la fila.
            for (int i = 0; i < matriz[fila].length; i++) {
                System.out.print(matriz[fila][i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("La fila no es válida.");
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static boolean matrizCero(int[][] matriz) {
        int totalElementos = 0;
        int totalCeros = 0;

        // Contamos los ceros y el total de elementos de la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                totalElementos++;
                if (matriz[i][j] == 0) {
                    totalCeros++;
                }
            }
        }

        // Verificamos si los ceros representan más del 50% de los elementos.
        return totalCeros > totalElementos / 2;
    }

    public static void menu(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Crear y llenar matriz");
            System.out.println("2. Mostrar la matriz");
            System.out.println("3. Mostrar fila");
            System.out.println("4. Verificar si la matriz es de tipo cero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Crear y llenar la matriz.
                    llenarMatriz(matriz);
                    System.out.println("Matriz creada y llena con valores aleatorios.");
                    break;
                case 2:
                    // Mostrar la matriz.
                    System.out.println("Matriz completa:");
                    mostrarMatriz(matriz);
                    break;
                case 3:
                    // Mostrar fila en específico (indicada por el usuario).
                    System.out.print("Ingrese el número de la fila que desea mostrar: ");
                    int fila = scanner.nextInt();
                    mostrarFila(matriz, fila);
                    break;
                case 4:
                    // Verificar si la matriz es de tipo cero.
                    if (matrizCero(matriz)) {
                        System.out.println("La matriz SI es de tipo cero.");
                    } else {
                        System.out.println("La matriz NO es de tipo cero.");
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}

