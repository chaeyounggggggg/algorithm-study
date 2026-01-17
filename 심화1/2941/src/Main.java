import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int total = 0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && s.charAt(i)=='c' && (s.charAt(i+1)=='=' || s.charAt(i+1)=='-')){
                total++;
                i=i+1;
            }else if(i+2< s.length() && s.charAt(i)=='d' && s.charAt(i+1)=='z' && s.charAt(i+2)=='='){
                total++;
                i=i+2;
            }else if(i+1<s.length() && s.charAt(i)=='d' && s.charAt(i+1)=='-'){
                total++;
                i=i+1;
            }else if(i+1<s.length() && (s.charAt(i)=='l' || s.charAt(i)=='n') && s.charAt(i+1)=='j'){
                total++;
                i=i+1;
            }else if(i+1<s.length() && (s.charAt(i)=='s' || s.charAt(i)=='z') && s.charAt(i+1)=='='){
                total++;
                i=i+1;
            }else
                total++;
            
        }
        System.out.println(total);
        sc.close();
    }
}
