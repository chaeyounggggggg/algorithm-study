import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toUpperCase();
        int[] arr = new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
        }

        int max = -1;
        char result = '?';
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                result = (char)(i + 65); // i+'A'가 더 직관적임
            }
            else if(arr[i]==max)
                result = '?';
        }
        System.out.println(result);
        sc.close();
    }
}
