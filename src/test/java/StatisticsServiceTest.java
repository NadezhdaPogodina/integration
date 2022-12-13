import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqamaven.service.StatisticsService;

public class StatisticsServiceTest {

    @Test
    public void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void findMaxMore() {
        StatisticsService service = new StatisticsService();

        long[] income = {12, 5, 8, 4, 5, 50, 8, 6, 11, 11, 12};
        long expected = 50;
        long actual = service.findMax(income);

        Assertions.assertEquals(expected, actual);
    }

}