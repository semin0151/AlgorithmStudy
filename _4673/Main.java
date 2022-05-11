package _4673;
import java.io.*;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static boolean arr[] = new boolean [10001];
    public static void main(String args[])throws Exception{
        for(int i = 1; i <= 10000; i++){
            int num = getNum(i);
            if(num <= 10000) arr[num] = true;
        }

        for(int i = 1; i <= 10000; i++){
            if(!arr[i]) bw.write(Integer.toString(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int getNum(int num){
        int tmp = num, sum = 0;
        while(tmp > 0){
            sum +=  tmp % 10;
            tmp /= 10;
        }
        return num + sum;
    }
}
