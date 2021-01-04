package skills_assignment;

public class StringBuilderEx {
    public static void main(String[] args) {
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("Hello");
        }

        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("stringBuilder: " + (endTimeStringBuilder - startTimeStringBuilder));

        long startTimeString = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i < 1000; i++) {
            string += "Hello";
        }

        long endTimeString = System.currentTimeMillis();
        System.out.println("string: " + (endTimeString - startTimeString));
    }
}
