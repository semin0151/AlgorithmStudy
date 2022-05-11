package _10809;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static String str;

    public static void solution() throws Exception{
        int arr[] = new int [26];
        for(int i = 0; i <= 25; i++) arr[i] = -1;

        int size = str.length();
        for(int i = 0; i < size; i++){
            int idx = str.charAt(i) - 'a';
            if(arr[idx] == -1) arr[idx] = i; 
        }

        for(int i = 0; i <= 25; i++) bw.write( Integer.toString(arr[i]) + " ");
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        str = br.readLine();
    }


    public static void main(String args[]) throws Exception{
        input();
        solution();
    }
}
