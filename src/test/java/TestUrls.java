import org.junit.Test;
import static org.junit.Assert.*;
import static org.springframework.http.HttpHeaders.USER_AGENT;

import ru.mirea.webPetShop.myPets.Application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestUrls {

    @Test
    public void getUrls() {
        Application.main();
        String input = sendGet("http://localhost:8080/helloWorld");
        Application.stop();
        assertEquals("helloWorld", input);
        System.out.println("Test urls end.");
    }

    // HTTP GET request
    private String sendGet(String url) {
        try {

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // optional default is GET
            con.setRequestMethod("GET");

            //add request header
            con.setRequestProperty("User-Agent", USER_AGENT);

            //int responseCode = con.getResponseCode();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        }
        catch (Exception e)
        {
            return e.getLocalizedMessage();
        }
    }
}
