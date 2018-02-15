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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import static org.travelforge.product.service.PackageRequestParameterName.*;

/**
 * @author Matthias Deck
 */
@Deprecated
public class PackageRequestParameterMap extends PackageRequestParameters {

    private static final long serialVersionUID = 1L;

    protected final Map<PackageRequestParameterMapKey, Object> parameters = new TreeMap<>();

    public PackageRequestParameterMap() {
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Integer> getProductGroups() {
        return (List<Integer>) parameters.get(PRODUCT_GROUPS);
    }

    @Override
    public void setProductGroups(List<Integer> productGroups) {
        parameters.put(PRODUCT_GROUPS, productGroups);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getTourOperatorCodes() {
        return (List<String>) parameters.get(TOUR_OPERATOR_CODES);
    }

    @Override
    public void setTourOperatorCodes(List<String> tourOperatorCodes) {
        parameters.put(TOUR_OPERATOR_CODES, tourOperatorCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getTravellersAdults() {
        return (Integer) parameters.get(TRAVELLERS_ADULTS);
    }

    @Override
    public void setTravellersAdults(Integer travellersAdults) {
        parameters.put(TRAVELLERS_ADULTS, travellersAdults);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Integer> getTravellersChildrenAge() {
        return (List<Integer>) parameters.get(TRAVELLERS_CHILDREN_AGE);
    }

    @Override
    public void setTravellersChildrenAge(List<Integer> travellersChildrenAge) {
        parameters.put(TRAVELLERS_CHILDREN_AGE, travellersChildrenAge);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<LocalDate> getTravellersChildrenDateOfBirth() {
        return (List<LocalDate>) parameters.get(TRAVELLERS_CHILDREN_DATE_OF_BIRTH);
    }

    @Override
    public void setTravellersChildrenDateOfBirth(List<LocalDate> travellersChildrenDateOfBirth) {
        parameters.put(TRAVELLERS_CHILDREN_DATE_OF_BIRTH, travellersChildrenDateOfBirth);
    }

    @Override
    @SuppressWarnings("unchecked")
    public LocalDate getTravelPeriodDepartureDate() {
        return (LocalDate) parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE);
    }

    @Override
    public void setTravelPeriodDepartureDate(LocalDate travelPeriodDepartureDate) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DATE, travelPeriodDepartureDate);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodDepartureDateOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE_OFFSET);
    }

    @Override
    public void setTravelPeriodDepartureDateOffset(Integer travelPeriodDepartureDateOffset) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DATE_OFFSET, travelPeriodDepartureDateOffset);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodDepartureDatePreOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE_PRE_OFFSET);
    }

    @Override
    public void setTravelPeriodDepartureDatePreOffset(Integer travelPeriodDepartureDatePreOffset) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DATE_PRE_OFFSET, travelPeriodDepartureDatePreOffset);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodDepartureDatePostOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_DEPARTURE_DATE_POST_OFFSET);
    }

    @Override
    public void setTravelPeriodDepartureDatePostOffset(Integer travelPeriodDepartureDatePostOffset) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DATE_POST_OFFSET, travelPeriodDepartureDatePostOffset);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<DayOfWeek> getTravelPeriodDepartureDays() {
        return (List<DayOfWeek>) parameters.get(TRAVEL_PERIOD_DEPARTURE_DAYS);
    }

    @Override
    public void setTravelPeriodDepartureDays(List<DayOfWeek> travelPeriodDepartureDays) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_DAYS, travelPeriodDepartureDays);
    }

    @Override
    @SuppressWarnings("unchecked")
    public LocalTime getTravelPeriodDepartureTimeMin() {
        return (LocalTime) parameters.get(TRAVEL_PERIOD_DEPARTURE_TIME_MIN);
    }

    @Override
    public void setTravelPeriodDepartureTimeMin(LocalTime travelPeriodDepartureTimeMin) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_TIME_MIN, travelPeriodDepartureTimeMin);
    }

    @Override
    @SuppressWarnings("unchecked")
    public LocalTime getTravelPeriodDepartureTimeMax() {
        return (LocalTime) parameters.get(TRAVEL_PERIOD_DEPARTURE_TIME_MAX);
    }

    @Override
    public void setTravelPeriodDepartureTimeMax(LocalTime travelPeriodDepartureTimeMax) {
        parameters.put(TRAVEL_PERIOD_DEPARTURE_TIME_MAX, travelPeriodDepartureTimeMax);
    }

    @Override
    @SuppressWarnings("unchecked")
    public LocalDate getTravelPeriodReturnDate() {
        return (LocalDate) parameters.get(TRAVEL_PERIOD_RETURN_DATE);
    }

    @Override
    public void setTravelPeriodReturnDate(LocalDate travelPeriodReturnDate) {
        parameters.put(TRAVEL_PERIOD_RETURN_DATE, travelPeriodReturnDate);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodReturnDateOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_RETURN_DATE_OFFSET);
    }

    @Override
    public void setTravelPeriodReturnDateOffset(Integer travelPeriodReturnDateOffset) {
        parameters.put(TRAVEL_PERIOD_RETURN_DATE_OFFSET, travelPeriodReturnDateOffset);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodReturnDatePreOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_RETURN_DATE_PRE_OFFSET);
    }

    @Override
    public void setTravelPeriodReturnDatePreOffset(Integer travelPeriodReturnDatePreOffset) {
        parameters.put(TRAVEL_PERIOD_RETURN_DATE_PRE_OFFSET, travelPeriodReturnDatePreOffset);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getTravelPeriodReturnDatePostOffset() {
        return (Integer) parameters.get(TRAVEL_PERIOD_RETURN_DATE_POST_OFFSET);
    }

    @Override
    public void setTravelPeriodReturnDatePostOffset(Integer travelPeriodReturnDatePostOffset) {
        parameters.put(TRAVEL_PERIOD_RETURN_DATE_POST_OFFSET, travelPeriodReturnDatePostOffset);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<DayOfWeek> getTravelPeriodReturnDays() {
        return (List<DayOfWeek>) parameters.get(TRAVEL_PERIOD_RETURN_DAYS);
    }

    @Override
    public void setTravelPeriodReturnDays(List<DayOfWeek> travelPeriodReturnDays) {
        parameters.put(TRAVEL_PERIOD_RETURN_DAYS, travelPeriodReturnDays);
    }

    @Override
    @SuppressWarnings("unchecked")
    public LocalTime getTravelPeriodReturnTimeMin() {
        return (LocalTime) parameters.get(TRAVEL_PERIOD_RETURN_TIME_MIN);
    }

    @Override
    public void setTravelPeriodReturnTimeMin(LocalTime travelPeriodReturnTimeMin) {
        parameters.put(TRAVEL_PERIOD_RETURN_TIME_MIN, travelPeriodReturnTimeMin);
    }

    @Override
    @SuppressWarnings("unchecked")
    public LocalTime getTravelPeriodReturnTimeMax() {
        return (LocalTime) parameters.get(TRAVEL_PERIOD_RETURN_TIME_MAX);
    }

    @Override
    public void setTravelPeriodReturnTimeMax(LocalTime travelPeriodReturnTimeMax) {
        parameters.put(TRAVEL_PERIOD_RETURN_TIME_MAX, travelPeriodReturnTimeMax);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Integer> getTravelPeriodDurations() {
        return (List<Integer>) parameters.get(TRAVEL_PERIOD_DURATIONS);
    }

    @Override
    public void setTravelPeriodDurations(List<Integer> travelPeriodDurations) {
        parameters.put(TRAVEL_PERIOD_DURATIONS, travelPeriodDurations);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getFlightDepartureAirportCodes() {
        return (List<String>) parameters.get(FLIGHT_DEPARTURE_AIRPORT_CODES);
    }

    @Override
    public void setFlightDepartureAirportCodes(List<String> flightDepartureAirportCodes) {
        parameters.put(FLIGHT_DEPARTURE_AIRPORT_CODES, flightDepartureAirportCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getFlightArrivalAirportCodes() {
        return (List<String>) parameters.get(FLIGHT_ARRIVAL_AIRPORT_CODES);
    }

    @Override
    public void setFlightArrivalAirportCodes(List<String> flightArrivalAirportCodes) {
        parameters.put(FLIGHT_ARRIVAL_AIRPORT_CODES, flightArrivalAirportCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getFlightAirlineCodes() {
        return (List<String>) parameters.get(FLIGHT_AIRLINE_CODES);
    }

    @Override
    public void setFlightAirlineCodes(List<String> flightAirlineCodes) {
        parameters.put(FLIGHT_AIRLINE_CODES, flightAirlineCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getFlightStopOverMax() {
        return (Integer) parameters.get(FLIGHT_STOP_OVER_MAX);
    }

    @Override
    public void setFlightStopOverMax(Integer flightStopOverMax) {
        parameters.put(FLIGHT_STOP_OVER_MAX, flightStopOverMax);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Integer> getHotelCodes() {
        return (List<Integer>) parameters.get(HOTEL_CODES);
    }

    @Override
    public void setHotelCodes(List<Integer> hotelCodes) {
        parameters.put(HOTEL_CODES, hotelCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getHotelProductCodes() {
        return (List<String>) parameters.get(HOTEL_PRODUCT_CODES);
    }

    @Override
    public void setHotelProductCodes(List<String> hotelProductCodes) {
        parameters.put(HOTEL_PRODUCT_CODES, hotelProductCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelCategory() {
        return (Float) parameters.get(HOTEL_CATEGORY);
    }

    @Override
    public void setHotelCategory(Float hotelCategory) {
        parameters.put(HOTEL_CATEGORY, hotelCategory);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getHotelLocationCountryCodes() {
        return (List<String>) parameters.get(HOTEL_LOCATION_COUNTRY_CODES);
    }

    @Override
    public void setHotelLocationCountryCodes(List<String> hotelLocationCountryCodes) {
        parameters.put(HOTEL_LOCATION_COUNTRY_CODES, hotelLocationCountryCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Integer> getHotelLocationRegionCodes() {
        return (List<Integer>) parameters.get(HOTEL_LOCATION_REGION_CODES);
    }

    @Override
    public void setHotelLocationRegionCodes(List<Integer> hotelLocationRegionCodes) {
        parameters.put(HOTEL_LOCATION_REGION_CODES, hotelLocationRegionCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Integer> getHotelLocationCityCodes() {
        return (List<Integer>) parameters.get(HOTEL_LOCATION_CITY_CODES);
    }

    @Override
    public void setHotelLocationCityCodes(List<Integer> hotelLocationCityCodes) {
        parameters.put(HOTEL_LOCATION_CITY_CODES, hotelLocationCityCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getHotelAttributes() {
        return (List<String>) parameters.get(HOTEL_ATTRIBUTES);
    }

    @Override
    public void setHotelAttributes(List<String> hotelAttributes) {
        parameters.put(HOTEL_ATTRIBUTES, hotelAttributes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer getHotelRatingCount() {
        return (Integer) parameters.get(HOTEL_RATING_COUNT);
    }

    @Override
    public void setHotelRatingCount(Integer hotelRatingCount) {
        parameters.put(HOTEL_RATING_COUNT, hotelRatingCount);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRatingOverAll() {
        return (Float) parameters.get(HOTEL_RATING_OVERALL);
    }

    @Override
    public void setHotelRatingOverAll(Float hotelRatingOverAll) {
        parameters.put(HOTEL_RATING_OVERALL, hotelRatingOverAll);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRatingTotal() {
        return (Float) parameters.get(HOTEL_RATING_TOTAL);
    }

    @Override
    public void setHotelRatingTotal(Float hotelRatingTotal) {
        parameters.put(HOTEL_RATING_TOTAL, hotelRatingTotal);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRatingHotel() {
        return (Float) parameters.get(HOTEL_RATING_HOTEL);
    }

    @Override
    public void setHotelRatingHotel(Float hotelRatingHotel) {
        parameters.put(HOTEL_RATING_HOTEL, hotelRatingHotel);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRatingLocation() {
        return (Float) parameters.get(HOTEL_RATING_LOCATION);
    }

    @Override
    public void setHotelRatingLocation(Float hotelRatingLocation) {
        parameters.put(HOTEL_RATING_LOCATION, hotelRatingLocation);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRatingService() {
        return (Float) parameters.get(HOTEL_RATING_SERVICE);
    }

    @Override
    public void setHotelRatingService(Float hotelRatingService) {
        parameters.put(HOTEL_RATING_SERVICE, hotelRatingService);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRatingCatering() {
        return (Float) parameters.get(HOTEL_RATING_CATERING);
    }

    @Override
    public void setHotelRatingCatering(Float hotelRatingCatering) {
        parameters.put(HOTEL_RATING_CATERING, hotelRatingCatering);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRatingSport() {
        return (Float) parameters.get(HOTEL_RATING_SPORT);
    }

    @Override
    public void setHotelRatingSport(Float hotelRatingSport) {
        parameters.put(HOTEL_RATING_SPORT, hotelRatingSport);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRatingRoom() {
        return (Float) parameters.get(HOTEL_RATING_ROOM);
    }

    @Override
    public void setHotelRatingRoom(Float hotelRatingRoom) {
        parameters.put(HOTEL_RATING_ROOM, hotelRatingRoom);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsTotal() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_TOTAL);
    }

    @Override
    public void setHotelRecommendationsTotal(Float hotelRecommendationsTotal) {
        parameters.put(HOTEL_RECOMMENDATIONS_TOTAL, hotelRecommendationsTotal);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsSingle() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_SINGLE);
    }

    @Override
    public void setHotelRecommendationsSingle(Float hotelRecommendationsSingle) {
        parameters.put(HOTEL_RECOMMENDATIONS_SINGLE, hotelRecommendationsSingle);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsFamily() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_FAMILY);
    }

    @Override
    public void setHotelRecommendationsFamily(Float hotelRecommendationsFamily) {
        parameters.put(HOTEL_RECOMMENDATIONS_FAMILY, hotelRecommendationsFamily);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsCouples() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_COUPLES);
    }

    @Override
    public void setHotelRecommendationsCouples(Float hotelRecommendationsCouples) {
        parameters.put(HOTEL_RECOMMENDATIONS_COUPLES, hotelRecommendationsCouples);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsFriends() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_FRIENDS);
    }

    @Override
    public void setHotelRecommendationsFriends(Float hotelRecommendationsFriends) {
        parameters.put(HOTEL_RECOMMENDATIONS_FRIENDS, hotelRecommendationsFriends);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsBeachHoliday() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_BEACH_HOLIDAY);
    }

    @Override
    public void setHotelRecommendationsBeachHoliday(Float hotelRecommendationsBeachHoliday) {
        parameters.put(HOTEL_RECOMMENDATIONS_BEACH_HOLIDAY, hotelRecommendationsBeachHoliday);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsBusinessTrip() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_BUSINESS_TRIP);
    }

    @Override
    public void setHotelRecommendationsBusinessTrip(Float hotelRecommendationsBusinessTrip) {
        parameters.put(HOTEL_RECOMMENDATIONS_BUSINESS_TRIP, hotelRecommendationsBusinessTrip);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsCityBreak() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_CITY_BREAK);
    }

    @Override
    public void setHotelRecommendationsCityBreak(Float hotelRecommendationsCityBreak) {
        parameters.put(HOTEL_RECOMMENDATIONS_CITY_BREAK, hotelRecommendationsCityBreak);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getHotelRecommendationsWellness() {
        return (Float) parameters.get(HOTEL_RECOMMENDATIONS_WELLNESS);
    }

    @Override
    public void setHotelRecommendationsWellness(Float hotelRecommendationsWellness) {
        parameters.put(HOTEL_RECOMMENDATIONS_WELLNESS, hotelRecommendationsWellness);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getHotelRoomCodes() {
        return (List<String>) parameters.get(HOTEL_ROOM_CODES);
    }

    @Override
    public void setHotelRoomCodes(List<String> hotelRoomCodes) {
        parameters.put(HOTEL_ROOM_CODES, hotelRoomCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getHotelRoomBookingCodes() {
        return (List<String>) parameters.get(HOTEL_ROOM_BOOKING_CODES);
    }

    @Override
    public void setHotelRoomBookingCodes(List<String> hotelRoomBookingCodes) {
        parameters.put(HOTEL_ROOM_BOOKING_CODES, hotelRoomBookingCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getHotelRoomViewCodes() {
        return (List<String>) parameters.get(HOTEL_ROOM_VIEW_CODES);
    }

    @Override
    public void setHotelRoomViewCodes(List<String> hotelRoomViewCodes) {
        parameters.put(HOTEL_ROOM_VIEW_CODES, hotelRoomViewCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getHotelRoomAttributes() {
        return (List<String>) parameters.get(HOTEL_ROOM_ATTRIBUTES);
    }

    @Override
    public void setHotelRoomAttributes(List<String> hotelRoomAttributes) {
        parameters.put(HOTEL_ROOM_ATTRIBUTES, hotelRoomAttributes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getHotelBoardCodes() {
        return (List<String>) parameters.get(HOTEL_BOARD_CODES);
    }

    @Override
    public void setHotelBoardCodes(List<String> hotelBoardCodes) {
        parameters.put(HOTEL_BOARD_CODES, hotelBoardCodes);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getExtras() {
        return (List<String>) parameters.get(EXTRAS);
    }

    @Override
    public void setExtras(List<String> extras) {
        parameters.put(EXTRAS, extras);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getPriceMin() {
        return (Float) parameters.get(PRICE_MIN);
    }

    @Override
    public void setPriceMin(Float priceMin) {
        parameters.put(PRICE_MIN, priceMin);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Float getPriceMax() {
        return (Float) parameters.get(PRICE_MAX);
    }

    @Override
    public void setPriceMax(Float priceMax) {
        parameters.put(PRICE_MAX, priceMax);
    }

    public PackageRequestParameterMap merge(PackageRequestParameterMap other) {
        PackageRequestParameterMap merged = new PackageRequestParameterMap();
        merged.parameters.putAll(this.parameters);
        merged.parameters.putAll(other.parameters);
        merged.parameters.values().removeIf(Objects::isNull);
        return merged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PackageRequestParameterMap that = (PackageRequestParameterMap) o;

        return parameters.equals(that.parameters);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + parameters.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PackageRequestParameterMap" + parameters.toString();
    }
}
