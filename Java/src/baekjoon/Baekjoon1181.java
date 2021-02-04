package baekjoon;

import java.util.*;

public class Baekjoon1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.next();
        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                if (word1.length() == word2.length())
                    return word1.compareTo(word2);
                else
                    return word1.length() - word2.length();
            }
        });

        System.out.println(array[0]);

        for (int i = 1; i < N; i++) {
            if (!array[i].equals(array[i - 1])) {
                System.out.println(array[i]);
            }
        }

        scanner.close();
    }
}
