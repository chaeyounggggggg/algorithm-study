import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] first = new int[n][m];
        int[][] second = new int[n][m];
        int[][] total = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                first[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                second[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total[i][j] = first[i][j]+second[i][j];
                System.out.print(total[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
