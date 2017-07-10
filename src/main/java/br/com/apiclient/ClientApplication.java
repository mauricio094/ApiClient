package br.com.apiclient;

import static br.com.apiclient.models.Product.product;

/**
 * Created by macau on 07/07/17.
 */
public class ClientApplication {

    public static void main(String[] args) {
        ApiClient client = new ApiClient();
        //System.out.println(client.getProductBySku("TesteMotordeCritica00"));
        System.out.println(client.postProduct(product.valid()));
    }
}
