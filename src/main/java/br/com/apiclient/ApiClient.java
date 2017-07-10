package br.com.apiclient;

<<<<<<< HEAD
import br.com.apiclient.models.resources.ProductResource;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
=======
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
>>>>>>> parent of d860d7a... post

/**
 * Created by macau on 06/07/17.
 */
public class ApiClient {

<<<<<<< HEAD
=======

>>>>>>> parent of d860d7a... post

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

<<<<<<< HEAD
    public String getProductBySku(String sku) {
        return client
                .target(urlSandbox)
                .path(sku)
                .request(MediaType.APPLICATION_JSON)
                .header("client_id", sandboxMidwayIdClient)
                .header("access_token", sandboxMidwayAccesToken)
                .get(String.class);
    }

    public Object postProduct(ProductResource product) {
        return client
                .target(urlSandbox)
                .request(MediaType.APPLICATION_JSON)
                .header("client_id", sandboxMidwayIdClient)
                .header("access_token", sandboxMidwayAccesToken)
                .post(Entity.entity(product, MediaType.APPLICATION_JSON))
                .getEntity();
=======
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
>>>>>>> parent of d860d7a... post
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
