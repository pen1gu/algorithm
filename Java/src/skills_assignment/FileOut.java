package skills_assignment;

import java.io.*;

public class FileOut {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/text.txt");

//        InputStreamReader inputStreamReader = new InputStreamReader()

        FileWriter writer = new FileWriter(file, true);

        for (int i = 0; i < 999999; i++) {
            writer.write(i+" ");
        }
    }
}
