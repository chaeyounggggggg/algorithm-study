import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int b = sc.nextInt();

        int num = 0;
        int jinsu = 1;
        int total = 0;
        for(int i=s.length()-1;i>=0;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                num = s.charAt(i) - 'A' + 10;
                total += num*jinsu;
                jinsu *= b;
            }else{
                num = s.charAt(i) - '0';
                total += num*jinsu;
                jinsu *= b;
            }
        }

        System.out.println(total);
        sc.close();
    }
}
