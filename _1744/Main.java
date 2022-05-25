package _1744;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;
    private static PriorityQueue<Integer> plus, minus;
    private static int[] arr;

    public static void solution() throws Exception{
        plus = new PriorityQueue<>(Collections.reverseOrder());
        minus = new PriorityQueue<>();  
        int answer = 0, tmp1, tmp2;

        for(int i = 0; i < n; i++){
            if(arr[i] > 0) plus.offer(arr[i]);
            else minus.offer(arr[i]);
        }

        while(plus.size() > 1){
            tmp1 = plus.poll();
            tmp2 = plus.poll();
            if(tmp1 == 1 || tmp2 == 1) answer += tmp1 + tmp2;
            else answer += tmp1*tmp2;
        }

        if(!plus.isEmpty()) answer += plus.poll();

        while(minus.size() > 1){
            tmp1 = minus.poll();
            tmp2 = minus.poll();
            answer += tmp1*tmp2;
        }

        if(!minus.isEmpty()) answer += minus.poll();
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();

    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
