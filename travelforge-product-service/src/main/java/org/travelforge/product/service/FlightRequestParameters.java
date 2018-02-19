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
public interface FlightRequestParameters extends Serializable {

    List<String> getFlightDepartureAirportCodes();

    void setFlightDepartureAirportCodes(List<String> flightDepartureAirportCodes);

    List<String> getFlightArrivalAirportCodes();

    void setFlightArrivalAirportCodes(List<String> flightArrivalAirportCodes);

    List<String> getFlightAirlineCodes();

    void setFlightAirlineCodes(List<String> flightAirlineCodes);

    Integer getFlightStopOverMax();

    void setFlightStopOverMax(Integer flightStopOverMax);

    static void merge(FlightRequestParameters target, FlightRequestParameters... sources) {

        for (FlightRequestParameters source : sources) {

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
            if (source.getFlightStopOverMax() != null) {
                target.setFlightStopOverMax(source.getFlightStopOverMax());
            }
        }
    }
}
