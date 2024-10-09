package org.conversormoneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main {

    /*
    public static void validarValor(String coin, String coinTo) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor a convertir: ");
        String valor = scanner.next();

        var newValor = Double.valueOf(valor);

        if(newValor > 0){
            convert(coin, coinTo, valor);
        }
        else {
            System.out.println("DEBES DE INGRESAR UN VALOR CORRECTO\n");
        }
    }

    public static void convert (String coin, String coinTo, String value) throws IOException, InterruptedException {

        String apiValue = "fb1d4ce6acb9f9fdb3172f5d";

        String apiUrl = "https://v6.exchangerate-api.com/v6/"+apiValue+"/pair/"+coin+"/"+coinTo+"/"+value;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                System.out.println("Error: La API devolvió un código de estado " + response.statusCode());
                return;
            }

            Gson gson = new Gson();

            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);

            double result = Double.parseDouble(String.valueOf(jsonObject.get("conversion_result")));

            String formattedResult = String.format("%.2f", result);

            System.out.println("\nEl valor [" + coin + "] corresponde al valor final de => "
                    + formattedResult + " [" + coinTo + "]\n");

        } catch (HttpTimeoutException e) {
            // Manejar el caso donde la solicitud expira
            System.err.println("Error: La solicitud a la API excedió el tiempo límite.");
        } catch (IOException e) {
            // Manejar errores de entrada/salida (problemas de conexión)
            System.err.println("Error de conexión: No se pudo conectar a la API. Verifique su conexión a Internet.");
        } catch (InterruptedException e) {
            // Manejar interrupciones del hilo
            System.err.println("Error: La operación fue interrumpida.");
        } catch (Exception e) {
            // Manejar cualquier otro tipo de error
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    public static void menu() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1) Dolar => peso Argentino\n" +
                            "2) Peso Argentino => Dolar\n" +
                            "3) Dolar => Real Brasileño\n" +
                            "4) Real Brasileño => Dolar\n" +
                            "5) Dolar => Peso Colombiano\n" +
                            "6) Peso Colombiano => Dolar\n" +
                            "7) Salir\n\n" +
                            "POR FAVOR INGRESA UNA OPCION");

            int optionValue = scanner.nextInt();

            switch (optionValue){
                case 1:
                    validarValor("USD", "ARS");
                    break;

                case 2:
                    validarValor("ARS", "USD");
                    break;

                case 3:
                    validarValor("USD", "BRL");
                    break;

                case 4:
                    validarValor("BRL", "USD");
                    break;

                case 5:
                    validarValor("USD", "COP");
                    break;

                case 6:
                    validarValor("COP", "USD");
                    break;

                case 7:
                    System.out.println("Gracias por usar");
                    return;

                default:
                    System.out.println("POR FAVOR INGRESA UNA OPCION VALIDA\n");
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        menu();
    }
     */

    public static void main(String[] args) throws IOException, InterruptedException {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }

}