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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Matthias Deck
 */
public class Price implements Serializable {

    private static final long serialVersionUID = 1L;

    private String currency;
    private Float amountTotal;
    private Float amountPerPerson;
    private List<PricePerPerson> pricesPerPerson;

    public Price() {
    }

    public Price(String currency, Float amountTotal, Float amountPerPerson, List<PricePerPerson> pricesPerPerson) {
        this.currency = currency;
        this.amountTotal = amountTotal;
        this.amountPerPerson = amountPerPerson;
        this.pricesPerPerson = pricesPerPerson;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(Float amountTotal) {
        this.amountTotal = amountTotal;
    }

    public Float getAmountPerPerson() {
        return amountPerPerson;
    }

    public void setAmountPerPerson(Float amountPerPerson) {
        this.amountPerPerson = amountPerPerson;
    }

    public List<PricePerPerson> getPricesPerPerson() {
        return pricesPerPerson;
    }

    public void setPricesPerPerson(List<PricePerPerson> pricesPerPerson) {
        this.pricesPerPerson = pricesPerPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price = (Price) o;

        if (currency != null ? !currency.equals(price.currency) : price.currency != null) return false;
        if (amountTotal != null ? !amountTotal.equals(price.amountTotal) : price.amountTotal != null) return false;
        if (amountPerPerson != null ? !amountPerPerson.equals(price.amountPerPerson) : price.amountPerPerson != null)
            return false;
        return pricesPerPerson != null ? pricesPerPerson.equals(price.pricesPerPerson) : price.pricesPerPerson == null;
    }

    @Override
    public int hashCode() {
        int result = currency != null ? currency.hashCode() : 0;
        result = 31 * result + (amountTotal != null ? amountTotal.hashCode() : 0);
        result = 31 * result + (amountPerPerson != null ? amountPerPerson.hashCode() : 0);
        result = 31 * result + (pricesPerPerson != null ? pricesPerPerson.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Price{" +
                "currency='" + currency + '\'' +
                ", amountTotal=" + amountTotal +
                ", amountPerPerson=" + amountPerPerson +
                ", pricesPerPerson=" + pricesPerPerson +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_PRICE extends Price> {

        protected String currency;
        protected Float amountTotal;
        protected Float amountPerPerson;
        protected List<PricePerPerson> pricesPerPerson;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER currency(String currency) {
            this.currency = currency;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER amountTotal(Float amountTotal) {
            this.amountTotal = amountTotal;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER amountPerPerson(Float amountPerPerson) {
            this.amountPerPerson = amountPerPerson;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER pricesPerPerson(Collection<? extends PricePerPerson> pricesPerPerson) {
            this.pricesPerPerson = pricesPerPerson != null
                    ? new ArrayList<>(pricesPerPerson) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_PRICE build() {
            return (T_PRICE) new Price(currency, amountTotal, amountPerPerson, pricesPerPerson);
        }
    }
}
