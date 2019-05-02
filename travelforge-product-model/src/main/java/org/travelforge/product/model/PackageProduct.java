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
public class PackageProduct implements Product, FlightComponent, HotelComponent, Serializable {

    private static final long serialVersionUID = 1L;

    private String provider;
    private String travelType;
    private String programType;
    private TourOperator tourOperator;
    private Travellers travellers;
    private TravelPeriod travelPeriod;
    private Flight flight;
    private Hotel hotel;
    private List<Extra> extras;
    private Price price;
    private Map<String, Object> properties;
    private Map<String, Object> references;

    public PackageProduct() {

    }

    public PackageProduct(String provider, String travelType, String programType, TourOperator tourOperator, Travellers travellers, TravelPeriod travelPeriod, Flight flight, Hotel hotel, List<Extra> extras, Price price, Map<String, Object> properties, Map<String, Object> references) {
        this.provider = provider;
        this.travelType = travelType;
        this.programType = programType;
        this.tourOperator = tourOperator;
        this.travellers = travellers;
        this.travelPeriod = travelPeriod;
        this.flight = flight;
        this.hotel = hotel;
        this.extras = extras;
        this.price = price;
        this.properties = properties;
        this.references = references;
    }

    public PackageProduct(String provider, TourOperator tourOperator, Travellers travellers, TravelPeriod travelPeriod, Flight flight, Hotel hotel, List<Extra> extras, Price price, Map<String, Object> properties, Map<String, Object> references) {
        this.provider = provider;
        this.tourOperator = tourOperator;
        this.travellers = travellers;
        this.travelPeriod = travelPeriod;
        this.flight = flight;
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
    public Flight getFlight() {
        return flight;
    }

    @Override
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
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

        PackageProduct that = (PackageProduct) o;

        if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;
        if (travelType != null ? !travelType.equals(that.travelType) : that.travelType != null) return false;
        if (programType != null ? !programType.equals(that.programType) : that.programType != null) return false;
        if (tourOperator != null ? !tourOperator.equals(that.tourOperator) : that.tourOperator != null) return false;
        if (travellers != null ? !travellers.equals(that.travellers) : that.travellers != null) return false;
        if (travelPeriod != null ? !travelPeriod.equals(that.travelPeriod) : that.travelPeriod != null) return false;
        if (flight != null ? !flight.equals(that.flight) : that.flight != null) return false;
        if (hotel != null ? !hotel.equals(that.hotel) : that.hotel != null) return false;
        if (extras != null ? !extras.equals(that.extras) : that.extras != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (properties != null ? !properties.equals(that.properties) : that.properties != null) return false;
        return references != null ? references.equals(that.references) : that.references == null;
    }

    @Override
    public int hashCode() {
        int result = provider != null ? provider.hashCode() : 0;
        result = 31 * result + (travelType != null ? travelType.hashCode() : 0);
        result = 31 * result + (programType != null ? programType.hashCode() : 0);
        result = 31 * result + (tourOperator != null ? tourOperator.hashCode() : 0);
        result = 31 * result + (travellers != null ? travellers.hashCode() : 0);
        result = 31 * result + (travelPeriod != null ? travelPeriod.hashCode() : 0);
        result = 31 * result + (flight != null ? flight.hashCode() : 0);
        result = 31 * result + (hotel != null ? hotel.hashCode() : 0);
        result = 31 * result + (extras != null ? extras.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (properties != null ? properties.hashCode() : 0);
        result = 31 * result + (references != null ? references.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageProduct{" +
                "provider='" + provider + '\'' +
                ", travelType='" + travelType + '\'' +
                ", programType='" + programType + '\'' +
                ", tourOperator=" + tourOperator +
                ", travellers=" + travellers +
                ", travelPeriod=" + travelPeriod +
                ", flight=" + flight +
                ", hotel=" + hotel +
                ", extras=" + extras +
                ", price=" + price +
                ", properties=" + properties +
                ", references=" + references +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_PACKAGE_PRODUCT extends PackageProduct> {

        protected String provider;
        protected String travelType;
        protected String programType;
        protected TourOperator tourOperator;
        protected Travellers travellers;
        protected TravelPeriod travelPeriod;
        protected Flight flight;
        protected Hotel hotel;
        protected List<Extra> extras;
        protected Price price;
        protected Map<String, Object> properties;
        protected Map<String, Object> references;

        protected Builder() {
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
        public T_BUILDER flight(Flight flight) {
            this.flight = flight;
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
        public T_PACKAGE_PRODUCT build() {
            return (T_PACKAGE_PRODUCT) new PackageProduct(provider, travelType, programType, tourOperator, travellers, travelPeriod, flight, hotel, extras, price, properties, references);
        }
    }
}
