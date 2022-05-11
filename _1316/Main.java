package _1316;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String[] strs;
    static int n;
    public static void solution() throws Exception{
        int cnt = 0;
        for(String str : strs){
            if(checkStr(str)) cnt++;
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }

    public static boolean checkStr(String str){
        boolean[] check = new boolean[26];

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(i == 0 || ch != str.charAt(i-1)){
                if(!check[ch-'a']) check[ch-'a'] = true;
                else return false;
            }
        }
        return true;
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
        strs = new String[n];

        for(int i = 0; i < n; i++){
            String tmp = br.readLine();
            strs[i] = tmp;
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
