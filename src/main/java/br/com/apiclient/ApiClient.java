package br.com.apiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by macau on 06/07/17.
 */
public class ApiClient {
    public static String urlSandbox = "http://api-sandbox.netshoes.com.br/api/v1/brands";

    public static String sandboxMidwayIdClient = "auNwyoN8bwyJ";
    public static String sandboxMidwayAccesToken = "Uo0jfmmgCLlF";

    public static void main(String[] args) {
        ApiClient client = new ApiClient();
        client.getRequest(urlSandbox, sandboxMidwayIdClient, sandboxMidwayAccesToken);
    }

    public void getRequest(String urlPath, String idClient, String accessToken) {
        try {
            URL url = new URL(urlPath);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("client_id", idClient);
            conn.setRequestProperty("access_token", accessToken);

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error Code: " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String output;
            System.out.println("Output from Server ..... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void postRequest(String urlPath, String idClient, String accessToken) {
        try {
            URL url = new URL(urlPath);

        }

    }
}