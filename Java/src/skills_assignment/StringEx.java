package skills_assignment;

import java.util.logging.MemoryHandler;

public class StringEx {

    public static void main(String[] args) {
        solution("ababcdcdababcdcd");
    }

    public static int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            String convert = "", temp = "";

            int cnt = 1;
            temp = s.substring(0, i);

            for (int j = i; j < s.length(); j += i) {
                if (temp == s.substring(j, i)) cnt++;
                else {
                    if (cnt > 1) convert += cnt;
                    convert += temp;
                    temp = s.substring(j, i);
                    cnt = 1;
                }
            }

            if (cnt > 1) convert += cnt;

            convert += temp;
            answer = Math.max(answer, convert.length());

        }
        return answer;
    }
}
