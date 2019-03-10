package pl.sda.weather;
import pl.sda.weather.model.Weather;
import pl.sda.weather.service.WeatherService;

import java.util.Scanner;

/**
 * Funkcjonalność:
 * Użytkownik wpisuje nazwę miejscowości
 * Program zwraca temperaturę dla wpisanej miejscowości
 *
 * Uporządkować kod:
 * - mechanizm pobierania jsona przenieść do klasy WeatherService
 * (klase należy stworzyć w pakiecie service) klasa niech posiada zmienną typu String o nazwie finalURL
 * - konstrutor klasy niech posiada 2 pola String url, String apiKey
 * - wywołanie powinno wyglądać:
 *  WeatherService weatherService = new WeatherService(
 *                 "http://api.apixu.com/v1/current.json",
 *                 "KLUCZ API"
 *         );
 * - w konstruktorze do zmiennej finalURL przypisac url i apiKey
 * - w klasie WeatherService stworzyć metodę getCityWeather(String city) -
 * metoda powinna zwracać obiekt klasy Weather
 * metoda powinna dokleić do zmiennej finalURL nazwę miasta i wykonać zapytanie na adres w celu
 * pobrania wszystkich danych
 * - zwrócone dane wyświetlić na ekranie (dowolnie)
 */

/**
 * @author Jarek Czaplicki
 */
public class Main {
    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json",
                "key=e57102d422184afcaea115612191003&q=");

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj nazwę miasta dla którego mam sprawdzić temperaturę: ");
        String location = sc.nextLine();
        Weather weather = weatherService.getCityWeather(location);

        System.out.println("Temperatura w " + weather.getLocation().getName() + " wynosi: "
                + weather.getCurrent().getTemp_c());


    }
}
