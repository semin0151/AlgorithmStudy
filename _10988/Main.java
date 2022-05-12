package _10988;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String str;
    public static void solution() throws Exception{
        int start = 0;
        int end = str.length()-1;

        while(start < end){

            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else {
                bw.write("0");
                bw.flush();
                bw.close();
                return;
            }
        }

        bw.write("1");
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
