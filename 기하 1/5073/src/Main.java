import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if(a==0 && b==0 && c==0)
                break;

            int max = Math.max(a,Math.max(b,c));
            if(max<a+b+c-max){
                if(a==b && b==c && a==c)
                    System.out.println("Equilateral");
                else if(a==b || b==c || a==c)
                    System.out.println("Isosceles");
                else if(a!=b && b!=c && a!=c)
                    System.out.println("Scalene");
            }else
                System.out.println("Invalid");
        }
        sc.close();
    }
}
