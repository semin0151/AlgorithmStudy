package _11004;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static PriorityQueue<Integer> pq = new PriorityQueue<>();

    private static int n, k;

    public static void solution() throws Exception{
        for(int i = 0; i < k-1; i++) pq.poll();
        bw.write(Integer.toString(pq.poll()));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) pq.offer(Integer.parseInt(st.nextToken()));
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
