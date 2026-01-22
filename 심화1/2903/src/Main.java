import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int side = 2;
        for(int i=0;i<n;i++){
            side = side*2-1;
        }
        System.out.println(side*side);
        sc.close();
    }
}
