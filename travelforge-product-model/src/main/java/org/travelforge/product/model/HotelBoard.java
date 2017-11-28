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
public class HotelBoard implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private List<String> codes;
    private String opCode;
    private String key;
    private String name;

    public HotelBoard() {
    }

    public HotelBoard(String code, List<String> codes, String opCode, String key, String name) {
        this.code = code;
        this.codes = codes;
        this.opCode = opCode;
        this.key = key;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelBoard that = (HotelBoard) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (codes != null ? !codes.equals(that.codes) : that.codes != null) return false;
        if (opCode != null ? !opCode.equals(that.opCode) : that.opCode != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (codes != null ? codes.hashCode() : 0);
        result = 31 * result + (opCode != null ? opCode.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelBoard{" +
                "code='" + code + '\'' +
                ", codes=" + codes +
                ", opCode='" + opCode + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_HOTEL_BOARD extends HotelBoard> {

        protected String code;
        protected List<String> codes;
        protected String opCode;
        protected String key;
        protected String name;

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
        public T_HOTEL_BOARD build() {
            return (T_HOTEL_BOARD) new HotelBoard(code, codes, opCode, key, name);
        }
    }
}
