import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int[] num = new int[n];

        for(int i=0;i<n;i++)
        {
            num[i] = sc.nextInt();
        }

        int find = sc.nextInt();
        int total = 0;

        for(int x : num)
        {
            if(x==find)
                total++;
        }

        System.out.println(total);
    }
}
