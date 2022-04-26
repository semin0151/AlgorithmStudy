package _2562;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws Exception{
        int max = 0, idx = 0;
        for(int i = 1; i <= 9; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > max){
                max = num;
                idx= i;
            }
        }
        bw.write(Integer.toString(max) + "\n" + Integer.toString(idx));
        bw.flush();
        bw.close();
    }    
}
