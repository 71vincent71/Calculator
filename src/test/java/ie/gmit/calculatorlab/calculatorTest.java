package ie.gmit.calculatorlab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorTest
{
    calculator calc = new calculator();
    @Test
    void justAnExample()
    {
    }

    @Test
    void testSubtract()
    {
        assertEquals(7, calc.subtract(17, 10));
    }
}