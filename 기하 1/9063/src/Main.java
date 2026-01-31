import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int minX = 10001;
        int maxX = -10001;
        int minY = 10001;
        int maxY = -10001;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            
            int y = sc.nextInt();
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }
        System.out.println((maxX-minX)*(maxY-minY));
        sc.close();
    }
}
