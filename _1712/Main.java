package _1712;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    static int a, b, c;

    public static void solution() throws Exception{
        if(c-b <= 0) bw.write("-1");
        else{
            int answer = a / (c-b) + 1;
            bw.write(Integer.toString(answer));
        }
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        String str = br.readLine();
        st = new StringTokenizer(str);
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
