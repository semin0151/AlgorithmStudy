package _2941;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String str;

    public static void solution() throws Exception{
        Queue<Character> Q = new LinkedList<>();

        for(char ch : str.toCharArray()){
            Q.offer(ch);
        }

        int cnt = 0;
        while(!Q.isEmpty()){
            char ch = Q.poll();

            if(Q.isEmpty()){
                cnt++;
                break;
            }
            char cmp = Q.peek();
            if(ch == 'c'){
                if(cmp == '=' || cmp == '-') Q.poll();
                cnt++;
            }
            else if(ch == 'd'){
                if(cmp == 'z'){
                    Q.poll();
                    if(Q.isEmpty()){
                        cnt+=2;
                    }
                    else if(Q.peek() == '='){
                        Q.poll();
                        cnt++;
                    }
                    else cnt+=2;
                }
                else if(cmp == '-') {
                    Q.poll();
                    cnt++;
                }
                else cnt++;
            }
            else if(ch == 'l'){
                if(cmp == 'j') Q.poll();
                cnt++;
            }
            else if(ch == 'n'){
                if(cmp == 'j') Q.poll();
                cnt++;
            }
            else if(ch == 's'){
                if(cmp == '=') Q.poll();
                cnt++;
            }
            else if(ch == 'z'){
                if(cmp == '=') Q.poll();
                cnt++;
            }
            else cnt++;
            
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        str = br.readLine();
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
    
}
