package skills_assignment;

import java.util.logging.MemoryHandler;

public class StringEx {
    public static void main(String[] args) {
        String str = "";
        str += "Hello ";
        str += "World!";
        System.out.println(str);

        String to = "HI HI HI";
        to.replace(" ", ",");
        System.out.println(to);
    }
}
