import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsDemoTest {

    @Test
    void testAssertions() {
        AssertionsDemo demo = new AssertionsDemo();

        assertEquals(5, demo.add(2, 3));
        assertTrue(demo.isPositive(10));
        assertFalse(demo.isPositive(-5));
        assertNull(demo.getNullValue());
        assertNotNull(demo.getMessage());
    }
}