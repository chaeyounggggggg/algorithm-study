import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int rx=0,ry=0;
        if(x1==x2)
            rx = x3;
        else if(x1==x3)
            rx = x2;
        else if(x2==x3)
            rx = x1;

        if(y1==y2)
            ry = y3;
        else if(y1==y3)
            ry = y2;
        else if(y2==y3)
            ry = y1;

        System.out.println(rx+" "+ry);
        sc.close();
    }
}
