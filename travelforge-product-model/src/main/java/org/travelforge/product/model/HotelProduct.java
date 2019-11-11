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
public class HotelProduct implements Product, HotelComponent, Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String provider;
    private String travelType;
    private String programType;
    private TourOperator tourOperator;
    private Travellers travellers;
    private TravelPeriod travelPeriod;
    private Hotel hotel;
    private List<Extra> extras;
    private Price price;
    private Map<String, Object> properties;
    private Map<String, Object> references;

    public HotelProduct() {

    }

    public HotelProduct(String provider, String travelType, String programType, TourOperator tourOperator, Travellers travellers, TravelPeriod travelPeriod, Hotel hotel, List<Extra> extras, Price price, Map<String, Object> properties, Map<String, Object> references) {
        this.provider = provider;
        this.travelType = travelType;
        this.programType = programType;
        this.tourOperator = tourOperator;
        this.travellers = travellers;
        this.travelPeriod = travelPeriod;
        this.hotel = hotel;
        this.extras = extras;
        this.price = price;
        this.properties = properties;
        this.references = references;
    }

    public HotelProduct(String provider, TourOperator tourOperator, Travellers travellers, TravelPeriod travelPeriod, Hotel hotel, List<Extra> extras, Price price, Map<String, Object> properties, Map<String, Object> references) {
        this.provider = provider;
        this.tourOperator = tourOperator;
        this.travellers = travellers;
        this.travelPeriod = travelPeriod;
        this.hotel = hotel;
        this.extras = extras;
        this.price = price;
        this.properties = properties;
        this.references = references;
    }

    public HotelProduct(String id, String provider, String travelType, String programType, TourOperator tourOperator, Travellers travellers, TravelPeriod travelPeriod, Hotel hotel, List<Extra> extras, Price price, Map<String, Object> properties, Map<String, Object> references) {
        this.id = id;
        this.provider = provider;
        this.travelType = travelType;
        this.programType = programType;
        this.tourOperator = tourOperator;
        this.travellers = travellers;
        this.travelPeriod = travelPeriod;
        this.hotel = hotel;
        this.extras = extras;
        this.price = price;
        this.properties = properties;
        this.references = references;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getProvider() {
        return provider;
    }

    @Override
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String getTravelType() {
        return travelType;
    }

    @Override
    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    @Override
    public String getProgramType() {
        return programType;
    }

    @Override
    public void setProgramType(String programType) {
        this.programType = programType;
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

    @Override
    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }

    @Override
    public Price getPrice() {
        return price;
    }

    @Override
    public void setPrice(Price price) {
        this.price = price;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
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
        return Objects.equals(id, that.id) &&
                Objects.equals(provider, that.provider) &&
                Objects.equals(travelType, that.travelType) &&
                Objects.equals(programType, that.programType) &&
                Objects.equals(tourOperator, that.tourOperator) &&
                Objects.equals(travellers, that.travellers) &&
                Objects.equals(travelPeriod, that.travelPeriod) &&
                Objects.equals(hotel, that.hotel) &&
                Objects.equals(extras, that.extras) &&
                Objects.equals(price, that.price) &&
                Objects.equals(properties, that.properties) &&
                Objects.equals(references, that.references);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, provider, travelType, programType, tourOperator, travellers, travelPeriod, hotel, extras, price, properties, references);
    }

    @Override
    public String toString() {
        return "HotelProduct{" +
                "id='" + id + '\'' +
                ", provider='" + provider + '\'' +
                ", travelType='" + travelType + '\'' +
                ", programType='" + programType + '\'' +
                ", tourOperator=" + tourOperator +
                ", travellers=" + travellers +
                ", travelPeriod=" + travelPeriod +
                ", hotel=" + hotel +
                ", extras=" + extras +
                ", price=" + price +
                ", properties=" + properties +
                ", references=" + references +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_HOTEL_PRODUCT extends HotelProduct> {

        protected String id;
        protected String provider;
        protected String travelType;
        protected String programType;
        protected TourOperator tourOperator;
        protected Travellers travellers;
        protected TravelPeriod travelPeriod;
        protected Hotel hotel;
        protected List<Extra> extras;
        protected Price price;
        protected Map<String, Object> properties;
        protected Map<String, Object> references;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER id(String id) {
            this.id = id;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER provider(String provider) {
            this.provider = provider;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER travelType(String travelType) {
            this.travelType = travelType;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER programType(String programType) {
            this.programType = programType;
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
        public T_BUILDER properties(Map<String, Object> properties) {
            this.properties = properties != null
                    ? new LinkedHashMap<>(properties) : null;
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
            return (T_HOTEL_PRODUCT) new HotelProduct(id, provider, travelType, programType, tourOperator, travellers, travelPeriod, hotel, extras, price, properties, references);
        }
    }
}
