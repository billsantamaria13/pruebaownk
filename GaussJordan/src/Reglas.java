/*
 * Decompiled with CFR 0.137.
 */
import java.io.PrintStream;

public class Reglas {
    static void mostrarmatriz(float[][] matriz, int var) {
        for (int x = 0; x < var; ++x) {
            for (int y = 0; y < var + 1; ++y) {
                System.out.print(" " + matriz[x][y] + " |");
            }
            System.out.println("");
        }
    }

    static void pivote(float[][] matriz, int piv, int var) {
        float temp = 0.0f;
        temp = matriz[piv][piv];
        System.out.println(temp);
        for (int y = 0; y < var + 1; ++y) {
            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }

    static void ceros(float[][] matriz, int piv, int var) {
        for (int x = 0; x < var; ++x) {
            if (x == piv) continue;
            float c = matriz[x][piv];
            System.out.println(c);
            for (int z = 0; z < var + 1; ++z) {
                matriz[x][z] = -1.0f * c * matriz[piv][z] + matriz[x][z];
            }
        }
    }
}

