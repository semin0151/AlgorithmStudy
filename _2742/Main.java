package _2742;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;
    public static void main(String args[]) throws Exception{
        n = Integer.parseInt(br.readLine());
        for(int i = n; i > 0; i--){
            bw.write(Integer.toString(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
