package _1152;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String str;
    public static void solution() throws Exception{
        int size = str.length(), cnt = 1;

        for(int i = 1; i < size - 1; i++){
            if(str.charAt(i) == ' ') cnt++;
        }
        if(size == 1 && str.charAt(0) == ' ') cnt--;
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        str = br.readLine();
    }

    public static void main(String args[]) throws Exception{
        input();
        solution();
    }
}
