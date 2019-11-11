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
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String provider;
    private Integer id;
    private Integer code;
    private String productCode;
    private String name;
    private Float category;
    private Location location;
    private List<HotelAttribute> attributes;
    private List<HotelQualifier> qualifiers;
    private Map<String, Number> recommendations;
    private HotelRoom room;
    private HotelBoard board;

    public Hotel() {
    }

    public Hotel(String provider, Integer code, String productCode, String name, Float category, Location location, List<HotelAttribute> attributes, Map<String, Number> recommendations, HotelRoom room, HotelBoard board) {
        this.provider = provider;
        this.code = code;
        this.productCode = productCode;
        this.name = name;
        this.category = category;
        this.location = location;
        this.attributes = attributes;
        this.recommendations = recommendations;
        this.room = room;
        this.board = board;
    }

    public Hotel(String provider, Integer code, String productCode, String name, Float category, Location location, List<HotelAttribute> attributes, List<HotelQualifier> qualifiers, Map<String, Number> recommendations, HotelRoom room, HotelBoard board) {
        this.provider = provider;
        this.code = code;
        this.productCode = productCode;
        this.name = name;
        this.category = category;
        this.location = location;
        this.attributes = attributes;
        this.qualifiers = qualifiers;
        this.recommendations = recommendations;
        this.room = room;
        this.board = board;
    }

    public Hotel(String provider, Integer id, Integer code, String productCode, String name, Float category, Location location, List<HotelAttribute> attributes, List<HotelQualifier> qualifiers, Map<String, Number> recommendations, HotelRoom room, HotelBoard board) {
        this.provider = provider;
        this.id = id;
        this.code = code;
        this.productCode = productCode;
        this.name = name;
        this.category = category;
        this.location = location;
        this.attributes = attributes;
        this.qualifiers = qualifiers;
        this.recommendations = recommendations;
        this.room = room;
        this.board = board;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCategory() {
        return category;
    }

    public void setCategory(Float category) {
        this.category = category;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<HotelAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<HotelAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<HotelQualifier> getQualifiers() {
        return qualifiers;
    }

    public void setQualifiers(List<HotelQualifier> qualifiers) {
        this.qualifiers = qualifiers;
    }

    public Map<String, Number> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(Map<String, Number> recommendations) {
        this.recommendations = recommendations;
    }

    public HotelRoom getRoom() {
        return room;
    }

    public void setRoom(HotelRoom room) {
        this.room = room;
    }

    public HotelBoard getBoard() {
        return board;
    }

    public void setBoard(HotelBoard board) {
        this.board = board;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(provider, hotel.provider) &&
                Objects.equals(id, hotel.id) &&
                Objects.equals(code, hotel.code) &&
                Objects.equals(productCode, hotel.productCode) &&
                Objects.equals(name, hotel.name) &&
                Objects.equals(category, hotel.category) &&
                Objects.equals(location, hotel.location) &&
                Objects.equals(attributes, hotel.attributes) &&
                Objects.equals(qualifiers, hotel.qualifiers) &&
                Objects.equals(recommendations, hotel.recommendations) &&
                Objects.equals(room, hotel.room) &&
                Objects.equals(board, hotel.board);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, id, code, productCode, name, category, location, attributes, qualifiers, recommendations, room, board);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "provider='" + provider + '\'' +
                ", id=" + id +
                ", code=" + code +
                ", productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", location=" + location +
                ", attributes=" + attributes +
                ", qualifiers=" + qualifiers +
                ", recommendations=" + recommendations +
                ", room=" + room +
                ", board=" + board +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_HOTEL extends Hotel> {

        protected String provider;
        protected Integer id;
        protected Integer code;
        protected String productCode;
        protected String name;
        protected Float category;
        protected Location location;
        protected List<HotelAttribute> attributes;
        protected List<HotelQualifier> qualifiers;
        protected Map<String, Number> recommendations;
        protected HotelRoom room;
        protected HotelBoard board;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER provider(String provider) {
            this.provider = provider;
            return (T_BUILDER) this;
        }


        @SuppressWarnings("unchecked")
        public T_BUILDER id(Integer id) {
            this.id = id;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER code(Integer code) {
            this.code = code;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER productCode(String productCode) {
            this.productCode = productCode;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER name(String name) {
            this.name = name;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER category(Float category) {
            this.category = category;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER location(Location location) {
            this.location = location;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER attributes(Collection<? extends HotelAttribute> attributes) {
            this.attributes = attributes != null
                    ? new ArrayList<>(attributes) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER qualifiers(Collection<? extends HotelQualifier> qualifiers) {
            this.qualifiers = qualifiers != null
                    ? new ArrayList<>(qualifiers) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER recommendations(Map<? extends String, ? extends Number> recommendations) {
            this.recommendations = recommendations != null
                    ? new LinkedHashMap<>(recommendations) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER room(HotelRoom room) {
            this.room = room;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER board(HotelBoard board) {
            this.board = board;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_HOTEL build() {
            return (T_HOTEL) new Hotel(provider, id, code, productCode, name, category, location, attributes, qualifiers, recommendations, room, board);
        }
    }
}
