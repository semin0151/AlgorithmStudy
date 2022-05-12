package _1100;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Character[][] arr = new Character[8][8];

    public static void solution() throws Exception{
        int cnt = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i+j) %2 == 0 && arr[i][j] == 'F')cnt++;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        for(int i = 0; i < 8; i++){
            String str = br.readLine();
            for(int j = 0; j < 8; j++){
                arr[i][j] = str.charAt(j);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
