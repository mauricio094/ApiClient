package br.com.apiclient.models;

import br.com.apiclient.models.resources.AttributeResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by macau on 09/07/17.
 */
public class Attribute {

    public static Attribute attribute = new Attribute();

    public List<AttributeResource> valid() {

        AttributeResource firstAttribute = new AttributeResource();
        firstAttribute.setName("Tecnologia");
        firstAttribute.setValues(new ArrayList<String>(Arrays.asList("Air")));

        AttributeResource secondtAttribute = new AttributeResource();
        secondtAttribute.setName("Material");
        secondtAttribute.setValues(new ArrayList<String>(Arrays.asList("Madeira", "Vidro")));

        List<AttributeResource> attributes = new ArrayList<AttributeResource>(Arrays.asList(firstAttribute, secondtAttribute));
        return attributes;
    }
}
