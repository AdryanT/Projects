public class Quicksort {

    static void swap (int[] A, int i, int j){
        int temp= A[i];
        A[i]= A[j];
        A[j]= temp;
    }

    static int partition(int []A, int p, int r){
        int pivot = A[r];
        int i = p -1 ;
        for (int j=p;j<=r;j++){
            if (A[j]<pivot){
                i++;
                swap(A,i,j);
            }
        }
        swap(A,i+1, r);
        return (i+1);
    }


    static void quicksort(int A[],int p, int r) {
        if(p<r){
            int q = partition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);
        }
    }

    public static void main(String[] args){
        int A[] ={10,7,8,9,1,5,2};
        int n = A.length -1;
        quicksort(A,0,n);
        for (int i=0; i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}
