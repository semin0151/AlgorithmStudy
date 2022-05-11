package _1056;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    
    private static int n;

    public static void solution() throws Exception{
        int cnt = 0;
        for(int i = 1; i <= n; i++) if(isAnswer(i)) cnt++;
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
    }
    
    public static void main(String args[]) throws Exception{
        input();
        solution();
    }

    public static boolean isAnswer(int num){
        if(num < 100) return true;
        else{
            int a = num / 100;
            int b = (num % 100)/10;
            int c = num % 10;
            if( a - b == b - c) return true;
            else return false;
        }
    }
}
