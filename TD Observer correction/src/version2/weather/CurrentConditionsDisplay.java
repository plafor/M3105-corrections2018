package version2.weather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Display{
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		this.temperature = weatherData.getTemperature();
		this.humidity = ((WeatherData)o).getHumidity();
		display();	
	}
}
