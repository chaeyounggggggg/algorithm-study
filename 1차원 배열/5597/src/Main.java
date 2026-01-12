import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[30];

        //출석번호에 맞게 배열에 입력받기
        for(int i=0;i<28;i++)
        {
            int n = sc.nextInt();
            arr[n-1] = n;
        }

        // 제출안한 번호 배열로 받기
        int[] result = new int[2];
        int q=0;
        for(int j=0;j<arr.length;j++)
        {
            
            if(arr[j]==0){
                result[q]=j+1;
                q++;
            }
                
        }      

        //작은것부터 출력
        if(result[0]<result[1])
        {
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
        else{
            System.out.println(result[1]);
            System.out.println(result[0]);
        }
        sc.close();
    }
}
