package hw_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    @Test
    public void shouldHaveCorrectionSum() {
        assertEquals(6, Calc.sum(3, 3));
    }

    @Test
    public void shouldHaveCorrectionMultiply() {
        assertEquals(9, Calc.multiply(3, 3));
    }

    @Test
    public void shouldHaveCorrectionDiv() {
        int result = Calc.div(3, 3);
        assertAll("деление/деление на ноль",
                () -> assertEquals(1, result),
                () -> assertThrows(IllegalArgumentException.class, () -> {
                    Calc.div(3, 0);
                }));
    }

    @Test
    public void shouldHaveCorrectionSubstract() {
        assertEquals(0, Calc.substract(3, 3));
    }
}
