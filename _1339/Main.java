package _1339;

import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static ArrayList<String> arr = new ArrayList<>();
    public static void solution() throws Exception{
        HashMap<Character, Long> map = new HashMap<>();

        Collections.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                return str2.length() - str1.length();
            }
        });

        for(String str : arr){    
            for(int i = 0; i < str.length(); i++){
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0L) + (long)Math.pow(10, str.length()-i-1));
            }
        }

        ArrayList<Map.Entry<Character, Long>> lists = new ArrayList<>(map.entrySet());
        Collections.sort(lists, new Comparator<Map.Entry<Character, Long>>(){
            @Override
            public int compare(Map.Entry<Character, Long> e1, Map.Entry<Character, Long> e2){
                return e2.getValue().intValue() - e1.getValue().intValue();
            }
        });

        HashMap<Character, Integer> check = new HashMap<>();
        for(int i = 0; i < lists.size(); i++){
            check.put(lists.get(i).getKey(), 9-i);
        }

        int answer = 0;
        for(String str : arr){
            int sum = 0;
            for(char ch : str.toCharArray()){
                sum = sum * 10 + check.get(ch);
            }
            answer += sum;
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }

    public static void input() throws Exception{
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            arr.add(br.readLine());
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        solution();
    }
}
