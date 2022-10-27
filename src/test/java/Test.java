import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;





public class Test extends Assertions{
    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, 80, 84, 88, 92, 96, 104, 108, 112, 116, 120})
    public void yearIsLeapYearWhenDivisibleBy4ButNot100(int years) {
        assertTrue(LeapYear.isLeapYear(years));
    }

    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1200, 1600, 2000, 2400})
    public void yearIsLeapYearWhenDivisibleBy400(int years) {
        assertTrue(LeapYear.isLeapYear(years));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 7, 9,11, 13, 15, 17, 19, 21, 22, 23, 25, 26})
    public void yearIsNotLeapYearWhenNotDivisibleBy4(int years) {
        assertFalse(LeapYear.isLeapYear(years));
    }

    @ParameterizedTest
    @ValueSource(ints = {100,200,300,500,600,700,900})
    public void yearIsNotLeapYearWhenDivisibleBy100ButNot400(int years) {
        assertFalse(LeapYear.isLeapYear(years));
    }

}
