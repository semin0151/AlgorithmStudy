package _2529;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int n;
    private static char[] arr;
    private static boolean[] check;
    private static int[] num;

    private static String max = "-1", min = "9999999999";

    public static void solution() throws Exception{
        
        getRecursion(0);

        bw.write(max + "\n" + min);
        bw.flush();
        bw.close();
    }

    public static void getRecursion(int level){
        if(level > n){
            if(checkNum()){
                
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i <= n; i++) sb.append(num[i]);
                long tmp = Long.parseLong(sb.toString());
                if(Long.parseLong(max) < tmp) max = sb.toString();
                if(Long.parseLong(min) > tmp) min = sb.toString();

            } 
        }
        else{
            for(int i = 0; i < 10; i++){
                if(check[i]){
                    check[i] = false;
                    num[level] = i;
                    getRecursion(level+1);
                    check[i] = true;
                }
            }
        }
    }

    public static boolean checkNum(){
        for(int i = 0; i < n; i++){
            if(arr[i] == '<'){
                if(num[i] < num[i+1]) continue;
                else return false;
            }
            else{
                if(num[i] > num[i+1]) continue;
                else return false;
            }
        }
        return true;
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
        arr = new char[n];
        check = new boolean[10];
        num = new int[n+1];

        Arrays.fill(check, true);

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n ; i++){
            arr[i] = st.nextToken().charAt(0);
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
