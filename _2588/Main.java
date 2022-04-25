package _2588;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int a, b;

    public static void solution(){
        System.out.println(a*(b%10));
        System.out.println(a*((b/10)%10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }

    public static void input(){
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public static void main(String args[]){
        input();
        solution();
    }
}
