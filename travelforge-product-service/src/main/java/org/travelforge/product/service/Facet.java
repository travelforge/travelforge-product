package org.travelforge.product.service;

import lombok.Data;

import java.io.Serializable;

@Data
public class Facet implements Serializable {

    private String field;
    private String fieldValue;
    private Long value;
}
