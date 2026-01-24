import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        int none = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                System.out.println(i);
                none = 1;
                break;
            }    
        }
        if(none!=1)
            System.out.println(0);
        sc.close();
    }
}
