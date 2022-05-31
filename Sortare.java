public class Sortare {
    public static void main(String[] args){
        int [] A = {5, 2, 4, 6, 1, 3};
        selectionSort(A);
        for (int i=0; i<A.length; i++){
            System.out.println(A[i] + " ");
        }
    }
    public static void selectionSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            int minj = i;
            int minx = A[i];
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < minx) {
                    minj = j;
                    minx = A[j];
                }

            }
            A[minj]=A[i];
            A[i]=minx;
        }
    }
}
