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

package org.travelforge.product.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthias Deck
 */
public interface FlightProperties extends Serializable {

    List<String> getFlightProviders();

    void setFlightProviders(List<String> flightProviders);

    List<String> getFlightDepartureAirportCodes();

    void setFlightDepartureAirportCodes(List<String> flightDepartureAirportCodes);

    List<String> getFlightArrivalAirportCodes();

    void setFlightArrivalAirportCodes(List<String> flightArrivalAirportCodes);

    List<String> getFlightAirlineCodes();

    void setFlightAirlineCodes(List<String> flightAirlineCodes);

    Integer getFlightStopOverMax();

    void setFlightStopOverMax(Integer flightStopOverMax);

    String getFlightClass();

    void setFlightClass(String flightClass);

    List<String> getFlightBookingClasses();

    void setFlightBookingClasses(List<String> flightBookingClasses);

    Integer getFlightDistanceMin();

    void setFlightDistanceMin(Integer flightDistanceMin);

    Integer getFlightDistanceMax();

    void setFlightDistanceMax(Integer flightDistanceMax);

    Integer getFlightDurationMin();

    void setFlightDurationMin(Integer flightDurationMin);

    Integer getFlightDurationMax();

    void setFlightDurationMax(Integer flightDurationMax);

    List<String> getFlightOutboundFlightIds();

    void setFlightOutboundFlightIds(List<String> flightOutboundFlightIds);

    List<String> getFlightInboundFlightIds();

    void setFlightInboundFlightIds(List<String> flightInboundFlightIds);

    List<String> getFlightOutboundFlightCodes();

    void setFlightOutboundFlightCodes(List<String> flightOutboundFlightCodes);

    List<String> getFlightInboundFlightCodes();

    void setFlightInboundFlightCodes(List<String> flightInboundFlightCodes);

    static void merge(FlightProperties target, FlightProperties... sources) {

        for (FlightProperties source : sources) {

            // FLIGHT_PROVIDERS
            if (source.getFlightProviders() != null) {
                target.setFlightProviders(new ArrayList<>(source.getFlightProviders()));
            }

            // FLIGHT_DEPARTURE_AIRPORT_CODES
            if (source.getFlightDepartureAirportCodes() != null) {
                target.setFlightDepartureAirportCodes(new ArrayList<>(source.getFlightDepartureAirportCodes()));
            }

            // FLIGHT_ARRIVAL_AIRPORT_CODES
            if (source.getFlightArrivalAirportCodes() != null) {
                target.setFlightArrivalAirportCodes(new ArrayList<>(source.getFlightArrivalAirportCodes()));
            }

            // FLIGHT_AIRLINE_CODES
            if (source.getFlightAirlineCodes() != null) {
                target.setFlightAirlineCodes(new ArrayList<>(source.getFlightAirlineCodes()));
            }

            // FLIGHT_STOP_OVER_MAX
            target.setFlightStopOverMax(source.getFlightStopOverMax());

            // FLIGHT_CLASS
            target.setFlightClass(source.getFlightClass());

            // FLIGHT_BOOKING_CLASSES
            if (source.getFlightBookingClasses() != null) {
                target.setFlightBookingClasses(new ArrayList<>(source.getFlightBookingClasses()));
            }

            // FLIGHT_DISTANCE_MIN
            target.setFlightDistanceMin(source.getFlightDistanceMin());

            // FLIGHT_DISTANCE_MAX
            target.setFlightDistanceMax(source.getFlightDistanceMax());

            // FLIGHT_DURATION_MIN
            target.setFlightDurationMin(source.getFlightDurationMin());

            // FLIGHT_DURATION_MAX
            target.setFlightDurationMax(source.getFlightDurationMax());

            // FLIGHT_OUTBOUND_FLIGHT_IDS
            if (source.getFlightOutboundFlightIds() != null) {
                target.setFlightOutboundFlightIds(new ArrayList<>(source.getFlightOutboundFlightIds()));
            }

            // FLIGHT_INBOUND_FLIGHT_IDS
            if (source.getFlightInboundFlightIds() != null) {
                target.setFlightInboundFlightIds(new ArrayList<>(source.getFlightInboundFlightIds()));
            }

            // FLIGHT_OUTBOUND_FLIGHT_CODES
            if (source.getFlightOutboundFlightCodes() != null) {
                target.setFlightOutboundFlightCodes(new ArrayList<>(source.getFlightOutboundFlightCodes()));
            }

            // FLIGHT_INBOUND_FLIGHT_CODES
            if (source.getFlightInboundFlightCodes() != null) {
                target.setFlightInboundFlightCodes(new ArrayList<>(source.getFlightInboundFlightCodes()));
            }
        }
    }
}
