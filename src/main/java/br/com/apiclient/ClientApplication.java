package br.com.apiclient;

import static br.com.apiclient.ApiClient.*;

/**
 * Created by macau on 07/07/17.
 */
public class ClientApplication {


    public static void main(String[] args) {
        ApiClient client = new ApiClient();
        //    client.postRequest(sandboxMidwayIdClient, sandboxMidwayAccesToken, urlSandbox,"v1","products");
        client.getRequest(sandboxMidwayIdClient, sandboxMidwayAccesToken, urlSandbox, "v2", "products");
    }
}
