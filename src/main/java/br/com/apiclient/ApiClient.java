package br.com.apiclient;

import br.com.apiclient.models.resources.ProductResource;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

/**
 * Created by macau on 06/07/17.
 */
public class ApiClient {


    private Client client = ClientBuilder.newClient();

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
    }

}