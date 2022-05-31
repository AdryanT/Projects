public class MinimizareTimpAsteptare {

    public static int getMin (int[] a){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<a.length; i++){
            if(a[i] != 0 && a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
    //stergere element din multimea de candidati
    public static void remove (int a[], int min){
        for (int i = 0; i<a.length;i++){
            if (a[i] == min ){
                a[i]=0;
            }
        }
    }
    //functie solutie
    public static int[] solutie(int a[]){
        int[] solutie = new int[a.length];
        int index = 0;
        while (index < a.length){
            int min= getMin(a);
            remove (a, min);
            solutie[index]=min;
            index++;
        }
        return solutie;
    }
    public static void main(String[] args){
        int[] t = {5, 10, 3};
        int[] s =solutie(t);
        for (int i=0;i<s.length;i++){
            System.out.print(s[i]+ " ");
        }
    }

}
