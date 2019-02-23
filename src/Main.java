import refs.forecast.*;
import refs.forecast.model.Latitude;
import refs.forecast.model.Longitude;
public class Main {

    public static void main(String[] args) throws ForecastException {
        Main yeet = new Main();
        yeet.req(47, -88.5);

    }
    public void req(double lat, double lon) throws ForecastException {
        ForecastRequest request = new ForecastRequestBuilder()
                .key(new APIKey("9eec249edf77f5e9ea1adb48f24820fb"))
                .language(ForecastRequestBuilder.Language.en)
                .location(new GeoCoordinates(new Longitude(lon), new Latitude(lat))).build();
        DarkSkyClient client = new DarkSkyClient();
        String forecast = client.forecastJsonString(request);
        System.out.println(forecast);
    }
}
