import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }

        double total = 0;
        for(int i=0;i<arr.length;i++)
        {
            total += (double) arr[i]/max*100;
        }

        double avg = total/n;
        System.out.println(avg);         
         
        sc.close();
    }
}
