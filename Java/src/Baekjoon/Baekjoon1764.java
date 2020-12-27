package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon1764 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int cnt =0;

        Set<String> setOfNotHear = new HashSet<>();
        List<String> listOfDBJ = new ArrayList<>();

        for (int i = 0; i < toInt(input[0]); i++) {
            setOfNotHear.add(bufferedReader.readLine());
        }

        for (int i = 0; i < toInt(input[1]); i++) {
            String input_notShow = bufferedReader.readLine();
            if (setOfNotHear.contains(input_notShow)){
                listOfDBJ.add(input_notShow);
                cnt++;
            }
        }

        Collections.sort(listOfDBJ);

        System.out.println(cnt);
        for (int i = 0; i < listOfDBJ.size(); i++) {
            System.out.println(listOfDBJ.get(i));
        }

        bufferedReader.close();
    }

    public static Integer toInt(String string){
        return Integer.parseInt(string);
    }
}
