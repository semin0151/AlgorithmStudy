package _2589;

import java.io.*;
import java.util.*;

class Point{
    int y, x;

    Point(int y, int x){
        this.y = y;
        this.x = x;
    }
}

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, m;
    private static char[][] map;
    private static int[][] dis;
    private static int[] dy = {-1,0,1,0};
    private static int[] dx = {0,-1,0,1};

    public static void solution() throws Exception{
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){
                if(map[i][j] == 'L') answer = Math.max(answer, BFS(i,j));
            }
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static int BFS(int y, int x){
        dis = new int[n][m];
        int result = Integer.MIN_VALUE;
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(y,x));

        while(!Q.isEmpty()){
            Point p = Q.poll();
            int cy = p.y;
            int cx = p.x;

            for(int i = 0; i < 4; i++){
                int ny = cy +dy[i];
                int nx = cx +dx[i];
                if(ny < 0 || ny >= n || nx < 0 || nx >= m || map[ny][nx] == 'W' || dis[ny][nx] != 0) continue;
                if(ny == y && nx == x) continue;

                dis[ny][nx] = dis[cy][cx] +1;
                result = Math.max(result, dis[ny][nx]);
                Q.offer(new Point(ny,nx));
            }
        }

        return result;
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n][m];

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < m; j++){
                map[i][j] = str.charAt(j);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
