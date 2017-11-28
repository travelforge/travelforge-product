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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Matthias Deck
 */
public abstract class BoundedFlight implements Serializable {

    private static final long serialVersionUID = 1L;

    private String provider;
    private Airline airline;
    private String flightNumber;
    private String flightClass;
    private String flightId;
    private String flightCode;
    private String flightKey;
    private String bookingClass;
    private String bookingCode;
    private Airport departureAirport;
    private LocalDateTime departureDateTime;
    private Airport arrivalAirport;
    private LocalDateTime arrivalDateTime;
    private Integer stopOver;
    private Integer duration;
    private List<FlightSegment> segments;

    public BoundedFlight() {
    }

    public BoundedFlight(String provider, Airline airline, String flightNumber, String flightClass, String flightId, String flightCode, String flightKey, String bookingClass, String bookingCode, Airport departureAirport, LocalDateTime departureDateTime, Airport arrivalAirport, LocalDateTime arrivalDateTime, Integer stopOver, Integer duration, List<FlightSegment> segments) {

        this.provider = provider;
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.flightClass = flightClass;
        this.flightId = flightId;
        this.flightCode = flightCode;
        this.flightKey = flightKey;
        this.bookingClass = bookingClass;
        this.bookingCode = bookingCode;
        this.departureAirport = departureAirport;
        this.departureDateTime = departureDateTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalDateTime = arrivalDateTime;
        this.stopOver = stopOver;
        this.duration = duration;
        this.segments = segments;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getFlightKey() {
        return flightKey;
    }

    public void setFlightKey(String flightKey) {
        this.flightKey = flightKey;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Integer getStopOver() {
        return stopOver;
    }

    public void setStopOver(Integer stopOver) {
        this.stopOver = stopOver;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<FlightSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<FlightSegment> segments) {
        this.segments = segments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoundedFlight that = (BoundedFlight) o;

        if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;
        if (airline != null ? !airline.equals(that.airline) : that.airline != null) return false;
        if (flightNumber != null ? !flightNumber.equals(that.flightNumber) : that.flightNumber != null) return false;
        if (flightClass != null ? !flightClass.equals(that.flightClass) : that.flightClass != null) return false;
        if (flightId != null ? !flightId.equals(that.flightId) : that.flightId != null) return false;
        if (flightCode != null ? !flightCode.equals(that.flightCode) : that.flightCode != null) return false;
        if (flightKey != null ? !flightKey.equals(that.flightKey) : that.flightKey != null) return false;
        if (bookingClass != null ? !bookingClass.equals(that.bookingClass) : that.bookingClass != null) return false;
        if (bookingCode != null ? !bookingCode.equals(that.bookingCode) : that.bookingCode != null) return false;
        if (departureAirport != null ? !departureAirport.equals(that.departureAirport) : that.departureAirport != null)
            return false;
        if (departureDateTime != null ? !departureDateTime.equals(that.departureDateTime) : that.departureDateTime != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(that.arrivalAirport) : that.arrivalAirport != null)
            return false;
        if (arrivalDateTime != null ? !arrivalDateTime.equals(that.arrivalDateTime) : that.arrivalDateTime != null)
            return false;
        if (stopOver != null ? !stopOver.equals(that.stopOver) : that.stopOver != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        return segments != null ? segments.equals(that.segments) : that.segments == null;
    }

    @Override
    public int hashCode() {
        int result = provider != null ? provider.hashCode() : 0;
        result = 31 * result + (airline != null ? airline.hashCode() : 0);
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        result = 31 * result + (flightClass != null ? flightClass.hashCode() : 0);
        result = 31 * result + (flightId != null ? flightId.hashCode() : 0);
        result = 31 * result + (flightCode != null ? flightCode.hashCode() : 0);
        result = 31 * result + (flightKey != null ? flightKey.hashCode() : 0);
        result = 31 * result + (bookingClass != null ? bookingClass.hashCode() : 0);
        result = 31 * result + (bookingCode != null ? bookingCode.hashCode() : 0);
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        result = 31 * result + (departureDateTime != null ? departureDateTime.hashCode() : 0);
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (arrivalDateTime != null ? arrivalDateTime.hashCode() : 0);
        result = 31 * result + (stopOver != null ? stopOver.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (segments != null ? segments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "provider='" + provider + '\'' +
                ", airline=" + airline +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightClass='" + flightClass + '\'' +
                ", flightId='" + flightId + '\'' +
                ", flightCode='" + flightCode + '\'' +
                ", flightKey='" + flightKey + '\'' +
                ", bookingClass='" + bookingClass + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", departureAirport=" + departureAirport +
                ", departureDateTime=" + departureDateTime +
                ", arrivalAirport=" + arrivalAirport +
                ", arrivalDateTime=" + arrivalDateTime +
                ", stopOver=" + stopOver +
                ", duration=" + duration +
                ", segments=" + segments +
                '}';
    }

    public abstract static class Builder<T_BUILDER extends Builder, T_BOUNDED_FLIGHT extends BoundedFlight> {

        protected String provider;
        protected Airline airline;
        protected String flightNumber;
        protected String flightClass;
        protected String flightId;
        protected String flightCode;
        protected String flightKey;
        protected String bookingClass;
        protected String bookingCode;
        protected Airport departureAirport;
        protected LocalDateTime departureDateTime;
        protected Airport arrivalAirport;
        protected LocalDateTime arrivalDateTime;
        protected Integer stopOver;
        protected Integer duration;
        protected List<FlightSegment> segments;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER provider(String provider) {
            this.provider = provider;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER airline(Airline airline) {
            this.airline = airline;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER flightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER flightClass(String flightClass) {
            this.flightClass = flightClass;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER flightId(String flightId) {
            this.flightId = flightId;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER flightCode(String flightCode) {
            this.flightCode = flightCode;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER flightKey(String flightKey) {
            this.flightKey = flightKey;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER bookingClass(String bookingClass) {
            this.bookingClass = bookingClass;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER bookingCode(String bookingCode) {
            this.bookingCode = bookingCode;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER departureAirport(Airport departureAirport) {
            this.departureAirport = departureAirport;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER departureDateTime(LocalDateTime departureDateTime) {
            this.departureDateTime = departureDateTime;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER arrivalAirport(Airport arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER arrivalDateTime(LocalDateTime arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER stopOver(Integer stopOver) {
            this.stopOver = stopOver;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER duration(Integer duration) {
            this.duration = duration;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER segments(Collection<? extends FlightSegment> segments) {
            this.segments = segments != null
                    ? new ArrayList<>(segments) : null;
            return (T_BUILDER) this;
        }

        public abstract T_BOUNDED_FLIGHT build();
    }
}
