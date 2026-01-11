import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int[] arr = new int[n];
       
       int min = 1000000;
       int max = -1000000;

       for(int i=0; i<arr.length; i++)
       {
        arr[i] = sc.nextInt();
        if(arr[i]>max)
            max = arr[i];
        if(arr[i]<min)
            min = arr[i];
       }
       
       System.out.println(min+" "+max);
       sc.close();
    }
}
