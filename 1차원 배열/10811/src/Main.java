import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        int[] arr = new int[n];
        for(int k=0;k<arr.length;k++)
        {
            arr[k] = k+1;
        }

        for(int k=0;k<m;k++)
        {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
        sc.close();
    }
}
