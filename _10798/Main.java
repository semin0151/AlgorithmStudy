package _10798;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringBuilder sb;
    static String[] arr = new String[5];
    static int max = 0;
    public static void solution() throws Exception{
        sb = new StringBuilder();

        for(int j = 0; j < max; j++){

            
            for(int i = 0; i < 5; i++){
                if(arr[i].length() > j){
                    sb.append(arr[i].charAt(j));
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        for(int i = 0; i < 5; i++){
            arr[i] = br.readLine();
            max = Math.max(max, arr[i].length());
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
