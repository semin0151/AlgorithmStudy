package _4344;
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String args[]) throws Exception{
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            String str = br.readLine();
            st = new StringTokenizer(str);
            int cnt = Integer.parseInt(st.nextToken());
            int arr[] = new int[cnt];
            double answer = 0.0, avg = 0.0;

            for(int j = 0; j < cnt; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                avg += arr[j];
            }
            avg /= cnt;
            for(int j = 0; j < cnt; j++){
                if(arr[j] > avg) answer += 1;
            }
            bw.write(String.format("%.3f", answer/cnt*100) + "%\n");            
        }
        bw.flush();
        bw.close();
    }
}
