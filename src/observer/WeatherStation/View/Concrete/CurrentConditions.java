package observer.WeatherStation.View.Concrete;

import observer.WeatherStation.Service.Concrete.WeatherStation;
import observer.WeatherStation.View.Abstract.IDisplayable;
import observer.WeatherStation.View.Abstract.IObserver;

public class CurrentConditions implements IObserver<WeatherStation>, IDisplayable {

    private Float temperature;
    private Float humidity;
    private Float pressure;

    private void onInit() {
        this.temperature = null;
        this.humidity = null;
        this.pressure = null;
    }

    public CurrentConditions() {
        this.onInit();
    }

    @Override
    public void onObservedUpdate(WeatherStation context) {
        this.temperature = context.getTemperature();
        this.humidity = context.getHumidity();
        this.pressure = context.getPressure();
        this.display();
    }

    @Override
    public void display() {
        System.out.println("----- Current Conditions -----");
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Humidity: " + this.humidity);
        System.out.println("Pressure: " + this.pressure);
        System.out.println("----- Current Conditions -----");
    }
    
}
