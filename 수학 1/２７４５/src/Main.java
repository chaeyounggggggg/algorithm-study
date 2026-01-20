import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int b = sc.nextInt();

        int sec = 0;
        int jinsu = 1;
        int total = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                sec = s.charAt(i)-'A' + 10;
                total += sec * jinsu;
                jinsu *= b;
            }else{
                sec = s.charAt(i) - '0';
                total += sec * jinsu;
                jinsu *= b;
            }
        }

        System.out.println(total);
        sc.close();
    }
}
