import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String sa = String.valueOf(a);
        String sb = String.valueOf(b);

        String ra = "";
        String rb = "";

        for(int i=sa.length()-1;i>=0;i--){
            ra += sa.charAt(i);
        }
        for(int i=sb.length()-1;i>=0;i--){
            rb += sb.charAt(i);
        }

        if(Integer.valueOf(ra) > Integer.valueOf(rb))
            System.out.println(ra);
        else
            System.out.println(rb);


        sc.close();
    }
}
