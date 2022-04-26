package _10871;
import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws Exception{
        int n, m;
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        str = br.readLine();
        st = new StringTokenizer(str);
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num < m) bw.write(Integer.toString(num) + " ");
        }
        bw.flush();
        bw.close();
    }    
}
