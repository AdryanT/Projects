public class PermutariSiruri {

    public static void permutare (String str, int l, int r){
        if (l==r){
            System.out.println(str);
        }
        else {
            for (int i=l;i<=r;i++){
                str = swap(str, l, i);
                permutare(str, l+1,r);
            }
        }
    }

    public static String swap( String s, int i, int j){
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args){
        String s = "ABC";
        int n = s.length();
        permutare(s, 0,n-1);
    }

}
