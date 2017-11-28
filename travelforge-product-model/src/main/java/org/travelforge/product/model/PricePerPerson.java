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
public class PricePerPerson implements Serializable {

    private static final long serialVersionUID = 1L;

    private String type;
    private Float amount;

    public PricePerPerson() {
    }

    public PricePerPerson(String type, Float amount) {
        this.type = type;
        this.amount = amount;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PricePerPerson that = (PricePerPerson) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return amount != null ? amount.equals(that.amount) : that.amount == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PricePerPerson{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_PRICE_PER_PERSON extends PricePerPerson> {

        protected String type;
        protected Float amount;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER type(String type) {
            this.type = type;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER amount(Float amount) {
            this.amount = amount;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_PRICE_PER_PERSON build() {
            return (T_PRICE_PER_PERSON) new PricePerPerson(type, amount);
        }
    }
}
