package _2741;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws Exception{

        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            bw.write(Integer.toString(i));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }    
}
