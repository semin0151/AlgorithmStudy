package _15686;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int chickencnt = 0, homecnt = 0;
    private static int n, m, answer = Integer.MAX_VALUE;

    private static int[][] map;
    private static int[] cy = new int[13], cx = new int[13], hy, hx;
    private static int[] idxarr;
    
    public static void solution() throws Exception{
        idxarr = new int[m];

        getRecursion(0);

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void getRecursion(int level){
        if(level == m){
            answer = Math.min(answer, getDis());
        }
        else{
            for(int i = 0; i < chickencnt; i++){
                if(level==0 || idxarr[level-1] < i){
                    idxarr[level] = i;
                    getRecursion(level+1);
                }
            }   
        }
    }

    public static int getDis(){
        int result = 0, tmp;

        for(int i = 0; i < homecnt; i++){
            tmp = Integer.MAX_VALUE;
            
            for(int j = 0; j < m; j++){
                int y = cy[idxarr[j]];
                int x = cx[idxarr[j]];
                
                tmp = Math.min(tmp, Math.abs(y-hy[i]) + Math.abs(x-hx[i]));
            }
            result += tmp;
        }
        
        return result;
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        hy = new int[n*n];
        hx = new int[n*n];

        map = new int[n][n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2){
                    cy[chickencnt] = i;
                    cx[chickencnt] = j;
                    chickencnt++;
                } 
                else if(map[i][j] == 1){
                    hy[homecnt] = i;
                    hx[homecnt] = j;
                    homecnt++;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
