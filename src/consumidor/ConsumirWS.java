package consumidor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author marcelosiedler
 */
public class ConsumirWS {

    private final String USER_AGENT = "Mozilla/5.0";
    private final String apiKey = "apikey=hY00nJHHlTuCjVBz20EeM6QZKdhpGm4b";
    private String url = "https://api.sandbox.amadeus.com/v1.2/flights/low-fare-search?";

    // HTTP GET request
    public String sendGet(String search) throws Exception {
        if (search.equals("")) {
            throw new Exception("Informe os parâmetros para a pesquisa.");
        }
        this.url += this.apiKey + search;
        URL obj = new URL(this.url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + this.url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine + "\n");
        }
        in.close();

        return response.toString();
    }
}
