import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GyordanJavaTest {
    @Test
    void constructorTest() {
        assertEquals("1", new GyordanJava().getString());
    }
}
