import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,1,2,2,2,8};
        for(int i=0;i<6;i++)
        {
            int n = sc.nextInt();
            System.out.print(arr[i]-n+" ");
        }
        sc.close();
    }
}
