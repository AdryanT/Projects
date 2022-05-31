public class CautareBinara {
    public static int cautareBinara (int A[],int x, int low, int high ){
        if (low < high){
            int mid= (low+high)/2;
            if (x== A[mid]){
                return mid;
            }
            if (x < A[mid]){
                return cautareBinara(A, x, low, mid-1);
            }
            else{
                return cautareBinara(A, x, mid+1, high);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int A[]={2,3,4,10,40};
        int n= A.length -1;
        int x= 10;
        int result= cautareBinara(A,x,0,n);
        if (result==-1){
            System.out.println("Elementul nu exista in sir");
        }
        else {
            System.out.println("Elementul gasit pe pozitia " + result);
        }
    }
}
