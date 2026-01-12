import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n,m;
       n = sc.nextInt();
       m = sc.nextInt();

       int[] arr = new int[n];
       
       int i,j,k;
       for(int h=0;h<m;h++)
       {
        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextInt();
        for(int p=i;p<=j;p++)
        {
            arr[p-1] = k;
        }
       }

       for(int q=0;q<arr.length;q++)
       {
        System.out.print(arr[q]+" ");
       }
       sc.close();
    }
}
