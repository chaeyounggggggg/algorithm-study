import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        float total = 0;
        int totalNum = 0;
        for(int i=0;i<20;i++){
            String title = sc.next();
            double num = sc.nextDouble();
            String score = sc.next();
            switch (score) {
                case "A+":
                    total+=4.5*num;
                    totalNum+=num;
                    break;
                case "A0":
                    total+=4.0*num;
                    totalNum+=num;
                    break;
                case "B+":
                    total+=3.5*num;
                    totalNum+=num;
                    break;
                case "B0":
                    total+=3.0*num;
                    totalNum+=num;
                    break;
                case "C+":
                    total+=2.5*num;
                    totalNum+=num;
                    break;
                case "C0":
                    total+=2.0*num;
                    totalNum+=num;
                    break;
                case "D+":
                    total+=1.5*num;
                    totalNum+=num;
                    break;
                case "D0":
                    total+=1.0*num;
                    totalNum+=num;
                    break;
                case "F":
                    total+=0.0*num;
                    totalNum+=num;
                    break;
                default:
                    break;
            }
            
        }
        System.out.println(total/totalNum);
        sc.close();
    }
}
