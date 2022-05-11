import java.io.*;
import java.util.*;

public class test {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i <= 10; i++){
            set.add(i);
        }

        for(Integer num: set){
            System.out.println(num);
        }
    }
}
