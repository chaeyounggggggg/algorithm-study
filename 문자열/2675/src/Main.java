import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int r = sc.nextInt();
            String s = sc.next();
            
            for(int j=0;j<s.length();j++){
                for(int q=0;q<r;q++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
