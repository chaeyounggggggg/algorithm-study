import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
       
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wt = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(reader.readLine());

        for(int i=0;i<t;i++)
        {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            wt.write((a+b) + "\n");
        }

        wt.flush();
    }
}
