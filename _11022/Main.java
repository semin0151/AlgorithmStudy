package _11022;
import java.io.*;
import java.util.*;
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws Exception{
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(getString(i, a, b));
        }
        bw.flush();
        bw.close();
    }

    public static String getString(int i, int a, int b){
        String str = "Case #" + Integer.toString(i) + ": " + Integer.toString(a) + " + " + Integer.toString(b) + " = " + Integer.toString(a+b) + "\n";
        return str;
    }
}
