import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][];
        int max = 0;
        for(int i=0;i<5;i++){
            String s = sc.next();
            arr[i] = s.toCharArray();
            max = Math.max(max, arr[i].length);
        }
        for(int i = 0;i<max;i++){
            for(int j = 0;j<5;j++){
                System.out.print(arr[j][i]);
            }
        }
        sc.close();
    }
}
