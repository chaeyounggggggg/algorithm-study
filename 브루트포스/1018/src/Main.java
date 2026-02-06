import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] arr = new char[n][m];
        for(int i=0;i<n;i++){
            String line = sc.next();
            for(int j=0;j<m;j++){
                arr[i][j] = line.charAt(j);
            }
        }

        int wresult=0;
        int bresult=0;
        int min = 65;
        for(int i=0;i<=n-8;i++){
            for(int j=0;j<=m-8;j++){
                wresult = 0;
    
                for(int k=i;k<i+8;k++){
                    for(int h=j;h<j+8;h++){
                        if((k+h)%2==0 && arr[k][h]!='W'){
                            wresult++;
                        }else if((k+h)%2!=0 && arr[k][h]!='B')
                            wresult++;
                    }
                }
                bresult = 64-wresult;
                min = Math.min(min,Math.min(wresult,bresult));
            }
            
        }
        
        System.out.println(min);
        sc.close();
    }
}
