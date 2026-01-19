// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// public class Main {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

//         String line;
//         while( (line = br.readLine()) != null)
//         {
//             System.out.println(line);
//         }
//     }
// }

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
    }
}