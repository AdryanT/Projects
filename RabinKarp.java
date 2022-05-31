public class RabinKarp {

    static void search (String text, String pattern, int d, int q ){
        int n = text.length();
        int m = pattern.length();
        int p = 0, t=0;
        int h =1;
        int j;

        for (int i = 0; i <m-1; i++){
            h= (h*d)%q;

        }

        for (int i=0; i<m;i++){
            p = (d*p+pattern.charAt(i))%q;
            t = (d*t+ text.charAt(i))%q;
        }
        for (int s= 0; s<n-m;s++){
            if (p ==t){
                for ( j = 0; j< m; j++){
                    if (text.charAt(s+j) != pattern.charAt(j)){
                        break;
                    }
                }
                if (j ==m ){
                    System.out.println("Secventa gasita pe pozitia " +s);
                }
            }
            if (s < n-m){
                t = (d * (t - text.charAt(s) * h)+text.charAt(s + m)) % q;
                if (t<0){
                    t=t+q;
                }
            }
        }

    }

    public static void main(String[] args) {
        String text = "ABCCDDAEFGCDDT";
        String pattern = "CDD";
        int d = 35;
        int q =13;
        search(text, pattern,d,q);
    }

}
