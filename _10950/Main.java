package _10950;
import java.util.*;

class Pair{
    int a, b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Pair> arr = new ArrayList<Pair>();
    private static int n;

    public static void solution(){
        for(int i = 0; i < n; i++){
            System.out.println(arr.get(i).a + arr.get(i).b);
        }
    }

    public static void input(){
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            arr.add(new Pair(a,b));
        }
    }
    public static void main(String args[]){
        input();
        solution();
    }    
}
