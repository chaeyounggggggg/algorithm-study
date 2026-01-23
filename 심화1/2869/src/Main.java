import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int day;
        if((v-a)%(a-b)!=0){
            day = (v-a)/(a-b)+1;
        }else
            day = (v-a)/(a-b);

        System.out.println(day+1);
        sc.close();
    }
}
