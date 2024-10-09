package org.conversormoneda;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private final ApiClient apiClient = new ApiClient();
    private final CurrencyConverter currencyConverter = new CurrencyConverter();

    public void mostrarMenu() throws IOException, InterruptedException {
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
            if (optionValue == 7) {
                System.out.println("Gracias por usar");
                return;
            }
            handleOption(optionValue);
        }
    }

    private void handleOption(int optionValue) throws IOException, InterruptedException {
        String coin = "", coinTo = "";

        switch (optionValue) {
            case 1 -> { coin = "USD"; coinTo = "ARS"; }
            case 2 -> { coin = "ARS"; coinTo = "USD"; }
            case 3 -> { coin = "USD"; coinTo = "BRL"; }
            case 4 -> { coin = "BRL"; coinTo = "USD"; }
            case 5 -> { coin = "USD"; coinTo = "COP"; }
            case 6 -> { coin = "COP"; coinTo = "USD"; }
            default -> System.out.println("POR FAVOR INGRESA UNA OPCION VALIDA\n");
        }

        if (!coin.isEmpty() && !coinTo.isEmpty()) {
            System.out.print("Ingresa el valor a convertir: ");
            Scanner scanner = new Scanner(System.in);
            String valor = scanner.next();
            if (Double.parseDouble(valor) > 0) {
                String apiResponse = apiClient.getConversionRate(coin, coinTo, valor);
                currencyConverter.convert(coin, coinTo, valor, apiResponse);
            } else {
                System.out.println("DEBES DE INGRESAR UN VALOR CORRECTO\n");
            }
        }
    }
}