package br.com.apiclient.models.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by macau on 07/07/17.
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AttributeResource {
    private String name;
    private List<String> values;
}
