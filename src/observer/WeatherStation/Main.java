package observer.WeatherStation;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import observer.WeatherStation.Service.Concrete.WeatherStation;
import observer.WeatherStation.View.Concrete.CurrentConditions;
import observer.WeatherStation.View.Concrete.WeatherStats;

public class Main {
    private static void runApp() {
        WeatherStation weatherStation = new WeatherStation();
        WeatherStats weatherStats = new WeatherStats();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherStation.registerObserver(weatherStats);
        weatherStation.registerObserver(currentConditions);
        Random r = new Random();
        System.out.println("Weather station starting..");
        int i = 0;
        while ( i < 3 ) {
            weatherStation.setTemperature(-10 + r.nextFloat() * (45 - (-10)));
            weatherStation.setPressure(-10 + r.nextFloat() * (45 - (-10)));
            weatherStation.setHumidity(-10 + r.nextFloat() * (45 - (-10)));
            i += 1;
            try {
                TimeUnit.SECONDS.sleep(5);
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted error (WeatherStation)");
            }
        }
        System.out.println("Weather station closing..");
    }

    public static void main() {
        runApp();
    }
}
