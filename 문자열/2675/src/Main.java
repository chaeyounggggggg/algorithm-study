import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=0;i<t;i++) //테스트 케이스만큼 반복
        {
            int r = sc.nextInt();
            String s = sc.next();
            for(int j = 0; j<s.length();j++) //문자열 길이만큼 반복
            {
                for(int k=0;k<r;k++){ // 각 문자에 접근, 횟수만큼 반복
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
