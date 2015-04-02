package com.lutaoact.observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	private float temperature;
	private float humidity;
	private Subject mWeatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		mWeatherData = weatherData;
		mWeatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions " + temperature + " " + humidity);
	}

}
