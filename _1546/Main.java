package _1546;
import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws Exception{
        int num = Integer.parseInt(br.readLine());
        double sum = 0.0, max = 0.0;
        double arr[] = new double[num];
        String str = br.readLine();
        st = new StringTokenizer(str);
        for(int i = 0; i < num; i++){
            arr[i] = Double.parseDouble(st.nextToken());
            if(arr[i] > max) max = arr[i];
        }
        for(int i = 0; i < num; i++){
            sum += arr[i]/max*100;
        }

        bw.write(Double.toString(sum/num));
        bw.flush();
        bw.close();
    }
}
