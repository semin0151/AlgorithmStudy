package _15829;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;
    private static String str;
    public static void solution() throws Exception{
        long answer = 0;
        for(int i = 0; i < n; i++){
            answer += (str.charAt(i) - 'a' + 1)*getPow(31,i);
            answer %= 1234567891;
        }

        bw.write(Long.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
        str = br.readLine();
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }

    public static long getPow(long num, long time){
        long answer = 1;
        for(int i = 1; i <= time; i++){
            answer *= 31;
            answer %= 1234567891;
        }
        return answer;
    }
}
