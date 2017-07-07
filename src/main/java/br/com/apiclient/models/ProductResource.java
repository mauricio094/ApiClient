package br.com.apiclient.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by macau on 07/07/17.
 */

@Data
@NoArgsConstructor
@ToString
public class ProductResource {

    private String sku;
    private String productGroup;
    private String department;
    private String productType;
    private String brand;
    private String name;
    private String description;
    private String color;
    private String flavor;
    private String gender;
    private String manufacturerCode;
    private String size;
    private String eanIsbn;
    private Double height;
    private Double width;
    private Double depth;
    private Double weight;
    private String video;
    private List<ImageResource> images;
    private List<AttributeResource> attributes;
}