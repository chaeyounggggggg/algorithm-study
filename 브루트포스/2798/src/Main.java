import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int best = 0;
        for(int i=0;i<=n-3;i++){
            int sum = 0;
            for(int j=i+1;j<=n-2;j++){
                for(int k=j+1;k<=n-1;k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum<=m && sum>best)
                        best = sum;
                }
            }
        }

        System.out.println(best);
        sc.close();
    }
}
