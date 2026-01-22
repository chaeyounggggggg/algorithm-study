import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int diag = 0; // 몇번째 대각선에 있는지
        
        int term = 1;
        int count = 0; 
        while(count<x){
            count+=term;
            term++;
            diag++;
        }

        int prevSum = (diag-1)*diag/2;
        int pos = x-prevSum;
        int son,mom;
        
        if(diag%2!=0){
            son = diag-(pos-1);
            mom = pos;
        }else{
            son = pos;
            mom = diag-(pos-1);
        }
    
        System.out.println(son+"/"+mom);

        sc.close();
    }
}
