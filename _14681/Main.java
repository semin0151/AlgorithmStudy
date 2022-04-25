package _14681;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int x, y, answer;
    
    public static void solution(){
        if(x > 0 && y > 0) answer = 1;
        else if (x < 0 && y > 0) answer = 2;
        else if (x < 0 && y < 0) answer = 3;
        else answer = 4;
        
        System.out.print(answer);
    }

    public static void input(){
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public static void main(String args[]){
        input();
        solution();
    }    
}
