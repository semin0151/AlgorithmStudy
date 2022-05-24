package _17609;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String str;
    private static int testcase;
    public static void solution() throws Exception{
        //int answer;
        int answer = checkStr(0, str.length()-1, 0);

        bw.write(Integer.toString(answer) + "\n");    
    }

    public static int checkStr(int start, int end, int cnt){
        if(start >= end || cnt == 2) return cnt;

        char startCh = str.charAt(start);
        char endCh = str.charAt(end);

        if(startCh == endCh){
            return checkStr(start+1, end-1, cnt);
        }
        else{
            int result1 = checkStr(start, end-1, cnt+1);
            int result2 = checkStr(start+1, end, cnt+1);
            return Math.min(result1, result2);
        }
    }

    public static void input() throws Exception{
        testcase = Integer.parseInt(br.readLine());

        for(int tt = 0; tt < testcase; tt++){
            str = br.readLine();
            solution();
        }
        
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception{
        input();
    }
}
