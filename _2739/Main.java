package _2739;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int num;
    
    public static void solution(){
        for(int i = 1; i <= 9; i++){
            String str = Integer.toString(num) + " * " + Integer.toString(i) + " = " + Integer.toString(num*i);
            System.out.println(str);
        }
    }

    public static void input(){
        num = sc.nextInt();
    }

    public static void main(String args[]){
        input();
        solution();
    }    
}
