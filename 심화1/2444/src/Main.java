import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = n-1;
        int l = n-1;

        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                if(j<f)
                {
                    System.out.print(" ");
                }else if(j<=l){
                    System.out.print("*");
                }else{
                    break;
                }

            }
            if(i>=n){
                f++;
                l--;
            }else{
                f--;
                l++;
            }
            System.out.println();
        }
        sc.close();
    }
}
