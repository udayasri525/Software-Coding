package functinalInterface;

import java.util.function.Function;

class SensorData {

    private double temperature;
    private double hunidity;

    public SensorData(double temperature, double hunidity) {
        this.temperature = temperature;
        this.hunidity = hunidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHunidity() {
        return hunidity;
    }

    public void setHunidity(double hunidity) {
        this.hunidity = hunidity;
    }

    @Override
    public String toString() {
        return "SensorData [temperature=" + temperature + ", hunidity=" + hunidity + "]";
    }
}

public class example4 {

    public static void main(String[] args) {

        SensorData data = new SensorData(20.5, 60.5);
        double threshold = 25.0;

        // Extract temperature
        Function<SensorData, Double> fun =
                new Function<SensorData, Double>() {

                    @Override
                    public Double apply(SensorData t) {
                        return t.getTemperature();
                    }
                };

        Double temperature = fun.apply(data);
        System.out.println("Extracted Temperature: " + temperature);

        // Check threshold
        Function<Double, Boolean> fun2 =
                new Function<Double, Boolean>() {

                    @Override
                    public Boolean apply(Double temp) {
                        return temp > threshold;
                    }
                };

        Boolean result = fun2.apply(temperature);

        System.out.println("Is temperature above threshold? " + result);
    }
}