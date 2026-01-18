import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[100][100];

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=x;j<x+10;j++){
                for(int q=y;q<y+10;q++){
                    arr[j][q] = 1;
                }
            }
        }

        int total = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                total+=arr[i][j];
            }
        }

        System.out.println(total);
        sc.close();
    }
}
