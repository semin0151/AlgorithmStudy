package _2753;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int year, answer = 0;

    public static void solution(){
        if(year%4 == 0){
            if(year%400 == 0) answer = 1;
            else if(year%100 != 0) answer = 1;
        }
        System.out.print(answer);
    }

    public static void input(){
        year = sc.nextInt();
    }

    public static void main(String args[]){
        input();
        solution();
    }    
}
