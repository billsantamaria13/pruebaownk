/*
 * Decompiled with CFR 0.137.
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class GaussJordan {
    private static Scanner entrada;

    public static void main(String[] args) {
        int x;
        entrada = new Scanner(System.in);
        int var = 3;
        int piv = 0;
        System.out.println("Sistema de ecuaciones Gauss_Jordan");
        System.out.println("\nMatriz de 3x3\n");
        float[][] matriz = new float[var][var + 1];
        for (x = 0; x < var; ++x) {
            for (int y = 0; y < var + 1; ++y) {
                System.out.println("Ingrese el numero de la posicion: A[" + (x + 1) + "][" + (y + 1) + "]");
                matriz[x][y] = entrada.nextFloat();
            }
        }
        for (int a = 0; a < var; ++a) {
            Reglas.pivote(matriz, piv, var);
            System.out.println("Renglon " + (a + 1) + " entre el pivote");
            Reglas.mostrarmatriz(matriz, var);
            System.out.println("");
            System.out.println("Ceros");
            Reglas.ceros(matriz, piv, var);
            Reglas.mostrarmatriz(matriz, var);
            System.out.println("");
            ++piv;
        }
        for (x = 0; x < var; ++x) {
            System.out.println("La variable X" + (x + 1) + " es: " + matriz[x][var]);
        }
    }
}

