package org.conversormoneda;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class CurrencyConverter {

    public void convert(String coin, String coinTo, String value, String apiResponse) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(apiResponse, JsonObject.class);

        double result = Double.parseDouble(String.valueOf(jsonObject.get("conversion_result")));
        String formattedResult = String.format("%.2f", result);

        System.out.println("\nEl valor [" + coin + "] corresponde al valor final de => "
                + formattedResult + " [" + coinTo + "]\n");
    }
}