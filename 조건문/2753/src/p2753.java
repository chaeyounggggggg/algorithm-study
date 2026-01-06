import java.util.Scanner;
public class p2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int num=-1;
        if(year%4==0 && year%100!=0)
            num=1;
        else if(year%400==0)
            num=1;
        else
            num=0;
        System.out.println(num);
    }
}
