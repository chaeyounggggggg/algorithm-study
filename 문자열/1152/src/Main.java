import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        String s = sc.nextLine().trim();
        String[] sp = s.split(" ");

        if(s.isEmpty())
            System.out.println(0);
        else{
            System.out.println(sp.length);
        }
        sc.close();
    }
}
