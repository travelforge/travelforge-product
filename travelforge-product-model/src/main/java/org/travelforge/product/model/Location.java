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
public class Location implements Serializable {

    private static final long serialVersionUID = 1L;

    private Country country;
    private Region region;
    private City city;
    private Float latitude;
    private Float longitude;

    private Integer avgAirTemperature;
    private Integer avgWaterTemperature;

    public Location() {
    }

    public Location(Country country, Region region, City city, Float latitude, Float longitude) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(Country country, Region region, City city, Float latitude, Float longitude, Integer avgAirTemperature, Integer avgWaterTemperature) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.avgAirTemperature = avgAirTemperature;
        this.avgWaterTemperature = avgWaterTemperature;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Integer getAvgAirTemperature() {
        return avgAirTemperature;
    }

    public void setAvgAirTemperature(Integer avgAirTemperature) {
        this.avgAirTemperature = avgAirTemperature;
    }

    public Integer getAvgWaterTemperature() {
        return avgWaterTemperature;
    }

    public void setAvgWaterTemperature(Integer avgWaterTemperature) {
        this.avgWaterTemperature = avgWaterTemperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (country != null ? !country.equals(location.country) : location.country != null) return false;
        if (region != null ? !region.equals(location.region) : location.region != null) return false;
        if (city != null ? !city.equals(location.city) : location.city != null) return false;
        if (latitude != null ? !latitude.equals(location.latitude) : location.latitude != null) return false;
        if (longitude != null ? !longitude.equals(location.longitude) : location.longitude != null) return false;
        if (avgAirTemperature != null ? !avgAirTemperature.equals(location.avgAirTemperature) : location.avgAirTemperature != null)
            return false;
        return avgWaterTemperature != null ? avgWaterTemperature.equals(location.avgWaterTemperature) : location.avgWaterTemperature == null;
    }

    @Override
    public int hashCode() {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (avgAirTemperature != null ? avgAirTemperature.hashCode() : 0);
        result = 31 * result + (avgWaterTemperature != null ? avgWaterTemperature.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country=" + country +
                ", region=" + region +
                ", city=" + city +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", avgAirTemperature=" + avgAirTemperature +
                ", avgWaterTemperature=" + avgWaterTemperature +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_LOCATION extends Location> {

        protected Country country;
        protected Region region;
        protected City city;
        protected Float latitude;
        protected Float longitude;

        protected Integer avgAirTemperature;
        protected Integer avgWaterTemperature;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER country(Country country) {
            this.country = country;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER region(Region region) {
            this.region = region;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER city(City city) {
            this.city = city;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER latitude(Float latitude) {
            this.latitude = latitude;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER longitude(Float longitude) {
            this.longitude = longitude;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER avgAirTemperature(Integer avgAirTemperature) {
            this.avgAirTemperature = avgAirTemperature;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER avgWaterTemperature(Integer avgWaterTemperature) {
            this.avgWaterTemperature = avgWaterTemperature;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_LOCATION build() {
            return (T_LOCATION) new Location(country, region, city, latitude, longitude, avgAirTemperature, avgWaterTemperature);
        }
    }
}
