import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int blank = n-1;
        int star = 1;
        for(int i=0;i<2*n-1;i++){
            System.out.print(" ".repeat(blank));
            System.out.println("*".repeat(star));
            if(i<n-1){
                blank--;
                star+=2;
            }else{
                blank++;
                star-=2;
            }
        }
        sc.close();
    }
}
