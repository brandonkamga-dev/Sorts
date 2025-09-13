package Sorts.BubbleSort;
import java.util.Arrays;

public class Main {

    public void swap(int[] T, int i, int j) {
        int temp = T[i];
        T[i] = T[j];
        T[j] = temp;
    }

    public void sort(int[] T) {
        System.out.println(T.length);
        System.out.println(T[4]);
        System.out.println(T[3]);
        for (int i = 0; i < T.length - 1; i++) {
            for (int j = 0; j < T.length - 1 - i; j++) {
                if (T[j] < T[j + 1]) {
                    swap(T, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] T = {1, 3, 2, 5};
        Main m = new Main();
        System.out.println("Avant tri : " + Arrays.toString(T));
        m.sort(T);
        System.out.println("Après tri : " + Arrays.toString(T));
    }
}

