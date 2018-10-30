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

/**
 * @author Matthias Deck
 */
public class HotelQualifier implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Float value;

    public HotelQualifier() {
    }

    public HotelQualifier(String name, Float value) {
        this.name = name;
        this.value = value;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelQualifier country = (HotelQualifier) o;

        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        return value != null ? value.equals(country.value) : country.value == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelQualifier{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_QUALIFIER extends HotelQualifier> {

        protected String name;
        protected Float value;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER name(String name) {
            this.name = name;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER value(Float value) {
            this.value = value;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_QUALIFIER build() {
            return (T_QUALIFIER) new HotelQualifier(name, value);
        }
    }
}
