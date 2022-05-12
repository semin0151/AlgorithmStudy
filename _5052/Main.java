package _5052;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int testcase;
    static String number;

    public static String solution(int n, ArrayList<String> numbers){
        String result = "YES";
        Collections.sort(numbers);

        for(int i = 0; i < numbers.size() - 1; i++){
            if(numbers.get(i+1).indexOf(numbers.get(i)) == 0) return "NO";
        }

        return result;
    }

    public static void input() throws Exception{
        testcase = Integer.parseInt(br.readLine());

        for(int tt = 0; tt < testcase; tt++){
            ArrayList<String> numbers = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());

            for(int i = 0; i < n; i++){
                number = br.readLine();
                numbers.add(number);
            }

            bw.write(solution(n, numbers) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception{
        input();
    }
}
