package _1202;

import java.io.*;
import java.util.*;

class Jewerly{
    int weight, value;

    Jewerly(int weight, int value){
        this.weight = weight;
        this.value = value;
    }
}

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, k;
    private static int[] weight, value, bag;
    public static void solution() throws Exception{
        long answer = 0;
        int mybag;
        Jewerly[] arr = new Jewerly[n];

        for(int i = 0; i < n; i++){
            arr[i] = new Jewerly(weight[i], value[i]);
        }

        Arrays.sort(arr, new Comparator<Jewerly>(){

            @Override
            public int compare(Jewerly j1, Jewerly j2){
                if(j1.weight == j2.weight){
                    return j2.value - j1.value;
                }
                return j1.weight - j2.weight;
            }
        });
        Arrays.sort(bag);

        int idx = 0;
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());
        for(int tt = 0; tt < k; tt++){
            mybag = bag[tt];
            
            while(true){
                if(idx >= arr.length || mybag < arr[idx].weight) break;
                PQ.offer(arr[idx].value);
                idx++;
            }
            if(!PQ.isEmpty())answer += PQ.poll();
        }

        bw.write(Long.toString(answer));

        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        weight = new int[n];
        value = new int[n];
        bag = new int[k];
        
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < k; i++){
            bag[i] = Integer.parseInt(br.readLine());
        }

    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
