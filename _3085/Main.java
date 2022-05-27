package _3085;

import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;

    private static int[] dy = {-1,0,1,0};
    private static int[] dx = {0,-1,0,1};

    private static char[][] map;
    public static void solution() throws Exception{
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                answer = Math.max(answer, getMax(i,j));
                
            }
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static int getMax(int y, int x){
        int result = Integer.MIN_VALUE;
        char tmp;
        for(int i = 0; i < 4; i++){
            int ny = y+dy[i];
            int nx = x+dx[i];

            if(ny < 0 || ny >= n || nx < 0 || nx >= n) continue;

            tmp = map[y][x];
            map[y][x] = map[ny][nx];
            map[ny][nx] = tmp;

            int cnt1 = 1, cnt2 = 1, cnt3 = 1, cnt4 = 1;
            for(int j = 0; j < n; j++){
                if(j==0){
                    cnt1 = cnt2 = cnt3 = cnt4 = 1;
                }
                else{
                    if(map[y][j] == map[y][j-1]) cnt1++;
                    else cnt1 = 1;

                    if(map[ny][j] == map[ny][j-1]) cnt2++;
                    else cnt2 = 1;

                    if(map[j][x] == map[j-1][x]) cnt3++;
                    else cnt3 = 1;

                    if(map[j][nx] == map[j-1][nx]) cnt4++;
                    else cnt4 = 1;
                }
                result = Math.max(result, Math.max(Math.max(Math.max(cnt1, cnt2), cnt3), cnt4));
            }
            
            tmp = map[y][x];
            map[y][x] = map[ny][nx];
            map[ny][nx] = tmp;
            
        }
        return result;
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());
        
        map = new char[n][n];
        for(int i = 0; i < n; i++){
            String str = br.readLine();

            for(int j = 0; j < n; j++){
                map[i][j] = str.charAt(j);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
