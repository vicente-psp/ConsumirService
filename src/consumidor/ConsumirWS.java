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
    private String url = "https://api.sandbox.amadeus.com/v1.2/flights/low-fare-search?";

    // HTTP GET request
    public String sendGet(String search, String apiKey) throws Exception {
        if (search.equals("") || apiKey.equals("")) {
            throw new Exception("Informe os parâmetros e a chave de acesso para a pesquisa.");
        }
        this.url += apiKey + search;
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
