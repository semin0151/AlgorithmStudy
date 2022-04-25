package _2884;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int hour, minute;
    private static String answer;
    public static void solution(){
        if(minute - 45 < 0){
            if(hour - 1 < 0) hour = 23;
            else hour -= 1;
            minute += 15;
        }
        else minute -= 45;
        
        answer = Integer.toString(hour) + " " + Integer.toString(minute);    
        System.out.print(answer);
    }

    public static void input(){
        hour = sc.nextInt();
        minute = sc.nextInt();
    }
    
    public static void main(String args[]){
        input();
        solution();
    }    
}
