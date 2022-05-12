package _17413;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringBuilder sb = new StringBuilder();
    private static Deque<Character> dq = new LinkedList<>();

    static String str;

    public static void solution() throws Exception{

        for(char ch : str.toCharArray()){
            dq.offerLast(ch);

            if(dq.peekLast() == '>'){
                while(!dq.isEmpty()){
                    sb.append(dq.peekFirst());
                    dq.pollFirst();
                }
            }
            else if (dq.peekLast() == ' '){
                if(dq.peekFirst() == '<');
                else{
                    char tmp = dq.pollLast();
                    while(!dq.isEmpty()){
                        sb.append(dq.pollLast());
                    }
                    sb.append(tmp);
                }
            }
            else if(dq.peekLast() == '<'){
                char tmp = dq.pollLast();
                while(!dq.isEmpty()){
                    sb.append(dq.peekLast());
                    dq.pollLast();
                }
                dq.offerLast(tmp);
            }
        }

        while(!dq.isEmpty()) sb.append(dq.pollLast());
        
        bw.write(sb.toString());
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
