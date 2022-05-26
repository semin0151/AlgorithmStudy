package _9663;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;
    private static long answer;
    private static int[] arr;

    public static void solution() throws Exception{
        answer = 0;
        arr = new int[n];
        getRecursion(0);

        bw.write(Long.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void getRecursion(int level){
        if(level == n){
            answer++;
            return;
        } 
        else{
            for(int i = 0; i < n; i++){
                if(checkNum(level,i)){
                    arr[level] = i;
                    getRecursion(level+1);
                }
            }
        }
    }

    public static boolean checkNum(int y, int x){
        if(y == 0) return true;

        for(int i = 0; i < y; i++){
            if(x == arr[i]) return false;
            if( Math.abs(y-i) == Math.abs(x-arr[i])) return false;
        }

        return true;
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
