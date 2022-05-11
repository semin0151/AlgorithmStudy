package _2908;
import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    static int a, b;

    public static void solution() throws Exception{
        a = reverseNum(a);
        b = reverseNum(b);
        if(a>b) bw.write(Integer.toString(a));
        else bw.write(Integer.toString(b));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        String str = br.readLine();
        st = new StringTokenizer(str);
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    public static void main(String argsp[]) throws Exception{
        input();
        solution();
    }

    public static int reverseNum(int num){
        int result = 0;
        result += (num%10) * 100;
        result += ((num%100)/10) * 10;
        result += num/100;
        return result;
    }
}
