package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Baekjoon10814 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        String[] nameArr = new String[n];

        ArrayList<User> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            list.add(new User(Integer.parseInt(input[0]), input[1]));
        }

        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            User user = list.get(i);
            bufferedWriter.write(String.format("%d %s\n", user.age, user.name));
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static class User implements Comparable<User> {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(User o) {
            if (this.age < o.age) {
                return -1;
            } else if (this.age > o.age) {
                return 1;
            }
            return 0;
        }
    }
}
