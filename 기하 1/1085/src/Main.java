import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int left = x;
        int right = w-x;
        int up = h-y;
        int down = y;

        int min = Math.min(left, right);
        min = Math.min(min,up);
        min = Math.min(min,down);

        System.out.println(min);

        sc.close();
    }
}
