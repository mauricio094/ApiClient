package br.com.apiclient.models;

import br.com.apiclient.models.resources.ProductResource;
import br.com.apiclient.utils.Util;

import java.util.Properties;

import static br.com.apiclient.models.Attribute.attribute;
import static br.com.apiclient.models.Image.image;

/**
 * Created by macau on 09/07/17.
 */
public class Product {

    public static Product product = new Product();
    public static int contador = Integer.parseInt(Util.readProperties("product.count"));

    public ProductResource valid() {
        ProductResource produto = new ProductResource();
        produto.setSku("macauTomatico"+contador);
        produto.setProductGroup("macauTomatico"+contador);
        produto.setName("macauTomatico"+contador);
        produto.setDescription("Produto Automatico do Macau "+contador);
        produto.setEanIsbn("6543952"+contador);
        produto.setBrand("Pretorian");
        produto.setDepartment("Casual");
        produto.setProductType("Tênis");
        produto.setColor("Azul");
        //produto.setFlavor("");
        produto.setGender("Homem");
        produto.setManufacturerCode("MAC-AU");
        produto.setSize("38");
        produto.setHeight(1);
        produto.setWidth(1);
        produto.setWeight(1);
        produto.setVideo("https://www.youtube.com/watch?v=YCjKBvNAlWw");
        produto.setImages(image.valid());
        produto.setAttributes(attribute.valid());
        return produto;
    }
}
