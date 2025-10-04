import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaxCalculatorTest {

    @Test
    void testInvalidData() {
        assertEquals("Dữ liệu không hợp lệ", TaxCalculator.calculateTax(-1, 0));
    }

    @Test
    void testNoTax() {
        assertEquals("Thuế phải nộp = 0", TaxCalculator.calculateTax(11, 0));
    }

    @Test
    void testTaxLevel1() {
        assertEquals("Thuế phải nộp = 0.25 triệu", TaxCalculator.calculateTax(16, 0));
    }

    @Test
    void testTaxLevel2() {
        assertEquals("Thuế phải nộp = 0.75 triệu", TaxCalculator.calculateTax(21, 0));
    }

    @Test
    void testTaxLevel3() {
        assertEquals("Thuế phải nộp = 1.95 triệu", TaxCalculator.calculateTax(29, 0));
    }

    @Test
    void testTaxLevel4() {
        assertEquals("Thuế phải nộp = 4.75 triệu", TaxCalculator.calculateTax(43, 0));
    }

    @Test
    void testTaxLevel5() {
        assertEquals("Thuế phải nộp = 9.75 triệu", TaxCalculator.calculateTax(63, 0));
    }

    @Test
    void testTaxLevel6() {
        assertEquals("Thuế phải nộp = 18.15 triệu", TaxCalculator.calculateTax(91, 0));
    }

    @Test
    void testTaxLevel7() {
        assertEquals("Thuế phải nộp = 18.50 triệu", TaxCalculator.calculateTax(92, 0));
    }
}
