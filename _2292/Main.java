package _2292;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;

    public static void solution() throws Exception{
        int answer;
        int idx = 1, six = 1;
        while(true){
            if(n <= six){
                answer = idx;
                break;
            } 
            else{
                six += 6*idx;
                idx++;
            }
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
