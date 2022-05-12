package _2745;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    
    static String str;
    static int n;

    public static void solution() throws Exception{
        int answer = 0;

        for(int i = str.length()-1; i >= 0; i--){
            answer += getNum(str.charAt(i)) * (int)Math.pow(n, str.length()- 1 - i);
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());

        str = st.nextToken();
        n = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }

    public static int getNum(char ch){
        if(Character.isDigit(ch)){
            return ch -'0';
        }
        else{
            return ch - 'A' + 10;
        }
    }
}
