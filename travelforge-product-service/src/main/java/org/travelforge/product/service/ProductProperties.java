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

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthias Deck
 */
public interface ProductProperties {

    List<Integer> getProductGroups();

    void setProductGroups(List<Integer> productGroups);

    List<String> getTourOperatorCodes();

    void setTourOperatorCodes(List<String> tourOperatorCodes);

    Integer getTravellersAdults();

    void setTravellersAdults(Integer travellersAdults);

    List<Integer> getTravellersChildrenAge();

    void setTravellersChildrenAge(List<Integer> travellersChildrenAge);

    List<LocalDate> getTravellersChildrenDateOfBirth();

    void setTravellersChildrenDateOfBirth(List<LocalDate> travellersChildrenDateOfBirth);

    LocalDate getTravelPeriodDepartureDate();

    void setTravelPeriodDepartureDate(LocalDate travelPeriodDepartureDate);

    Integer getTravelPeriodDepartureDateOffset();

    void setTravelPeriodDepartureDateOffset(Integer travelPeriodDepartureDateOffset);

    Integer getTravelPeriodDepartureDatePreOffset();

    void setTravelPeriodDepartureDatePreOffset(Integer travelPeriodDepartureDatePreOffset);

    Integer getTravelPeriodDepartureDatePostOffset();

    void setTravelPeriodDepartureDatePostOffset(Integer travelPeriodDepartureDatePostOffset);

    List<DayOfWeek> getTravelPeriodDepartureDays();

    void setTravelPeriodDepartureDays(List<DayOfWeek> travelPeriodDepartureDays);

    LocalTime getTravelPeriodDepartureTimeMin();

    void setTravelPeriodDepartureTimeMin(LocalTime travelPeriodDepartureTimeMin);

    LocalTime getTravelPeriodDepartureTimeMax();

    void setTravelPeriodDepartureTimeMax(LocalTime travelPeriodDepartureTimeMax);

    LocalDate getTravelPeriodReturnDate();

    void setTravelPeriodReturnDate(LocalDate travelPeriodReturnDate);

    Integer getTravelPeriodReturnDateOffset();

    void setTravelPeriodReturnDateOffset(Integer travelPeriodReturnDateOffset);

    Integer getTravelPeriodReturnDatePreOffset();

    void setTravelPeriodReturnDatePreOffset(Integer travelPeriodReturnDatePreOffset);

    Integer getTravelPeriodReturnDatePostOffset();

    void setTravelPeriodReturnDatePostOffset(Integer travelPeriodReturnDatePostOffset);

    List<DayOfWeek> getTravelPeriodReturnDays();

    void setTravelPeriodReturnDays(List<DayOfWeek> travelPeriodReturnDays);

    LocalTime getTravelPeriodReturnTimeMin();

    void setTravelPeriodReturnTimeMin(LocalTime travelPeriodReturnTimeMin);

    LocalTime getTravelPeriodReturnTimeMax();

    void setTravelPeriodReturnTimeMax(LocalTime travelPeriodReturnTimeMax);

    List<Integer> getTravelPeriodDurations();

    void setTravelPeriodDurations(List<Integer> travelPeriodDurations);

    List<String> getExtras();

    void setExtras(List<String> extras);

    Float getPriceMin();

    void setPriceMin(Float priceMin);

    Float getPriceMax();

    void setPriceMax(Float priceMax);

