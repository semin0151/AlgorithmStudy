package _1049;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, m, six = Integer.MAX_VALUE, one = Integer.MAX_VALUE;

    public static void solution() throws Exception{
        int size = ((n/6) + 1)*6;
        int[] dp = new int[size + 1];

        for(int i = 1; i <= size; i++){
            dp[i] = dp[i-1] + one;
        }

        for(int i = 6; i <= size; i++){
            dp[i] = Math.min(dp[i], dp[i-6] + six);
        }

        int answer = Math.min(dp[n], dp[size]);
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();

    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            six = Math.min(six, Integer.parseInt(st.nextToken()));
            one = Math.min(one, Integer.parseInt(st.nextToken()));
        }   
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
