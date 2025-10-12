import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaxCalculatorAllUsesCoverage {

    @Test
    void TC_01() {
        assertEquals("Dữ liệu không hợp lệ", TaxCalculator.calculateTax(-50, 1));
    }

    @Test
    void TC_02() {
        assertEquals("Thuế phải nộp = 0", TaxCalculator.calculateTax(15, 1));
    }

    @Test
    void TC_03() {
        assertEquals("Thuế phải nộp = 0.23 triệu", TaxCalculator.calculateTax(20, 1));
    }

    @Test
    void TC_04() {
        assertEquals("Thuế phải nộp = 0.71 triệu", TaxCalculator.calculateTax(25, 1));
    }

    @Test
    void TC_05() {
        assertEquals("Thuế phải nộp = 1.80 triệu", TaxCalculator.calculateTax(28, 0));
    }

    @Test
    void TC_06() {
        assertEquals("Thuế phải nộp = 4.15 triệu", TaxCalculator.calculateTax(40, 0));
    }

    @Test
    void TC_07() {
        assertEquals("Thuế phải nộp = 9.00 triệu", TaxCalculator.calculateTax(60, 0));
    }

    @Test
    void TC_08() {
        assertEquals("Thuế phải nộp = 17.85 triệu", TaxCalculator.calculateTax(90, 0));
    }

    @Test
    void TC_09() {
        assertEquals("Thuế phải nộp = 21.30 triệu", TaxCalculator.calculateTax(100, 0));
    }
}
