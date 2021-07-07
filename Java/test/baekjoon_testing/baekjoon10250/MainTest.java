package baekjoon_testing.baekjoon10250;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testUnit() {
        Main main = new Main();
        assertEquals(main.solution(2), 0);
    }
}