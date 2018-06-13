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
public class HotelAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String name;
    private String iconHref;

    public HotelAttribute() {
    }

    public HotelAttribute(String code, String name, String iconHref) {
        this.code = code;
        this.name = name;
        this.iconHref = iconHref;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconHref() {
        return iconHref;
    }

    public void setIconHref(String iconHref) {
        this.iconHref = iconHref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelAttribute that = (HotelAttribute) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return iconHref != null ? iconHref.equals(that.iconHref) : that.iconHref == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (iconHref != null ? iconHref.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelAttribute{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", iconHref='" + iconHref + '\'' +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_HOTEL_ATTRIBUTE extends HotelAttribute> {

        protected String code;
        protected String name;
        protected String iconHref;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER code(String code) {
            this.code = code;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER name(String name) {
            this.name = name;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER iconHref(String iconHref) {
            this.iconHref = iconHref;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_HOTEL_ATTRIBUTE build() {
            return (T_HOTEL_ATTRIBUTE) new HotelAttribute(code, name, iconHref);
        }
    }
}
