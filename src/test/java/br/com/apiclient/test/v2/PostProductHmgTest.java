package br.com.apiclient.test.v2;

import br.com.apiclient.ApiClient;
import br.com.apiclient.models.Product;
import br.com.apiclient.utils.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static br.com.apiclient.models.Product.contador;
import static br.com.apiclient.models.Product.product;

/**
 * Created by macau on 10/07/17.
 */
public class PostProductHmgTest {

    ApiClient client = new ApiClient();

    @Test
    public void createNewProductHmg(){
        int novoContador=contador+1;
        Util.writeProperties("product.count", String.valueOf(novoContador));
        System.out.println(client.postProduct(product.valid()));
    }

}
