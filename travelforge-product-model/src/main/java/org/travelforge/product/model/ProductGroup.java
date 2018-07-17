/*
 * The Travelforge Project
 * http://www.travelforge.org
 *
 * Copyright (c) 2015-present Matthias Deck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.travelforge.product.model;

import java.io.Serializable;
import java.util.*;

/**
 * @author Matthias Deck
 */
public abstract class ProductGroup<T_PRODUCT_GROUP extends ProductGroup, T_PRODUCT extends Product> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Map<String, Object> properties;
    private List<T_PRODUCT_GROUP> productGroups;
    private List<T_PRODUCT> products;
    private Map<String, Object> references;

    public ProductGroup() {
    }

    public ProductGroup(Integer id, String name, Map<String, Object> properties, List<T_PRODUCT_GROUP> productGroups, List<T_PRODUCT> products, Map<String, Object> references) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.productGroups = productGroups;
        this.products = products;
        this.references = references;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public List<T_PRODUCT_GROUP> getProductGroups() {
        return productGroups;
    }

    public void setProductGroups(List<T_PRODUCT_GROUP> productGroups) {
        this.productGroups = productGroups;
    }

    public List<T_PRODUCT> getProducts() {
        return products;
    }

    public void setProducts(List<T_PRODUCT> products) {
        this.products = products;
    }

    public Map<String, Object> getReferences() {
        return references;
    }

    public void setReferences(Map<String, Object> references) {
        this.references = references;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductGroup that = (ProductGroup) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (properties != null ? !properties.equals(that.properties) : that.properties != null) return false;
        if (productGroups != null ? !productGroups.equals(that.productGroups) : that.productGroups != null)
            return false;
        if (products != null ? !products.equals(that.products) : that.products != null) return false;
        return references != null ? references.equals(that.references) : that.references == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (properties != null ? properties.hashCode() : 0);
        result = 31 * result + (productGroups != null ? productGroups.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (references != null ? references.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", properties=" + properties +
                ", productGroups=" + productGroups +
                ", products=" + products +
                ", references=" + references +
                '}';
    }

    public abstract static class Builder<T_BUILDER extends Builder, T_PRODUCT_GROUP extends ProductGroup, T_PRODUCT extends Product> {

        protected Integer id;
        protected String name;
        protected Map<String, Object> properties;
        protected List<T_PRODUCT_GROUP> productGroups;
        protected List<T_PRODUCT> products;
        protected Map<String, Object> references;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER id(Integer id) {
            this.id = id;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER name(String name) {
            this.name = name;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER properties(Map<? extends String, ?> properties) {
            this.properties = properties != null
                    ? new LinkedHashMap<>(properties) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER productGroups(Collection<? extends T_PRODUCT_GROUP> productGroups) {
            this.productGroups = productGroups != null
                    ? new ArrayList<>(productGroups) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER products(Collection<? extends T_PRODUCT> products) {
            this.products = products != null
                    ? new ArrayList<>(products) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER references(Map<String, Object> references) {
            this.references = references != null
                    ? new LinkedHashMap<>(references) : null;
            return (T_BUILDER) this;
        }

        public abstract T_PRODUCT_GROUP build();
    }
}
