package _11656;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String str;
    public static void solution() throws Exception{
        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            arr.add(str.substring(i));
        }

        Collections.sort(arr);

        for(String s : arr){
            bw.write(s + "\n");
        }
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
