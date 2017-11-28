/*
 * The Travelforge Project
 * http://www.travelforge.org
 *
 * Copyright (c) 2015 - 2017 Matthias Deck
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
public class TourOperator implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String name;

    public TourOperator() {
    }

    public TourOperator(String code, String name) {
        this.code = code;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TourOperator that = (TourOperator) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TourOperator{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_TOUR_OPERATOR extends TourOperator> {

        protected String code;
        protected String name;

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
        public T_TOUR_OPERATOR build() {
            return (T_TOUR_OPERATOR) new TourOperator(code, name);
        }
    }
}
