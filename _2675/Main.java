package _2675;
import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int testcase;

    public static void solution() throws Exception{
        for(int i = 0; i < testcase; i++){
            String str = br.readLine();
            st = new StringTokenizer(str);
            
            int n = Integer.parseInt(st.nextToken());
            String tmp = st.nextToken();
            int size = tmp.length();
            
            for(int j = 0; j < size; j++){
                for(int k = 0; k < n; k++){
                    bw.write(tmp.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        testcase = Integer.parseInt(br.readLine());
    }

    public static void main(String args[]) throws Exception{
        input();
        solution();
    }
}
