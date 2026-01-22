import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int result = 1;
       int plus = 0;
       int line = 1;
       
       while(line<n){
        plus+=6;
        line+=plus;
        result++;
       }
       

       System.out.println(result);
       sc.close();
    }
}
