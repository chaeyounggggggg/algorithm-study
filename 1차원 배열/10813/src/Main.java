import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();

        int[] arr = new int[n];
        for(int w=0; w<arr.length;w++)
        {
            arr[w] = w + 1;
        }
        for(int p=0;p<m;p++)
        {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp;

            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }

        for(int q=0;q<arr.length;q++)
        {
            System.out.print(arr[q]+" ");
        }
        sc.close();
    }
}
