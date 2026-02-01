import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a,Math.max(b, c));
        int twoLine = a+b+c - max;
        if(twoLine <= max){
            max = a+b+c - max - 1;
            System.out.println(max+twoLine);
        }else{
            System.out.println(a+b+c);
        }
        sc.close();
    }
}
