import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long a1 = sc.nextLong();
        long a0 = sc.nextLong();

        long c = sc.nextLong();

        long n0 = sc.nextLong();
        
        if(c<a1)
            System.out.println(0);
        else if(c==a1){
            if(a0<=0)
                System.out.println(1); 
            else
                System.out.println(1);
        }
        else if(a0<=(c-a1)*n0)
            System.out.println(1);
        else
            System.out.println(0);
        sc.close();
    }
}
