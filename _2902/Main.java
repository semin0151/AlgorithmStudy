package _2902;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringBuilder sb;
    static String str;
    public static void solution() throws Exception{
        sb = new StringBuilder();

        for(int i  = 0; i < str.length(); i++){
            if(i == 0 || str.charAt(i-1) == '-') sb.append(str.charAt(i));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        str = br.readLine();
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
