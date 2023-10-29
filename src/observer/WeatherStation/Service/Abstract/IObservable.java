package observer.WeatherStation.Service.Abstract;

import observer.WeatherStation.View.Abstract.IObserver;

public interface IObservable {
    void registerObserver(IObserver<IObservable> observer);
    void removeObserver(IObserver<IObservable> observer);
    void notifyObservers();
}
