package br.com.apiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by macau on 06/07/17.
 */
public class ApiClient {
    

    public static void main(String[] args) {
        ApiClient client = new ApiClient();
        client.getRequest(sandboxMidwayIdClient, sandboxMidwayAccesToken, urlSandboxV1, parametroMarcas);
        client.postRequest(sandboxMidwayIdClient, sandboxMidwayAccesToken, urlSandboxV2, parametroProdutos);
    }

    public void getRequest(String idClient, String accessToken, String urlPath, String... parametros) {
        try {
            for (String parametro : parametros) {
                urlPath = urlPath + "/" + parametro;
            }
            System.out.println(urlPath);
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

    public void postRequest(String idClient, String accessToken, String urlPath, String... parametros) {

        try {
            for (String parametro : parametros) {
                urlPath = urlPath + "/" + parametro;
            }
            System.out.println(urlPath);
            URL url = new URL(urlPath);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("client_id", idClient);
            conn.setRequestProperty("access_token", accessToken);

            String input = "{\"qty\":100,\"name\":\"iPad 4\"}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();

        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
