package _2480;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int a, b, c, max = 0, cnt = 0, answer;
    private static int[] arr = new int[7];

    public static void solution(){
        arr[a]++;
        arr[b]++;
        arr[c]++;
        for(int i = 1; i <= 6; i++){
            if(arr[i] >= cnt){
                max = i;
                cnt = arr[i];
            }
        }
        
        if(cnt == 3){
            answer = 10000 + (max*1000);
        }else if(cnt == 2){
            answer = 1000 + (max*100);
        }else{
            answer = max*100;
        }

        System.out.print(answer);
    }

    public static void input(){
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    public static void main(String args[]){
        input();
        solution();
    }    
}
