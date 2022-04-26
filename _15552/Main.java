package _15552;
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;

    public static void input() throws IOException{
        StringTokenizer st;   

        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine()); 

            int a, b;

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(a+b) + "\n" );
        }
        bw.flush();
    }

    public static void main(String args[]) throws IOException{
        input();
    }    
}
