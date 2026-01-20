import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int n = sc.nextInt(); // 단위 센트

            System.out.print(n/25 + " ");
            n = n % 25;
            System.out.print(n/10 + " ");
            n = n % 10;
            System.out.print(n/5 + " ");
            n = n % 5;
            System.out.println(n/1 + " ");
            

        }
        sc.close();
    }
}
