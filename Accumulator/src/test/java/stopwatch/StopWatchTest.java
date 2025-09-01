package stopwatch;

import  static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StopWatchTest {

    @Test
    void test1() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(14);
        int minutes = stopWatch.getMinutes();
        assertEquals(14, minutes);
    }

    @Test
    void test2() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(-5);
        int minutes = stopWatch.getMinutes();
        if (minutes != 0) {
            fail("Invalid value");
        }
    }

    @Test
    void test3() {
        StopWatch stopwatch = new StopWatch();
        stopwatch.record(70);
        int hours = stopwatch.getHours();
        int minutes = stopwatch.getMinutes();
        assertEquals(1, hours);
        assertEquals(10, minutes);

    }

    @Test
    void test4() {
        StopWatch stopwatch = new StopWatch();
        stopwatch.record(1441);
        int days = stopwatch.getDays();
        int hours = stopwatch.getHours();
        int minutes = stopwatch.getMinutes();
        assertEquals(0, hours);
        assertEquals(1, minutes);
        assertEquals(1, days);

    }

    @Test
    void test5() {
        StopWatch stopwatch = new StopWatch();
        stopwatch.setDailyHrs(8);
        stopwatch.record(1441);
        int days = stopwatch.getDays();
        int hours = stopwatch.getHours();
        int minutes = stopwatch.getMinutes();
        assertEquals(0, hours);
        assertEquals(1, minutes);
        assertEquals(3, days);

    }

}
