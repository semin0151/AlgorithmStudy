package _11654;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String args[]) throws Exception{
        String str = br.readLine();
        char ch = str.charAt(0);

        bw.write(Integer.toString((int) ch));
        bw.flush();
        bw.close();    

    }
}
