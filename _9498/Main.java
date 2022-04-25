package _9498;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int point;

    public static void solution(){
        switch(point/10){
            case 10:{
                System.out.print('A');
                break;
            }
            case 9:{
                System.out.print('A');
                break;
            }
            case 8:{
                System.out.print('B');
                break;
            }
            case 7:{
                System.out.print('C');
                break;
            }
            case 6:{
                System.out.print('D');
                break;
            }
            default:{
                System.out.print('F');
            }
        }
    }

    public static void input(){
        point = sc.nextInt();
    }

    public static void main(String args[]){
        input();
        solution();
    }
}
