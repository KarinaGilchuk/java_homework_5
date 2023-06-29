package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BudgetServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/budget.csv")
    public void testIsBudgetExpected(int expected, int income, int expense, int threshold) {
        BudgetService service = new BudgetService();
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
