import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long result = n+3;

        result += (n-1)*3;
        

        System.out.println(result);
        sc.close();
    }
}
