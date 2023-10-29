package observer.WeatherStation.Service.Concrete;

import java.util.ArrayList;

import observer.WeatherStation.Service.Abstract.IObservable;
import observer.WeatherStation.View.Abstract.IObserver;

public class WeatherStation implements IObservable {
    ArrayList<IObserver> observers;

    private Float temperature;
    private Float humidity;
    private Float pressure;

    public Float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(float temperature) {
        if (temperature != this.temperature) {
            this.temperature = temperature;
            this.notifyObservers();
        }
    }

    public Float getHumidity() {
        return this.humidity;
    }

    public void setHumidity(float humidity) {
        if (humidity != this.humidity) {
            this.humidity = humidity;
            this.notifyObservers();
        }
    }

    public Float getPressure() {
        return this.pressure;
    }

    public void setPressure(float pressure) {
        if (pressure != this.pressure) {
            this.pressure = pressure;
            this.notifyObservers();
        }
    }

    public WeatherStation() {
        this.observers = new ArrayList<IObserver>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : this.observers) {
            observer.onObservedUpdate(this);
        }
    }

    @Override
    public String toString() {
        return "{ tempreture: " + this.temperature + ", humidity: " + this.humidity + ", pressure:" + this.pressure + " }";
    }
}
