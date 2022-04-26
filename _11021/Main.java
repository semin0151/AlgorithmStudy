package _11021;
import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;
    public static void main(String args[]) throws Exception{
        n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + Integer.toString(i) + ": " + Integer.toString(a+b) + "\n");
        }
        bw.flush();
        bw.close();
    }    
}
