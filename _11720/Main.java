package _11720;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;
    private static String num;

    public static void solution() throws Exception{
        int answer = 0;
        for(int i = 0; i < n; i++){
            answer += num.charAt(i) - '0';
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
        num = br.readLine();
    }

    public static void main(String args[]) throws Exception{
        input();
        solution();
    }

}
