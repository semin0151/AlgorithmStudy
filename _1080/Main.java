package _1080;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, m;
    private static boolean[][] A, B;

    public static void solution() throws Exception{
        if(n<3 || m<3){
            boolean flag = true;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(A[i][j] != B[i][j]) flag = false;
                }
            }
            if(flag) bw.write("0");
            else bw.write("-1");
            bw.flush();
            bw.close();
            return;
        }
        int answer = 0;
        for(int i = 0; i < n-2; i++){

            for(int j = 0; j < m-2; j++){
                if(A[i][j] != B[i][j]){
                    changeArr(i,j);
                    answer++;
                } 
            }

            for(int j = m-2; j < m; j++){
                if(A[i][j] != B[i][j]){
                    bw.write("-1");
                    bw.flush();
                    bw.close();
                    return;
                } 
            }
        }

        for(int i = n-2; i < n; i++){

            for(int j = 0; j < m; j++){
                if(A[i][j] != B[i][j]){
                    bw.write("-1");
                    bw.flush();
                    bw.close();
                    return;
                }
            }
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();

    }

    public static void changeArr(int y, int x){

        for(int i = y; i <= y+2; i++){
            for(int j = x; j <= x+2; j++){
                if(A[i][j]) A[i][j] = false;
                else A[i][j] = true;
            }
        }
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        String tmp;
        A = new boolean[n][m];
        B = new boolean[n][m];
        for(int i = 0; i < n; i++){
            tmp = br.readLine();
            
            for(int j = 0; j < m; j++){
                if(tmp.charAt(j) == '0') A[i][j] = false;
                else A[i][j] = true;
            }
        }

        for(int i = 0; i < n; i++){
            tmp = br.readLine();

            for(int j = 0; j < m; j++){
                if(tmp.charAt(j) == '0') B[i][j] = false;
                else B[i][j] = true;
            }
        }

    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
