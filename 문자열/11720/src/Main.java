import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int total = 0;
        String s = sc.next();
        for(int i=0;i<n;i++){
            total+=(int)(s.charAt(i))-48;
        }
        System.out.println(total);
        sc.close();
    }
}
