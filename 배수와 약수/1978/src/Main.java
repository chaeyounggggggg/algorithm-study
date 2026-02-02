import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            int check = 1;
            if(num<=1){
                check = 0;
            }
            for(int j=2;j<num-1;j++){
                if(num%j==0){
                    check = 0;
                    break;
                }
                   
            }
            count += check;
        }
        System.out.println(count);
        sc.close();
    }
}
