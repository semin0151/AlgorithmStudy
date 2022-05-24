package _1790;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    static long n, k;
    public static void solution() throws Exception{
        int answer = -1;
        for(int i = 1; i <= 10; i++){
            long cnt = (long)Math.pow(10, i) - (long)Math.pow(10, i-1);
            cnt *= i;
            
            if(k <= cnt){
                long tmp = (long)Math.pow(10, i-1) + (k-1)/i;
                
                if(tmp > n) break;
                else{
                    String str = Long.toString(tmp);
                    int idx = (int)((k-1) %i);
                    answer = str.charAt( idx ) - '0';
                    break;
                }
            } 
            else k -= cnt;
        }
        
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Long.parseLong(st.nextToken());
        k = Long.parseLong(st.nextToken());
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
