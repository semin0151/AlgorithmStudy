package _3052;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String args[]) throws Exception{
        int arr[] = new int[43];
        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num%42]++;
        }
        int cnt = 0;
        for(int i = 0; i < 42; i++){
            if(arr[i] != 0) cnt++;
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
