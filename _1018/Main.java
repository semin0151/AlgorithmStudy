package _1018;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static char[][] map;
    private static int n, m;

    public static void solution() throws Exception{
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i <= n-8; i++){
            for(int j = 0; j <= m-8; j++){
                answer = Math.min( answer, getResult(i,j));
            }
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static int getResult(int y, int x){
        int evenB = 0, evenW = 0, oddB = 0, oddW = 0;
        for(int i = y; i < y+8; i++){
            for(int j = x; j < x+8; j++){
                if((i+j) % 2 == 0){
                    if(map[i][j] == 'B') evenB++;
                    else evenW++;
                }
                else{
                    if(map[i][j] == 'B') oddB++;
                    else oddW++;
                }
            }
        }
        //System.out.println(evenB);
        //System.out.println(evenW);
        //System.out.println(oddB);
        //System.out.println(oddW);

        int tmp1 = (32 - oddB) + (32 - evenW);
        int tmp2 = (32 - oddW) + (32 - evenB);

        return Math.min(tmp1, tmp2);
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n+1][m+1];

        for(int i = 0; i < n; i++){
            String tmp = br.readLine();

            for(int j = 0; j < m; j++){
                map[i][j] = tmp.charAt(j);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
