import java.util.Scanner;
public class Main {
    public static int check(int n){
            int sum = 0;
            for(int i=1;i<n;i++){
                if(n%i==0)
                    sum+=i;
            }
            if(sum==n)
                return 1;
            else
                return 0;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n!=-1){
            if(check(n)==1){
                System.out.print(n+" = ");
                boolean first = true;
                for(int i=1;i<n;i++){
                    if(n%i==0){
                        if(!first) System.out.print(" + "); 
                        System.out.print(i);
                        first = false;
                    }
                }
                System.out.println();
            }else{
                System.out.println(n+" is NOT perfect.");
            }

            n = sc.nextInt();
        }
        
        
        
        sc.close();
    }

    
}
