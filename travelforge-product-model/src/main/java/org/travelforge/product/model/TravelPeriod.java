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

/**
 * @author Matthias Deck
 */
public class TravelPeriod implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDate departureDate;
    private LocalDate returnDate;
    private Integer duration;

    public TravelPeriod() {
    }

    public TravelPeriod(LocalDate departureDate, LocalDate returnDate, Integer duration) {
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.duration = duration;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelPeriod that = (TravelPeriod) o;

        if (departureDate != null ? !departureDate.equals(that.departureDate) : that.departureDate != null)
            return false;
        if (returnDate != null ? !returnDate.equals(that.returnDate) : that.returnDate != null) return false;
        return duration != null ? duration.equals(that.duration) : that.duration == null;
    }

    @Override
    public int hashCode() {
        int result = departureDate != null ? departureDate.hashCode() : 0;
        result = 31 * result + (returnDate != null ? returnDate.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TravelPeriod{" +
                "departureDate=" + departureDate +
                ", returnDate=" + returnDate +
                ", duration=" + duration +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_TRAVEL_PERIOD extends TravelPeriod> {

        protected LocalDate departureDate;
        protected LocalDate returnDate;
        protected Integer duration;

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
        public T_TRAVEL_PERIOD build() {
            return (T_TRAVEL_PERIOD) new TravelPeriod(departureDate, returnDate, duration);
        }
    }
}
