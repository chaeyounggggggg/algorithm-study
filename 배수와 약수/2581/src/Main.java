import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        
        int min = 10001;
        for(int i=m;i<=n;i++){
            if(i<=1)
                continue;
            int check = 1;
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    check = 0;
                    break;   
                }
            }
            if(check==1){
                sum+=i;
                min = Math.min(min, i);
            }
                
        }
        
        if(sum==0)
            System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
        
        sc.close();
    }
}
