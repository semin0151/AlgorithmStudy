package _8393;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int n;

    public static void solution(){
        int answer = 0;
        for(int i = 1; i <= n; i++) answer += i;
        System.out.print(answer);
    }

    public static void input(){
        n = sc.nextInt();
    }
    
    public static void main(String args[]){
        input();
        solution();
    }    
}
