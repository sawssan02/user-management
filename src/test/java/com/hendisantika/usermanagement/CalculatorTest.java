package com.hendisantika.usermanagement;

/**
 * @author sawssan
 **/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAddition() {
        assertEquals(5, 2 + 3);
    }

    @Test
    void testDivisionParZero() {
        assertThrows(ArithmeticException.class, () -> { int x = 1 / 0; });
    }
}
