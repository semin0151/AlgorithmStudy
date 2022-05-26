package _14500;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, m;
    private static int[][] map;

    private static int[][] dy = { {0,0,0}, {1,2,3}, {1,2,2}, {0,0,-1}, {-1,-2,-2}, {0,0,1}, {1,1,2}, {0,-1,-1}, {1,1,1}, {-1,0,1}, {-1,-1,-1}, {-1,0,1}, {0,1,1}, {1,2,2}, {0,0,1}, {-1,-2,-2}, {0,0,-1}, {1,1,2}, {0,1,1}  };
    private static int[][] dx = { {1,2,3}, {0,0,0}, {0,0,1}, {1,2,2}, {0,0,-1}, {-1,-2,-2}, {0,1,1}, {1,1,2}, {-1,0,1}, {1,1,1}, {-1,0,1}, {-1,-1,-1}, {1,0,1}, {0,0,-1}, {1,2,2}, {0,0,1}, {-1,-2,-2}, {0,-1,-1}, {1,1,2} };
    public static void solution() throws Exception{
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                answer = Math.max(answer, getTetro(i,j));
            }
        }

        

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();

    }

    public static int getTetro(int y, int x){
        int result = Integer.MIN_VALUE, tmp, ny, nx;

        for(int i = 0; i < 19; i++){
            tmp = map[y][x];
            for(int j = 0; j < 3; j++){
                ny = y+dy[i][j];
                nx = x+dx[i][j];
                if(ny < 0 || nx < 0 || ny >= n || nx >= m){
                    tmp = Integer.MIN_VALUE;
                    break;
                } 
                tmp += map[ny][nx];
            }

            result = Math.max(result, tmp);
        }

        return result;
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
