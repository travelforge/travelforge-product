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

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Matthias Deck
 */
public class OutboundFlight extends BoundedFlight {

    private static final long serialVersionUID = 2L;

    public OutboundFlight() {
    }

    public OutboundFlight(String provider, Airline airline, String flightNumber, String flightClass, String flightId, String flightCode, String flightKey, String flightLabel, String bookingClass, String bookingCode, Airport departureAirport, LocalDateTime departureDateTime, Airport arrivalAirport, LocalDateTime arrivalDateTime, Integer stopOver, Integer offset, Integer duration, List<FlightSegment> segments) {
        super(provider, airline, flightNumber, flightClass, flightId, flightCode, flightKey, flightLabel, bookingClass, bookingCode, departureAirport, departureDateTime, arrivalAirport, arrivalDateTime, stopOver, offset, duration, segments);
    }

    public OutboundFlight(String provider, Airline airline, String flightNumber, String flightClass, String flightId, String flightCode, String flightKey, String bookingClass, String bookingCode, Airport departureAirport, LocalDateTime departureDateTime, Airport arrivalAirport, LocalDateTime arrivalDateTime, Integer stopOver, Integer duration, List<FlightSegment> segments) {
        super(provider, airline, flightNumber, flightClass, flightId, flightCode, flightKey, bookingClass, bookingCode, departureAirport, departureDateTime, arrivalAirport, arrivalDateTime, stopOver, duration, segments);
    }

    public OutboundFlight(String provider, Airline airline, String flightNumber, String flightClass, String flightId, String flightCode, String flightKey, String bookingClass, String bookingCode, Airport departureAirport, LocalDateTime departureDateTime, Airport arrivalAirport, LocalDateTime arrivalDateTime, Integer stopOver, Integer offset, Integer duration, List<FlightSegment> segments) {
        super(provider, airline, flightNumber, flightClass, flightId, flightCode, flightKey, bookingClass, bookingCode, departureAirport, departureDateTime, arrivalAirport, arrivalDateTime, stopOver, offset, duration, segments);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends BoundedFlight.Builder<Builder, OutboundFlight> {

        protected Builder() {
            super();
        }

        @Override
        public OutboundFlight build() {
            return new OutboundFlight(provider, airline, flightNumber, flightClass, flightId, flightCode, flightKey, flightLabel, bookingClass, bookingCode, departureAirport, departureDateTime, arrivalAirport, arrivalDateTime, stopOver, offset, duration, segments);
        }
    }
}
