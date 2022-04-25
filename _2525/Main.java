package _2525;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int hour, minute, cooktime;

    public static void solution(){
        int needHour = cooktime / 60, needMinute = cooktime % 60;

        minute += needMinute;
        hour+= needHour;
        if(minute > 59){
            minute -= 60;
            hour++;
        }
        if(hour > 23) hour -= 24;

        String answer = Integer.toString(hour) + " " + Integer.toString(minute);
        System.out.print(answer);
    }

    public static void input(){
        hour = sc.nextInt();
        minute = sc.nextInt();
        cooktime = sc.nextInt();
    }

    public static void main(String args[]){
        input();
        solution();
    }
}
