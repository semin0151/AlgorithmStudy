package _8598;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws Exception{
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            String str = br.readLine();
            int size = str.length();
            int point = 0, answer = 0;
            for(int j = 0; j < size; j++){
                if(str.charAt(j) == 'O'){
                    point++;
                    answer += point;
                }
                else{
                    point = 0;
                }
            }
            bw.write(Integer.toString(answer) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
