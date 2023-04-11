
public class conv2Binery {
    public static void main(String[] args) {
        int n = 12;
        int ans[] = new int[32];
        int i = 0;
        
        while( n > 0 ){
            int rem = n % 2;
            n = n/2;
            ans[i]= rem;
            i++;
        }

        for (int j=ans.length; j<=0; j--) {
            System.out.println(ans[j]);
        }
    }
}
