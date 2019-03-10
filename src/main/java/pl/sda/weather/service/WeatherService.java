package pl.sda.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.weather.model.Weather;

import java.io.IOException;
import java.net.URL;

/**
 * @author Jarek Czaplicki
 */
public class WeatherService {
    private String url;
    private String apiKey;
    private String finalURL;
    private String location;


    public  WeatherService(String url, String apiKey) {
        this.url = url;
        this.apiKey = apiKey;
        this.finalURL = url+"?"+apiKey;
    }

    public Weather getCityWeather(String location){

        ObjectMapper mapper = new ObjectMapper();
        Weather weather = new Weather();
        try {
            URL url = new URL(finalURL + location);
             weather = mapper.readValue(url,Weather.class);

        } catch (IOException e) {
            e.printStackTrace();
        }return weather;

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getFinalURL() {
        return finalURL;
    }

    public void setFinalURL(String finalURL) {
        this.finalURL = finalURL;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
