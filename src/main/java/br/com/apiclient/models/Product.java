package br.com.apiclient.models;

import br.com.apiclient.models.resources.ProductResource;

import static br.com.apiclient.models.Attribute.attribute;
import static br.com.apiclient.models.Image.image;

/**
 * Created by macau on 09/07/17.
 */
public class Product {

    public static Product product = new Product();

    public ProductResource valid() {
        ProductResource produto = new ProductResource();
        produto.setSku("macauTomatico");
        produto.setProductGroup("macauTomatico");
        produto.setDepartment("Casual");
        produto.setProductType("Tênis");
        produto.setBrand("Pretorian");
        produto.setName("macauTomatico");
        produto.setDescription("Produto Automatico do Macau");
        produto.setColor("Azul");
        //produto.setFlavor("");
        produto.setGender("Homem");
        produto.setManufacturerCode("MAC-AU");
        produto.setSize("38");
        produto.setEanIsbn("1234567");
        produto.setHeight(1);
        produto.setWidth(1);
        produto.setWeight(1);
        produto.setVideo("www.macautube.com.br");
        produto.setImages(image.valid());
        produto.setAttributes(attribute.valid());
        return produto;
    }
}
