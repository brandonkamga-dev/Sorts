package SelectionSort;

public class Main {

    public void swap(int[] T, int i, int j) {
        int temp = T[i];
        T[i] = T[j];
        T[j] = temp;
    }
    
    public void selectionSort(int[] T) {
        int min;
        for (int i = 0; i < T.length - 1; i++) { 
            min = i;
            for (int j = i + 1; j < T.length; j++) {
                if (T[j] < T[min]) {
                    min = j; 
                } 
            }
            if (min != i) {
                swap(T, i, min);
            }
        }
    }

    public static void main(String[] args) {
        Main sorter = new Main();
        int[] tab = {7, 3, 5, 2};
        
        sorter.selectionSort(tab);
        
        for (int val : tab) {
            System.out.print(val + " ");
        }
    }
}
