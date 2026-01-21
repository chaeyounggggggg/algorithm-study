import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        String[] replace = {
            "c=","c-","dz=","d-","lj","nj","s=","z="
        };

        for(int i=0;i<=replace.length;i++){
            String p = replace[i];
            s = s.replace(p,"a");
        }
        
        System.out.println(s.length());
        sc.close();
    }
}
