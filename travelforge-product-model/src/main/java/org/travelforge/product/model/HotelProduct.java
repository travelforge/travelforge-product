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
public class HotelProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    private String provider;
    private TourOperator tourOperator;
    private Travellers travellers;
    private TravelPeriod travelPeriod;
    private Hotel hotel;
    private List<Extra> extras;
    private Price price;
    private Map<String, Object> references;

    public HotelProduct() {

    }

    public HotelProduct(String provider, TourOperator tourOperator, Travellers travellers, TravelPeriod travelPeriod, Hotel hotel, List<Extra> extras, Price price, Map<String, Object> references) {
        this.provider = provider;
        this.tourOperator = tourOperator;
        this.travellers = travellers;
        this.travelPeriod = travelPeriod;
        this.hotel = hotel;
        this.extras = extras;
        this.price = price;
        this.references = references;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public TourOperator getTourOperator() {
        return tourOperator;
    }

    public void setTourOperator(TourOperator tourOperator) {
        this.tourOperator = tourOperator;
    }

    public Travellers getTravellers() {
        return travellers;
    }

    public void setTravellers(Travellers travellers) {
        this.travellers = travellers;
    }

    public TravelPeriod getTravelPeriod() {
        return travelPeriod;
    }

    public void setTravelPeriod(TravelPeriod travelPeriod) {
        this.travelPeriod = travelPeriod;
    }
    
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
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

        HotelProduct that = (HotelProduct) o;

        if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;
        if (tourOperator != null ? !tourOperator.equals(that.tourOperator) : that.tourOperator != null) return false;
        if (travellers != null ? !travellers.equals(that.travellers) : that.travellers != null) return false;
        if (travelPeriod != null ? !travelPeriod.equals(that.travelPeriod) : that.travelPeriod != null) return false;
        if (hotel != null ? !hotel.equals(that.hotel) : that.hotel != null) return false;
        if (extras != null ? !extras.equals(that.extras) : that.extras != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        return references != null ? references.equals(that.references) : that.references == null;
    }

    @Override
    public int hashCode() {
        int result = provider != null ? provider.hashCode() : 0;
        result = 31 * result + (tourOperator != null ? tourOperator.hashCode() : 0);
        result = 31 * result + (travellers != null ? travellers.hashCode() : 0);
        result = 31 * result + (travelPeriod != null ? travelPeriod.hashCode() : 0);
        result = 31 * result + (hotel != null ? hotel.hashCode() : 0);
        result = 31 * result + (extras != null ? extras.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (references != null ? references.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelProduct{" +
                "provider='" + provider + '\'' +
                ", tourOperator=" + tourOperator +
                ", travellers=" + travellers +
                ", travelPeriod=" + travelPeriod +
                ", hotel=" + hotel +
                ", extras=" + extras +
                ", price=" + price +
                ", references=" + references +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_HOTEL_PRODUCT extends HotelProduct> {

        protected String provider;
        protected TourOperator tourOperator;
        protected Travellers travellers;
        protected TravelPeriod travelPeriod;
        protected Hotel hotel;
        protected List<Extra> extras;
        protected Price price;
        protected Map<String, Object> references;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER provider(String provider) {
            this.provider = provider;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER tourOperator(TourOperator tourOperator) {
            this.tourOperator = tourOperator;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER travellers(Travellers travellers) {
            this.travellers = travellers;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER travelPeriod(TravelPeriod travelPeriod) {
            this.travelPeriod = travelPeriod;
            return (T_BUILDER) this;
        }
        
        @SuppressWarnings("unchecked")
        public T_BUILDER hotel(Hotel hotel) {
            this.hotel = hotel;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER extras(Collection<? extends Extra> extras) {
            this.extras = extras != null
                    ? new ArrayList<>(extras) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER price(Price price) {
            this.price = price;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER references(Map<String, Object> references) {
            this.references = references != null
                    ? new LinkedHashMap<>(references) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_HOTEL_PRODUCT build() {
            return (T_HOTEL_PRODUCT) new HotelProduct(provider, tourOperator, travellers, travelPeriod, hotel, extras, price, references);
        }
    }
}
