package _1715;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static ArrayList<Long> arr = new ArrayList<>();

    public static void solution() throws Exception{
        long answer = 0;
        PriorityQueue<Long> PQ = new PriorityQueue<>();
        for(Long num : arr){
            PQ.offer(num);
        }
        
        while(PQ.size() > 1){
            long tmp = PQ.poll() + PQ.poll();
            answer += tmp;
            PQ.offer(tmp);
        }
        
        bw.write(Long.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());    
        for(int i = 0 ;i < n; i++){
            arr.add(Long.parseLong(br.readLine()));
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}  
