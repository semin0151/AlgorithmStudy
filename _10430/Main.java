package _10430;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int a, b, c;

    public static void solution(){
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }

    public static void input(){
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }
    
    public static void main(String[] args){
        input();
        solution();
    }
}
