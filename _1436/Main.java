package _1436;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;
    public static void solution() throws Exception{
        int num = 666;
        int idx = 0;
        while(true){
            if(checkNum(num))idx++;

            if(idx == n){
                bw.write(Integer.toString(num));
                break;
            }
            num++;
        }
        
        bw.flush();
        bw.close();
        
    }

    public static boolean checkNum(int num){
        int cnt = 0;
        while(num>0){
            if(num%10 == 6) cnt++;
            else cnt = 0;

            num/=10;

            if(cnt == 3) return true;
        }
        return false;
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
