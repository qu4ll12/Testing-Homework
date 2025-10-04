public class TaxCalculator {
    private static final double personalDeduction = 11.0;
    private static final double dependentDeductionPerPerson = 4.4;
    public static String calculateTax(double income, int dependents) {
        if (income < 0 || dependents < 0 || dependents > 20) {
            return "Dữ liệu không hợp lệ";
        }

        double taxableIncome = income
                - personalDeduction - dependents * dependentDeductionPerPerson;
        if (taxableIncome <= 0) {
            return "Thuế phải nộp = 0";
        }

        double tax;
        if (taxableIncome <= 5) tax = taxableIncome * 0.05;
        else if (taxableIncome <= 10) tax = 5 * 0.05
                + (taxableIncome - 5) * 0.1;
        else if (taxableIncome <= 18) tax = 5 * 0.05 + 5 * 0.1
                + (taxableIncome - 10) * 0.15;
        else if (taxableIncome <= 32) tax = 5 * 0.05 + 5 * 0.1 + 8 * 0.15
                + (taxableIncome - 18) * 0.20;
        else if (taxableIncome <= 52) tax = 5 * 0.05 + 5 * 0.1 + 8 * 0.15 + 14 * 0.20
                + (taxableIncome - 32) * 0.25;
        else if (taxableIncome <= 80) tax = 5 * 0.05 + 5 * 0.1 + 8 * 0.15 + 14 * 0.20
                + 20 * 0.25 + (taxableIncome - 52) * 0.30;
        else tax = 5 * 0.05 + 5 * 0.1 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + 28 * 0.30
                    + (taxableIncome - 80) * 0.35;

        return String.format("Thuế phải nộp = %.2f triệu", tax);
    }
}