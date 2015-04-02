package com.lutaoact.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class CurrentConditionsDisplay implements DisplayElement, java.util.Observer {
	private float temperature;
	private float humidity;
	private Observable mObservable;
	
	public CurrentConditionsDisplay(Observable observable) {
		mObservable = observable;
		mObservable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions " + temperature + " " + humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			if (arg instanceof Map<?, ?>) {
				Map<String, Float> map = (HashMap) arg;
				temperature = map.get("temperature");
				humidity	= map.get("humidity");
			} else {
				WeatherData weatherData = (WeatherData) o;
				temperature = weatherData.getTemperature();
				humidity = weatherData.getHumidity();
			}
			display();
		}
	}

}
