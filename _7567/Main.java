package _7567;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String str;

    public static void solution() throws Exception{
        int answer = 0;
        for(int i = 0; i < str.length(); i++){
            if(i == 0 || str.charAt(i) != str.charAt(i-1)) answer += 10;
            else answer += 5;
        }
        bw.write(Integer.toString(answer));
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
