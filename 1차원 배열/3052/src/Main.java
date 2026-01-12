import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[42];

        for(int i=0;i<10;i++)
        {
            int num = sc.nextInt()%42;
            arr[num] = true; 
        }

        int count=0;
        for(int j=0;j<42;j++)
        {
            if(arr[j]==true)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
