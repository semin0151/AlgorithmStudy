package _2864;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int A, B;

    public static void solution() throws Exception{
        String numA, numB;
        int answer;
        numA = Integer.toString(A);
        numB = Integer.toString(B);

        numA = numA.replace('6', '5');
        numB = numB.replace('6', '5');
        
        answer = Integer.parseInt(numA) + Integer.parseInt(numB);

        bw.write(Integer.toString(answer));
        
        numA = Integer.toString(A);
        numB = Integer.toString(B);

        numA = numA.replace('5', '6');
        numB = numB.replace('5', '6');
        
        answer = Integer.parseInt(numA) + Integer.parseInt(numB);

        bw.write( " " + Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());    
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
