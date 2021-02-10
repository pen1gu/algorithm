package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int[] nums = new int[num];
        int[] result = new int[num];
        String[] input = bufferedReader.readLine().split(" ");
        for(int i = 0; i < num; i++)
            nums[i] = Integer.parseInt(input[i]);

        stack.push(0);
        for(int i = 1; i < num; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) // 스택이 비어있지 않고 스택의 현재 인덱스가 
                result[stack.pop()] = nums[i];
            stack.push(i);
        }
    }
}
