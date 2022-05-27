package _9613;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int testcase, n;
    private static long answer;

    private static int[] check = new int[2];
    private static int[] arr;

    public static void solution() throws Exception{
        answer = 0;
        getRecursion(0);
        bw.write(Long.toString(answer) + "\n");
    }

    public static void getRecursion(int level){
        if(level==2){
            //for(int i = 0; i < 2; i++) System.out.print(check[i] + " ");
            //System.out.println();
            answer += getGCD(arr[check[0]], arr[check[1]]);
        }
        else{

            for(int i = 0; i < n; i++){
                if(level == 0 || check[level-1] < i){
                    check[level] = i;
                    getRecursion(level+1);
                } 
                 
            }
        }
    }

    public static int getGCD(int num1, int num2){
        int result = 1;

        for(int i = 2; i <= num1; i++){
            if( num1 %i == 0 && num2 %i == 0){
                num1 /=i;
                num2 /=i;
                result *= i;
                i--;
            } 
        }

        return result;
    }

    public static void input() throws Exception{
        testcase = Integer.parseInt(br.readLine());
        for(int tt = 0; tt < testcase; tt++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());    
            }
            Arrays.sort(arr);

            solution();

        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception{
        input();
        //solution();
    }
}
