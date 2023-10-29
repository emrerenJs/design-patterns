package observer.WeatherStation.View.Abstract;

import observer.WeatherStation.Service.Abstract.IObservable;

public interface IObserver<T extends IObservable> {
    void onObservedUpdate(T context);
}
