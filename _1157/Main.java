package _1157;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String str;
    private static int[] arr = new int[27];

    public static void solution() throws Exception{
        int size = str.length();

        for(int i = 0; i < size; i++) checkAlpha(str.charAt(i));

        int max = 0, cnt = 0, idx = -1;

        for(int i = 0; i < 26; i++){
            if(max < arr[i]){
                max = arr[i];
            } 
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] == max){
                cnt++;
                idx = i;
            } 
        }

        char ch = (char)((int)'A' + idx);
        
        if(cnt > 1) bw.write("?");
        else bw.write(ch);
        
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

    public static void checkAlpha(char ch){
        if(ch >= 'a' && ch <= 'z'){
            arr[ch-'a']++;
        }
        else{
            arr[ch-'A']++;
        }
    }
}
