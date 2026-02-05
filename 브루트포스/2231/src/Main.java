import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int k = String.valueOf(n).length();
        
        long min = 1000000;
        for(long i=n-(9*k);i<=n;i++){
            long sum = 0;
            long x = i;
            while(x!=0){
                sum+=x%10;
                x = x/10;
            }
            sum+=i;
            if(sum==n && i<min){
                min = i;
            }
        }
        if(min==1000000)
            System.out.println(0);
        else
            System.out.println(min);
        sc.close();
    }
}
