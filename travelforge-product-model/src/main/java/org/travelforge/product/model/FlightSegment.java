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

/**
 * @author Matthias Deck
 */
public class FlightSegment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Airline airline;
    private String flightNumber;
    private String flightClass;
    private String bookingClass;
    private Airport departureAirport;
    private LocalDateTime departureDateTime;
    private Airport arrivalAirport;
    private LocalDateTime arrivalDateTime;
    private Integer duration;

    public FlightSegment() {
    }

    public FlightSegment(Airline airline, String flightNumber, String flightClass, String bookingClass, Airport departureAirport, LocalDateTime departureDateTime, Airport arrivalAirport, LocalDateTime arrivalDateTime, Integer duration) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.flightClass = flightClass;
        this.bookingClass = bookingClass;
        this.departureAirport = departureAirport;
        this.departureDateTime = departureDateTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalDateTime = arrivalDateTime;
        this.duration = duration;
    }

    public static Builder builder() {
        return new Builder<>();
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

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
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

        FlightSegment that = (FlightSegment) o;

        if (airline != null ? !airline.equals(that.airline) : that.airline != null) return false;
        if (flightNumber != null ? !flightNumber.equals(that.flightNumber) : that.flightNumber != null) return false;
        if (flightClass != null ? !flightClass.equals(that.flightClass) : that.flightClass != null) return false;
        if (bookingClass != null ? !bookingClass.equals(that.bookingClass) : that.bookingClass != null) return false;
        if (departureAirport != null ? !departureAirport.equals(that.departureAirport) : that.departureAirport != null)
            return false;
        if (departureDateTime != null ? !departureDateTime.equals(that.departureDateTime) : that.departureDateTime != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(that.arrivalAirport) : that.arrivalAirport != null)
            return false;
        if (arrivalDateTime != null ? !arrivalDateTime.equals(that.arrivalDateTime) : that.arrivalDateTime != null)
            return false;
        return duration != null ? duration.equals(that.duration) : that.duration == null;
    }

    @Override
    public int hashCode() {
        int result = airline != null ? airline.hashCode() : 0;
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        result = 31 * result + (flightClass != null ? flightClass.hashCode() : 0);
        result = 31 * result + (bookingClass != null ? bookingClass.hashCode() : 0);
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        result = 31 * result + (departureDateTime != null ? departureDateTime.hashCode() : 0);
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (arrivalDateTime != null ? arrivalDateTime.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlightSegment{" +
                "airline=" + airline +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightClass='" + flightClass + '\'' +
                ", bookingClass='" + bookingClass + '\'' +
                ", departureAirport=" + departureAirport +
                ", departureDateTime=" + departureDateTime +
                ", arrivalAirport=" + arrivalAirport +
                ", arrivalDateTime=" + arrivalDateTime +
                ", duration=" + duration +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_FLIGHT_SEGMENT extends FlightSegment> {

        protected Airline airline;
        protected String flightNumber;
        protected String flightClass;
        protected String bookingClass;
        protected Airport departureAirport;
        protected LocalDateTime departureDateTime;
        protected Airport arrivalAirport;
        protected LocalDateTime arrivalDateTime;
        protected Integer duration;

        protected Builder() {
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
        public T_BUILDER bookingClass(String bookingClass) {
            this.bookingClass = bookingClass;
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
        public T_BUILDER duration(Integer duration) {
            this.duration = duration;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_FLIGHT_SEGMENT build() {
            return (T_FLIGHT_SEGMENT) new FlightSegment(airline, flightNumber, flightClass, bookingClass, departureAirport, departureDateTime, arrivalAirport, arrivalDateTime, duration);
        }
    }
}
