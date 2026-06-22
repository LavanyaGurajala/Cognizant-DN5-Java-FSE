public class TestForecast {

    public static void main(String[] args) {
        double currentValue = 10000.0;
        double annualGrowthRate = 0.08;
        int years = 5;

        double forecastedValue = FinancialForecast.forecastValue(currentValue, annualGrowthRate, years);

        System.out.println("Current value: " + currentValue);
        System.out.println("Annual growth rate: " + (annualGrowthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Forecasted value: " + forecastedValue);
    }
}
