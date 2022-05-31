public class Euclid {
    public static void main(String[] args){
        System.out.print(euclid(102, 18));
    }
    public static int euclid(int m, int n){
        while (n!=0){
            int temp =n;
                    n= m % n;
                    m= temp;
        }
return m;
    }
}

