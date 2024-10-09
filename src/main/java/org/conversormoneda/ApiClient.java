package org.conversormoneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;

public class ApiClient {

    private static final String API_KEY = "fb1d4ce6acb9f9fdb3172f5d";

    public String getConversionRate(String coin, String coinTo, String value) throws IOException, InterruptedException {
        String apiUrl = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + coin + "/" + coinTo + "/" + value;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new IOException("La API devolvió un código de estado " + response.statusCode());
            }
            return response.body();
        } catch (HttpTimeoutException e) {
            throw new IOException("La solicitud a la API excedió el tiempo límite.");
        }
    }
}
