package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon3052{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr= new boolean[42];
        int cnt = 0;
        for(int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            if(!arr[a % 42]){
                arr[a % 42] = true;
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}