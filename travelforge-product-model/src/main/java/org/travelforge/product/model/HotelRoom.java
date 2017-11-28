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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Matthias Deck
 */
public class HotelRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private List<String> codes;
    private String opCode;
    private String bookingCode;
    private String key;
    private String name;
    private List<HotelRoomAttribute> attributes;
    private List<HotelRoomView> views;

    private HotelRoom() {
    }

    private HotelRoom(String code, List<String> codes, String opCode, String bookingCode, String key, String name, List<HotelRoomAttribute> attributes, List<HotelRoomView> views) {
        this.code = code;
        this.codes = codes;
        this.opCode = opCode;
        this.bookingCode = bookingCode;
        this.key = key;
        this.name = name;
        this.attributes = attributes;
        this.views = views;
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

    public List<String> getCodes() {
        return codes;
    }

    public void setCodes(List<String> codes) {
        this.codes = codes;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HotelRoomAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<HotelRoomAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<HotelRoomView> getViews() {
        return views;
    }

    public void setViews(List<HotelRoomView> views) {
        this.views = views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelRoom hotelRoom = (HotelRoom) o;

        if (code != null ? !code.equals(hotelRoom.code) : hotelRoom.code != null) return false;
        if (codes != null ? !codes.equals(hotelRoom.codes) : hotelRoom.codes != null) return false;
        if (opCode != null ? !opCode.equals(hotelRoom.opCode) : hotelRoom.opCode != null) return false;
        if (bookingCode != null ? !bookingCode.equals(hotelRoom.bookingCode) : hotelRoom.bookingCode != null)
            return false;
        if (key != null ? !key.equals(hotelRoom.key) : hotelRoom.key != null) return false;
        if (name != null ? !name.equals(hotelRoom.name) : hotelRoom.name != null) return false;
        if (attributes != null ? !attributes.equals(hotelRoom.attributes) : hotelRoom.attributes != null) return false;
        return views != null ? views.equals(hotelRoom.views) : hotelRoom.views == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (codes != null ? codes.hashCode() : 0);
        result = 31 * result + (opCode != null ? opCode.hashCode() : 0);
        result = 31 * result + (bookingCode != null ? bookingCode.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        result = 31 * result + (views != null ? views.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "code='" + code + '\'' +
                ", codes=" + codes +
                ", opCode='" + opCode + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", attributes=" + attributes +
                ", views=" + views +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_HOTEL_ROOM extends HotelRoom> {

        protected String code;
        protected List<String> codes;
        protected String opCode;
        protected String bookingCode;
        protected String key;
        protected String name;
        protected List<HotelRoomAttribute> attributes;
        protected List<HotelRoomView> views;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER code(String code) {
            this.code = code;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER codes(Collection<String> codes) {
            this.codes = codes != null
                    ? new ArrayList<>(codes) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER opCode(String opCode) {
            this.opCode = opCode;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER bookingCode(String bookingCode) {
            this.bookingCode = bookingCode;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER key(String key) {
            this.key = key;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER name(String name) {
            this.name = name;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER attributes(Collection<? extends HotelRoomAttribute> attributes) {
            this.attributes = attributes != null
                    ? new ArrayList<>(attributes) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER views(Collection<? extends HotelRoomView> views) {
            this.views = views != null
                    ? new ArrayList<>(views) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_HOTEL_ROOM build() {
            return (T_HOTEL_ROOM) new HotelRoom(code, codes, opCode, bookingCode, key, name, attributes, views);
        }
    }
}
