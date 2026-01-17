import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = n;

        for(int i=0;i<n;i++){
            String s = sc.next();
            int[] arr = new int[26]; // 단어마다 초기화

            for(int j=0;j<s.length()-1;j++){
               char prev = s.charAt(j);
               char cur = s.charAt(j+1);
               arr[s.charAt(j)-'a'] = 1; // 나온 문자 표기
               if(prev!=cur && arr[cur-'a']!=0){ 
                    total--;
                    break;
               }
            }

        }
        System.out.println(total);
        sc.close();
    }
}
