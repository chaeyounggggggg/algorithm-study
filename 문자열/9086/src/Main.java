import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            String s = sc.next();
            System.out.print(s.charAt(0));
            System.out.print(s.charAt(s.length()-1));
            System.out.println();
        }
        

        sc.close();
    }
}
