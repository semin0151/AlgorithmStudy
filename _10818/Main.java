package _10818;
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static String str;
    private static int n;

    public static void solution() throws Exception{
        int max = -1000001, min = 1000001;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num > max) max = num;
            if(num < min) min = num;
        }
        bw.write(Integer.toString(min) + " " + Integer.toString(max));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
        str = br.readLine();
        st = new StringTokenizer(str);
    }

    public static void main(String arg[]) throws Exception{
        input();
        solution();
    }
}
