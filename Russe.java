public class Russe {
    public static void main(String[] args){
        System.out.println(inmultire(52,15));
    }
    public static int inmultire(int a, int b){
        int [] x = new int [100];
        int [] y = new int [100];
        x[0] = a;
        y[0] = b;
        int i = 0;
        int prod =0;
        while  (x[i]>1){
            x[i+1]= x[i]/2;
            y[i+1]=y[i]*2;
            i++;
            if(x[i]% 2 == 1){
                prod= prod+y[i];
            }
        }
        return prod;
    }
}
