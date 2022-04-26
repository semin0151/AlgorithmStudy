package _2577;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws Exception{
        int arr[] = new int[10];
        long num = 1;
        for(int i = 0; i < 3; i++){
            long tmp = Long.parseLong(br.readLine());
            num *= tmp;
        }
        while(num>0){
            arr[Long.valueOf(num%10).intValue()]++;
            num/=10;
        }
        for(int i = 0; i <= 9; i++){
            bw.write(Integer.toString(arr[i]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
