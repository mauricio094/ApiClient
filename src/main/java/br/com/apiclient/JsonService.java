package br.com.apiclient;

import br.com.apiclient.models.resources.ProductResource;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by macau on 07/07/17.
 */
@Path("/json/product")
public class JsonService {

    @GET
    @Path("/get")
    @Produces("application/json")
    public ProductResource getProductInJSON() {

        ProductResource product = new ProductResource();
        product.setName("iPad 3");
        product.setSku("TEST");

        return product;

    }

    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response createProductInJSON(ProductResource product) {

        String result = "Product created : " + product;
        return Response.status(201).entity(result).build();

    }
}
//...
