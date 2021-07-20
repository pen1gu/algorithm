package baekjoon;

import java.util.*;

public class Baekjoon11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<int[]> list = new ArrayList<int[]>();

        for (int i = 0; i < N; i++) {
            list.add(new int[]{scanner.nextInt(), scanner.nextInt()});
        }

        Collections.sort(list, new Comparator<int[]>() {
            public int compare(int[] l1, int[] l2) {
                if (l1[0] == l2[0]) {
                    if (l1[1] > l2[1])
                        return 1;
                    else
                        return -1;
                } else {
                    if (l1[0] > l2[0])
                        return 1;
                    else return -1;
                }
            }
        });


        for (int i = 0; i < list.size(); i++) {
            int[] arr = list.get(i);
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}
