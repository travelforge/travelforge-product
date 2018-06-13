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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Matthias Deck
 */
public final class Travellers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer adults;
    private List<Integer> childrenAge;
    private List<LocalDate> childrenDateOfBirth;

    public Travellers() {
    }

    public Travellers(Integer adults, List<Integer> childrenAge, List<LocalDate> childrenDateOfBirth) {
        this.adults = adults;
        this.childrenAge = childrenAge;
        this.childrenDateOfBirth = childrenDateOfBirth;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public List<Integer> getChildrenAge() {
        return childrenAge;
    }

    public void setChildrenAge(List<Integer> childrenAge) {
        this.childrenAge = childrenAge;
    }

    public List<LocalDate> getChildrenDateOfBirth() {
        return childrenDateOfBirth;
    }

    public void setChildrenDateOfBirth(List<LocalDate> childrenDateOfBirth) {
        this.childrenDateOfBirth = childrenDateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Travellers that = (Travellers) o;

        if (adults != null ? !adults.equals(that.adults) : that.adults != null) return false;
        if (childrenAge != null ? !childrenAge.equals(that.childrenAge) : that.childrenAge != null) return false;
        return childrenDateOfBirth != null ? childrenDateOfBirth.equals(that.childrenDateOfBirth) : that.childrenDateOfBirth == null;
    }

    @Override
    public int hashCode() {
        int result = adults != null ? adults.hashCode() : 0;
        result = 31 * result + (childrenAge != null ? childrenAge.hashCode() : 0);
        result = 31 * result + (childrenDateOfBirth != null ? childrenDateOfBirth.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Travellers{" +
                "adults=" + adults +
                ", childrenAge=" + childrenAge +
                ", childrenDateOfBirth=" + childrenDateOfBirth +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_TRAVELERS extends Travellers> {

        protected Integer adults;
        protected List<Integer> childrenAge;
        protected List<LocalDate> childrenDateOfBirth;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER adults(Integer adults) {
            this.adults = adults;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER childrenAge(Collection<? extends Integer> childrenAge) {
            this.childrenAge = childrenAge != null
                    ? new ArrayList<>(childrenAge) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER childrenDateOfBirth(Collection<? extends LocalDate> childrenDateOfBirth) {
            this.childrenDateOfBirth = childrenDateOfBirth != null
                    ? new ArrayList<>(childrenDateOfBirth) : null;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_TRAVELERS build() {
            return (T_TRAVELERS) new Travellers(adults, childrenAge, childrenDateOfBirth);
        }
    }
}
