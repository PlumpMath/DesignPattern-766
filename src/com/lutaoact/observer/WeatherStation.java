package com.lutaoact.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMesurements(80, 65, 30.4f);
		weatherData.setMesurements(70, 55, 30.5f);
	}
}
