package observer.WeatherStation.View.Concrete;

import java.util.ArrayList;

import observer.WeatherStation.Service.Concrete.WeatherStation;
import observer.WeatherStation.View.Abstract.IDisplayable;
import observer.WeatherStation.View.Abstract.IObserver;

public class WeatherStats implements IObserver<WeatherStation>, IDisplayable {

    private ArrayList<Float> temperatures;

    public WeatherStats() {
        this.onInit();
    }

    private void onInit() {
        this.temperatures = new ArrayList<>();
    }

    public Float getMinTemperature() {
        if (this.temperatures.size() == 0) {
            return null;
        }
        float min = this.temperatures.get(0);
        for(float val : this.temperatures) {
            if (val < min) min = val;
        }
        return min;
    }

    public Float getMaxTemperature() {
        if (this.temperatures.size() == 0) {
            return null;
        }
        float max = this.temperatures.get(0);
        for(float val : this.temperatures) {
            if (val > max) max = val;
        }
        return max;
    }

    public Float getAvgTemperature() {
        if (this.temperatures.size() == 0) {
            return null;
        }
        float total = 0;
        for(float val : this.temperatures) {
            total += val;
        }
        return total/this.temperatures.size();
    }

    @Override
    public void onObservedUpdate(WeatherStation context) {
        this.temperatures.add(context.getTemperature());
        this.display();
    }

    @Override
    public void display() {
        System.out.println("----- WEATHER STATS ------");
        System.out.println("Avg temperature: " + this.getAvgTemperature());
        System.out.println("Min temperature: " + this.getMinTemperature());
        System.out.println("Max temperature: " + this.getMaxTemperature());
        System.out.println("Last temperature: " + this.temperatures.get(this.temperatures.size() - 1));
        System.out.println("----- WEATHER STATS ------");
    }
    
}
