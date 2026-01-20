import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        String total = "";
        while(n>0){
            if(n%b>=10){
                total += (char)(n%b + 55);
            }else{
                total += (char)(n%b + 48);
            }
            n = n/b;
        }

        String rTotal = "";
        for(int i=total.length()-1;i>=0;i--){
            rTotal += total.charAt(i);
        }

        System.out.println(rTotal);
        sc.close();
    }
}
