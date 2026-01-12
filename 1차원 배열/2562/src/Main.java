import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       
       int[] arr = new int[9];

       for(int i=0;i<9;i++)
       {
            arr[i] = sc.nextInt();
       }
       int max = arr[0];
       int id = 0;

       for(int j=0;j<9;j++)
       {

        if(arr[j]>max)
           {
            max=arr[j];
            id = j;
           } 
       }

       System.out.println(max);
       System.out.println(id+1);
       sc.close();

    }
}
