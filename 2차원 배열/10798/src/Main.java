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

        for(int j=0;j<max;j++)
        {
            for(int i=0;i<5;i++){
                if(j<arr[i].length)
                    System.out.print(arr[i][j]);
            }
        }
        sc.close();
    }
}
