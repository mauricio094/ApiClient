package br.com.apiclient.models;

import br.com.apiclient.models.resources.ImageResource;

import java.util.Arrays;
import java.util.List;

/**
 * Created by macau on 09/07/17.
 */
public class Image {

    public static Image image = new Image();

    public List<ImageResource> valid() {
        ImageResource firstImage = new ImageResource();
        firstImage.setUrl("http://myserver/image1.jpg");
        ImageResource secondImage = new ImageResource();
        secondImage.setUrl("http://myserver/image1.jpg");
        List<ImageResource> images = Arrays.asList(firstImage, secondImage);
        return images;
    }

}
