import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int a,b,c;
       a= sc.nextInt();
       b = sc.nextInt();
       c= sc.nextInt();
       
       int total;
     
       if(a==b && b==c)
        total = 10000+a*1000;
       else if(a==b||b==c)
        total = 1000+b*100;
       else if(a==c)
        total = 1000 + a*100;
       else
       {
        int max = Math.max(a,Math.max(b,c));
        total = max * 100;
       }
        

       System.out.println(total);


        
    }
}
