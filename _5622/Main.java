package _5622;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String str;

    public static void solution() throws Exception{
        int num = 0;
        for(char ch : str.toCharArray()){
            num += getDis(ch);
        }
        bw.write(Integer.toString(num));
        bw.flush();
        bw.close();
    }

    public static int getDis(char ch){
        int pos = 0;

        if(ch >= 'A' && ch <= 'C') return 3;
        else if(ch >= 'D' && ch <= 'F') return 4;
        else if(ch >= 'G' && ch <= 'I') return 5;
        else if(ch >= 'J' && ch <= 'L') return 6;
        else if(ch >= 'M' && ch <= 'O') return 7;
        else if(ch >= 'P' && ch <= 'S') return 8;
        else if(ch >= 'T' && ch <= 'V') return 9;
        else if(ch >= 'W' && ch <= 'Z') return 10;
        
        return pos;
    }

    public static void input() throws Exception {
        str = br.readLine();
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
