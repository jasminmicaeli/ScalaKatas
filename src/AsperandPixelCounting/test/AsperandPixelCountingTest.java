import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsperandPixelCountingTest {

    @Test
    void test1() {
        AsperandPixelCounting apc = new AsperandPixelCounting();
        assertEquals(18L, apc.countPixels(2L));
    }

    @Test
    void test2() {
        AsperandPixelCounting apc = new AsperandPixelCounting();
        assertEquals(26L, apc.countPixels(3L));
    }

    @Test
    void test3() {
        AsperandPixelCounting apc = new AsperandPixelCounting();
        assertEquals(34L, apc.countPixels(4L));
    }
}