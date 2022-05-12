package _11655;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String str;
    public static void solution() throws Exception{
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            
            if(Character.isAlphabetic(ch)){
                if(ch >= 'a' && ch <= 'z'){
                    ch += 13;
                    if(ch > 'z') ch -= 26;
                }
                else if(ch >= 'A' && ch <= 'Z'){
                    ch += 13;
                    if(ch > 'Z') ch -= 26;
                }
            }
            sb.append(ch);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        str = br.readLine();
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
