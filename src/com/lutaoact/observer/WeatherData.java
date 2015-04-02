package com.lutaoact.observer;

import java.util.HashMap;
import java.util.Map;


public class WeatherData extends java.util.Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	private Map<String, Float> mMap;
	
	public WeatherData() {
		mMap = new HashMap<>();
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers(mMap);
	}
	
	public void setMesurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		mMap.put("temperature", temperature);
		mMap.put("humidity", humidity);
		mMap.put("pressure", pressure);
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
