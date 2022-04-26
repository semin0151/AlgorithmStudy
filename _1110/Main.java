package _1110;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int num;
    
    public static void solution() throws Exception{
        int cnt = 0, copy_num = num;
        while(true){
            cnt++;
            int tmp = (num/10) + (num%10);
            num = ((num%10)*10) + tmp%10;

            if(num == copy_num) break;
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
    public static void input() throws Exception{
        num = Integer.parseInt(br.readLine());
    }
    public static void main(String args[]) throws Exception{
        input();
        solution();
    }
}
