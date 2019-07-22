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
import java.util.Objects;

/**
 * @author Matthias Deck
 */
public class TravelPeriod implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDate departureDate;
    private LocalDate returnDate;
    private Integer duration;
    private LocalDate arrivalDate;

    public TravelPeriod() {
    }

    public TravelPeriod(LocalDate departureDate, LocalDate returnDate, Integer duration) {
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.duration = duration;
    }

    public TravelPeriod(LocalDate departureDate, LocalDate returnDate, Integer duration, LocalDate arrivalDate) {
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.duration = duration;
        this.arrivalDate = arrivalDate;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelPeriod that = (TravelPeriod) o;
        return Objects.equals(departureDate, that.departureDate) &&
                Objects.equals(returnDate, that.returnDate) &&
                Objects.equals(duration, that.duration) &&
                Objects.equals(arrivalDate, that.arrivalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureDate, returnDate, duration, arrivalDate);
    }

    @Override
    public String toString() {
        return "TravelPeriod{" +
                "departureDate=" + departureDate +
                ", returnDate=" + returnDate +
                ", duration=" + duration +
                ", arrivalDate=" + arrivalDate +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_TRAVEL_PERIOD extends TravelPeriod> {

        protected LocalDate departureDate;
        protected LocalDate returnDate;
        protected Integer duration;
        private LocalDate arrivalDate;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER departureDate(LocalDate departureDate) {
            this.departureDate = departureDate;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER returnDate(LocalDate returnDate) {
            this.returnDate = returnDate;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER duration(Integer duration) {
            this.duration = duration;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER arrivalDate(LocalDate arrivalDate) {
            this.arrivalDate = arrivalDate;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_TRAVEL_PERIOD build() {
            return (T_TRAVEL_PERIOD) new TravelPeriod(departureDate, returnDate, duration, arrivalDate);
        }
    }
}
