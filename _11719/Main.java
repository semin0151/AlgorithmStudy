package _11719;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws Exception{
        while(true){
            String str = br.readLine();
            
            if(str == null) break;
            bw.write(str + "\n");
            bw.flush();
        }
        bw.close();
    }

    public static void input() throws Exception{
        
    }

    public static void main(String[] args) throws Exception{
        //input();
        solution();
    }
}
