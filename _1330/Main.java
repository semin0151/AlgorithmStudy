package _1330;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int a, b;

    public static void solution(){
        if(a>b) System.out.print('>');
        else if(a<b) System.out.print('<');
        else System.out.print("==");
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