    static void merge(ProductProperties target, ProductProperties... sources) {

        for (ProductProperties source : sources) {

            // PRODUCT_GROUPS
            if (source.getProductGroups() != null) {
                target.setProductGroups(new ArrayList<>(source.getProductGroups()));
            }

            // TOUR_OPERATOR_CODES
            if (source.getTourOperatorCodes() != null) {
                target.setTourOperatorCodes(new ArrayList<>(source.getTourOperatorCodes()));
            }

            // TRAVELLERS_ADULTS
            if (source.getTravellersAdults() != null) {
                target.setTravellersAdults(source.getTravellersAdults());
            }
            // TRAVELLERS_CHILDREN_AGE
            if (source.getTravellersChildrenAge() != null) {
                target.setTravellersChildrenAge(new ArrayList<>(source.getTravellersChildrenAge()));
            }
            // TRAVELLERS_CHILDREN_DATE_OF_BIRTH
            if (source.getTravellersChildrenDateOfBirth() != null) {
                target.setTravellersChildrenDateOfBirth(new ArrayList<>(source.getTravellersChildrenDateOfBirth()));
            }

            // TRAVEL_PERIOD_DEPARTURE_DATE
            if (source.getTravelPeriodDepartureDate() != null) {
                target.setTravelPeriodDepartureDate(source.getTravelPeriodDepartureDate());
            }
            // TRAVEL_PERIOD_DEPARTURE_DATE_OFFSET
            if (source.getTravelPeriodDepartureDateOffset() != null) {
                target.setTravelPeriodDepartureDateOffset(source.getTravelPeriodDepartureDateOffset());
            }
            // TRAVEL_PERIOD_DEPARTURE_DATE_PRE_OFFSET
            if (source.getTravelPeriodDepartureDatePreOffset() != null) {
                target.setTravelPeriodDepartureDatePreOffset(source.getTravelPeriodDepartureDatePreOffset());
            }
            // TRAVEL_PERIOD_DEPARTURE_DATE_POST_OFFSET
            if (source.getTravelPeriodDepartureDatePostOffset() != null) {
                target.setTravelPeriodDepartureDatePostOffset(source.getTravelPeriodDepartureDatePostOffset());
            }
            // TRAVEL_PERIOD_DEPARTURE_DAYS
            if (source.getTravelPeriodDepartureDays() != null) {
                target.setTravelPeriodDepartureDays(new ArrayList<>(source.getTravelPeriodDepartureDays()));
            }
            // TRAVEL_PERIOD_DEPARTURE_TIME_MIN
            if (source.getTravelPeriodDepartureTimeMin() != null) {
                target.setTravelPeriodDepartureTimeMin(source.getTravelPeriodDepartureTimeMin());
            }
            // TRAVEL_PERIOD_DEPARTURE_TIME_MAX
            if (source.getTravelPeriodDepartureTimeMax() != null) {
                target.setTravelPeriodDepartureTimeMax(source.getTravelPeriodDepartureTimeMax());
            }
            // TRAVEL_PERIOD_RETURN_DATE
            if (source.getTravelPeriodReturnDate() != null) {
                target.setTravelPeriodReturnDate(source.getTravelPeriodReturnDate());
            }
            // TRAVEL_PERIOD_RETURN_DATE_OFFSET
            if (source.getTravelPeriodReturnDateOffset() != null) {
                target.setTravelPeriodReturnDateOffset(source.getTravelPeriodReturnDateOffset());
            }
            // TRAVEL_PERIOD_RETURN_DATE_PRE_OFFSET
            if (source.getTravelPeriodReturnDatePreOffset() != null) {
                target.setTravelPeriodReturnDatePreOffset(source.getTravelPeriodReturnDatePreOffset());
            }
            // TRAVEL_PERIOD_RETURN_DATE_POST_OFFSET
            if (source.getTravelPeriodReturnDatePostOffset() != null) {
                target.setTravelPeriodReturnDatePostOffset(source.getTravelPeriodReturnDatePostOffset());
            }
            // TRAVEL_PERIOD_RETURN_DAYS
            if (source.getTravelPeriodReturnDays() != null) {
                target.setTravelPeriodReturnDays(new ArrayList<>(source.getTravelPeriodReturnDays()));
            }
            // TRAVEL_PERIOD_RETURN_TIME_MIN
            if (source.getTravelPeriodReturnTimeMin() != null) {
                target.setTravelPeriodReturnTimeMin(source.getTravelPeriodReturnTimeMin());
            }
            // TRAVEL_PERIOD_RETURN_TIME_MAX
            if (source.getTravelPeriodReturnTimeMax() != null) {
                target.setTravelPeriodReturnTimeMax(source.getTravelPeriodReturnTimeMax());
            }
            // TRAVEL_PERIOD_DURATIONS
            if (source.getTravelPeriodDurations() != null) {
                target.setTravelPeriodDurations(new ArrayList<>(source.getTravelPeriodDurations()));
            }

            // EXTRAS
            if (source.getExtras() != null) {
                target.setExtras(new ArrayList<>(source.getExtras()));
            }

            // PRICE_MIN
            if (source.getPriceMin() != null) {
                target.setPriceMin(source.getPriceMin());
            }
            // PRICE_MAX
            if (source.getPriceMax() != null) {
                target.setPriceMax(source.getPriceMax());
            }
        }
    }
}
