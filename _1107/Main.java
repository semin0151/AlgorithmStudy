package _1107;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, m;
    private static boolean[] arr = new boolean[10];
    public static void solution() throws Exception{
        int answer = Math.abs(100-n), tmp;

        for(int i = 0; i < 999999; i++){

            if(checkNum(i)){
                tmp = Math.abs(n-i)+getLen(i);
            }
            else continue;
            answer = Math.min(answer, tmp);
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static int getLen(int num){
        if(num==0) return 1;
        int cnt = 0;
        while(num>0){
            num/=10;
            cnt++;
        }
        return cnt;        
    }
    
    public static boolean checkNum(int num){
        while(num>0){
            if(arr[num%10]) return false;
            num/=10;
        }

        return true;
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        if(m != 0){
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < m; i++){
                int tmp = Integer.parseInt(st.nextToken());
                arr[tmp] = true;
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
