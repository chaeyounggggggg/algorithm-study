import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int b = sc.nextInt();
        /*
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
        */
        while(n>0){
            if(n%b>=10)
                sb.append((char)(n%b + 'A' - 10));
            else
                sb.append(n%b);
            n = n/b;
        }

        System.out.println(sb.reverse());
        sc.close();
    }
}
