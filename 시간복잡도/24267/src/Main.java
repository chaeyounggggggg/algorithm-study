import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long result = 0;
        for(long i=n-1;i>=1;i--){
            result+=(i*(i-1)/2);
        }
        System.out.println(result);
        System.out.println(3);
        sc.close();
    }
}
