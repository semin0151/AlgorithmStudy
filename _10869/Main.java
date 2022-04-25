package _10869;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
      
    public static void solution(){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
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
