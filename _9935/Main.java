package _9935;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringBuilder sb = new StringBuilder();
    static String str1, str2;
    static Stack<Character> stack = new Stack<>();

    public static void solution() throws Exception{

        for(int tt = str1.length()-1; tt >= 0 ;tt--){
            stack.push(str1.charAt(tt));

            if(stack.peek() == str2.charAt(0)){
                if(stack.size() >= str2.length()){
                    sb.delete(0, sb.length());

                    for(int i = 0; i < str2.length(); i++){
                        sb.append(stack.pop());
                    }
                    
                    if(!str2.equals(sb.toString())){
                        for(int i = sb.length()-1; i >= 0; i--){
                            stack.push(sb.charAt(i));
                        }
                    }
                }
            }
        }
        if(stack.size() > 0){
            while(!stack.isEmpty()){
                bw.write(stack.pop());
            }
        }
        else bw.write("FRULA");
        
        bw.flush();
        bw.close();
        
    }

    public static void input() throws Exception{
        str1 = br.readLine();
        str2 = br.readLine();
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}

