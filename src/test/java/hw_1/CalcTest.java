package hw_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    @Test
    public void ShouldHaveCorrectionSum() {
        int result = Calc.sum(3, 3);
        assertEquals(6, result);
    }

    @Test
    public void ShouldHaveCorrectionMult() {
        int result = Calc.mult(3, 3);
        assertEquals(9, result);
    }

    @Test
    public void ShouldHaveCorrectionDiv() {
        int result = Calc.div(3, 3);
        assertAll("деление/деление на ноль",
                () -> assertEquals(1, result),
                () -> assertThrows(IllegalArgumentException.class, () -> {
                    Calc.div(3, 0);
                }));
    }

    @Test
    public void ShouldHaveCorrectionSubstract() {
        int result = Calc.substract(3, 3);
        assertEquals(0, result);
    }


}
