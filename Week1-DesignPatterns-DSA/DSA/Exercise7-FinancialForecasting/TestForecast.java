public class TestForecast {

    public static void main(String[] args) {

        double futureValue =
                FinancialForecast.predictFutureValue(
                        10000,
                        0.10,
                        5
                );

        System.out.println("Future Value: " + futureValue);
    }
}