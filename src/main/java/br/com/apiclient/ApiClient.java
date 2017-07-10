package br.com.apiclient;

import br.com.apiclient.models.resources.ProductResource;
import com.google.gson.Gson;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by macau on 06/07/17.
 */
public class ApiClient {

    public static String urlHmg02 = "http://hmg02-gateway-app1.netshoes.local:8580/api/v2/products";
    public static String urlSandbox = "http://api-sandbox.netshoes.com.br/api/v2/products";

    public static String sandboxMidwayIdClient = "auNwyoN8bwyJ";
    public static String sandboxMidwayAccesToken = "Uo0jfmmgCLlF";
    public static String cnpjUltraMacauBigStore = "72636615000110";

    private Client client = ClientBuilder.newClient();

    public String getProductBySku(String sku) {
         return client
                .target(urlHmg02)
                .path(sku)
                .request(MediaType.APPLICATION_JSON)
                .header("cnpj", cnpjUltraMacauBigStore)
//                .header("client_id", sandboxMidwayIdClient)
//                .header("access_token", sandboxMidwayAccesToken)
                .get(String.class);
    }

    public Response postProduct(ProductResource product) {
        return client
                .target(urlHmg02)
                .request(MediaType.APPLICATION_JSON)
                .header("cnpj", cnpjUltraMacauBigStore)
//                .header("client_id", sandboxMidwayIdClient)
//                .header("access_token", sandboxMidwayAccesToken)
                .post(Entity.entity(product,MediaType.APPLICATION_JSON));

    }

    public String checkMarketplaceHmgServices(String urlService) {
        return client
                .target(urlService)
                .path("/health")
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
    }

}