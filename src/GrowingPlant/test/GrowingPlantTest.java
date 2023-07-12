import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GrowingPlantTest {

    @Test
    void test1() {
        GrowingPlant gp = new GrowingPlant();
        Assertions.assertEquals(10, gp.growingPlant(100, 10, 910));
    }

    @Test
    void test2() {
        GrowingPlant gp = new GrowingPlant();
        Assertions.assertEquals(1, gp.growingPlant(10, 9, 4));
    }

    @Test
    void test3() {
        GrowingPlant gp = new GrowingPlant();
        Assertions.assertEquals(2, gp.growingPlant(5, 2, 6));
    }

}