import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int sum = d1 + d2 + d3;

        if(sum==180 && d1==d2 && d2==d3)
            System.out.println("Equilateral");
        else if(sum==180 && (d1==d2 || d2==d3 || d1==d3))
            System.out.println("Isosceles");
        else if(sum==180 && d1!=d2 && d2!=d3 && d1!=d3)
            System.out.println("Scalene");
        else
            System.out.println("Error");
        sc.close();
    }
}
