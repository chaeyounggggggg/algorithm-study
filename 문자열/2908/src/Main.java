import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String sa = Integer.toString(a);
        String sb = Integer.toString(b);

        String ra = "";
        for(int i=2;i>=0;i--){
            ra+=sa.charAt(i);
        }

        String rb = "";
        for(int i=2;i>=0;i--){
            rb+=sb.charAt(i);
        }

        if(Integer.parseInt(ra)>Integer.parseInt(rb))
            System.out.println(ra);
        else
            System.out.println(rb);
        sc.close();
    }
}
