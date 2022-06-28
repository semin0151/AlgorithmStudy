package _1904;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] arr;
    private static int n;

    public static void solution() throws Exception{

        int answer =fibo(n);
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static int fibo(int n){
        if(arr[n] != 0) return arr[n];
        if(n <= 2 ) return n;
        else return arr[n] = (fibo(n-1) + fibo(n-2))%15746;
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
