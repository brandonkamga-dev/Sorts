package Sorts.InsertionSort;

public class Main {

    public void insertionSort(int[] T) {
        for (int i = 1; i < T.length; i++) {
            int x = T[i];
            int j = i;
            while (j > 0 && T[j - 1] > x) {
                T[j] = T[j - 1];
                j--;
            }
            T[j] = x;
        }
    }

    public static void main(String[] args) {
        Main sorter = new Main();
        int[] array = {5, 2, 9, 1, 5, 6};
        sorter.insertionSort(array);

        // Affichage du tableau trié
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
