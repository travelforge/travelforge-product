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
public interface HotelProperties extends Serializable {

    List<String> getHotelProviders();

    void setHotelProviders(List<String> hotelProviders);

    String getHotelChain();

    void setHotelChain(String hotelChain);

    String getHotelName();

    void setHotelName(String hotelName);

    List<Integer> getHotelCodes();

    void setHotelCodes(List<Integer> hotelCodes);

    List<String> getHotelProductCodes();

    void setHotelProductCodes(List<String> hotelProductCodes);

    Float getHotelCategory();

    void setHotelCategory(Float hotelCategory);

    String getHotelLocation();

    void setHotelLocation(String hotelLocation);

    List<String> getHotelLocationCountryCodes();

    void setHotelLocationCountryCodes(List<String> hotelLocationCountryCodes);

    List<Integer> getHotelLocationRegionCodes();

    void setHotelLocationRegionCodes(List<Integer> hotelLocationRegionCodes);

    String getHotelLocationRegionName();

    void setHotelLocationRegionName(String hotelLocationRegionName);

    List<Integer> getHotelLocationCityCodes();

    void setHotelLocationCityCodes(List<Integer> hotelLocationCityCodes);

    String getHotelLocationCityName();

    void setHotelLocationCityName(String hotelLocationCityName);

    List<String> getHotelAttributes();

    void setHotelAttributes(List<String> hotelAttributes);

    List<String> getHotelGlobalTypes();

    void setHotelGlobalTypes(List<String> hotelGlobalTypes);

    Integer getHotelRatingCount();

    void setHotelRatingCount(Integer hotelRatingCount);

    Float getHotelRatingOverAll();

    void setHotelRatingOverAll(Float hotelRatingOverAll);

    Float getHotelRatingTotal();

    void setHotelRatingTotal(Float hotelRatingTotal);

    Float getHotelRatingHotel();

    void setHotelRatingHotel(Float hotelRatingHotel);

    Float getHotelRatingLocation();

    void setHotelRatingLocation(Float hotelRatingLocation);

    Float getHotelRatingService();

    void setHotelRatingService(Float hotelRatingService);

    Float getHotelRatingCatering();

    void setHotelRatingCatering(Float hotelRatingCatering);

    Float getHotelRatingSport();

    void setHotelRatingSport(Float hotelRatingSport);

    Float getHotelRatingRoom();

    void setHotelRatingRoom(Float hotelRatingRoom);

    Float getHotelRecommendationsTotal();

    void setHotelRecommendationsTotal(Float hotelRecommendationsTotal);

    Float getHotelRecommendationsSingle();

    void setHotelRecommendationsSingle(Float hotelRecommendationsSingle);

    Float getHotelRecommendationsFamily();

    void setHotelRecommendationsFamily(Float hotelRecommendationsFamily);

    Float getHotelRecommendationsCouples();

    void setHotelRecommendationsCouples(Float hotelRecommendationsCouples);

    Float getHotelRecommendationsFriends();

    void setHotelRecommendationsFriends(Float hotelRecommendationsFriends);

    Float getHotelRecommendationsBeachHoliday();

    void setHotelRecommendationsBeachHoliday(Float hotelRecommendationsBeachHoliday);

    Float getHotelRecommendationsBusinessTrip();

    void setHotelRecommendationsBusinessTrip(Float hotelRecommendationsBusinessTrip);

    Float getHotelRecommendationsCityBreak();

    void setHotelRecommendationsCityBreak(Float hotelRecommendationsCityBreak);

    Float getHotelRecommendationsWellness();

    void setHotelRecommendationsWellness(Float hotelRecommendationsWellness);

    List<String> getHotelQualifiers();

    void setHotelQualifiers(List<String> hotelQualifiers);

    List<String> getHotelRoomCodes();

    void setHotelRoomCodes(List<String> hotelRoomCodes);

    List<String> getHotelRoomBookingCodes();

    void setHotelRoomBookingCodes(List<String> hotelRoomBookingCodes);

    List<String> getHotelRoomViewCodes();

    void setHotelRoomViewCodes(List<String> hotelRoomViewCodes);

    List<String> getHotelRoomAttributes();

    void setHotelRoomAttributes(List<String> hotelRoomAttributes);

    List<String> getHotelBoardCodes();

    void setHotelBoardCodes(List<String> hotelBoardCodes);

    static void merge(HotelProperties target, HotelProperties... sources) {

        for (HotelProperties source : sources) {

            // HOTEL_PROVIDERS
            if (source.getHotelProviders() != null) {
                target.setHotelProviders(new ArrayList<>(source.getHotelProviders()));
            }

            // HOTEL_CHAIN
            if (source.getHotelChain() != null) {
                target.setHotelChain(source.getHotelChain());
            }
            // HOTEL_NAME
            if (source.getHotelName() != null) {
                target.setHotelName(source.getHotelName());
            }
            // HOTEL_CODES
            if (source.getHotelCodes() != null) {
                target.setHotelCodes(new ArrayList<>(source.getHotelCodes()));
            }
            // HOTEL_PRODUCT_CODES
            if (source.getHotelProductCodes() != null) {
                target.setHotelProductCodes(new ArrayList<>(source.getHotelProductCodes()));
            }
            // HOTEL_CATEGORY
            if (source.getHotelCategory() != null) {
                target.setHotelCategory(source.getHotelCategory());
            }
            // HOTEL_LOCATION
            if (source.getHotelLocation() != null) {
                target.setHotelLocation(source.getHotelLocation());
            }
            // HOTEL_LOCATION_COUNTRY_CODES
            if (source.getHotelLocationCountryCodes() != null) {
                target.setHotelLocationCountryCodes(new ArrayList<>(source.getHotelLocationCountryCodes()));
            }
            // HOTEL_LOCATION_REGION_CODES
            if (source.getHotelLocationRegionCodes() != null) {
                target.setHotelLocationRegionCodes(new ArrayList<>(source.getHotelLocationRegionCodes()));
            }
            // HOTEL_LOCATION_REGION_NAME
            if (source.getHotelLocationRegionName() != null) {
                target.setHotelLocationRegionName(source.getHotelLocationRegionName());
            }
            // HOTEL_LOCATION_CITY_CODES
            if (source.getHotelLocationCityCodes() != null) {
                target.setHotelLocationCityCodes(new ArrayList<>(source.getHotelLocationCityCodes()));
            }
            // HOTEL_LOCATION_CITY_NAME
            if (source.getHotelLocationCityName() != null) {
                target.setHotelLocationCityName(source.getHotelLocationCityName());
            }
            // HOTEL_ATTRIBUTES
            if (source.getHotelAttributes() != null) {
                target.setHotelAttributes(new ArrayList<>(source.getHotelAttributes()));
            }
            // HOTEL_GLOBAL_TYPES
            if (source.getHotelGlobalTypes() != null) {
                target.setHotelGlobalTypes(new ArrayList<>(source.getHotelGlobalTypes()));
            }
            // HOTEL_RATING_COUNT
            if (source.getHotelRatingCount() != null) {
                target.setHotelRatingCount(source.getHotelRatingCount());
            }
            // HOTEL_RATING_OVERALL
            if (source.getHotelRatingOverAll() != null) {
                target.setHotelRatingOverAll(source.getHotelRatingOverAll());
            }
            // HOTEL_RATING_TOTAL
            if (source.getHotelRatingTotal() != null) {
                target.setHotelRatingTotal(source.getHotelRatingTotal());
            }
            // HOTEL_RATING_HOTEL
            if (source.getHotelRatingHotel() != null) {
                target.setHotelRatingHotel(source.getHotelRatingHotel());
            }
            // HOTEL_RATING_LOCATION
            if (source.getHotelRatingLocation() != null) {
                target.setHotelRatingLocation(source.getHotelRatingLocation());
            }
            // HOTEL_RATING_SERVICE
            if (source.getHotelRatingService() != null) {
                target.setHotelRatingService(source.getHotelRatingService());
            }
            // HOTEL_RATING_CATERING
            if (source.getHotelRatingCatering() != null) {
                target.setHotelRatingCatering(source.getHotelRatingCatering());
            }
            // HOTEL_RATING_SPORT
            if (source.getHotelRatingSport() != null) {
                target.setHotelRatingSport(source.getHotelRatingSport());
            }
            // HOTEL_RATING_ROOM
            if (source.getHotelRatingRoom() != null) {
                target.setHotelRatingRoom(source.getHotelRatingRoom());
            }
            // HOTEL_RECOMMENDATIONS_TOTAL
            if (source.getHotelRecommendationsTotal() != null) {
                target.setHotelRecommendationsTotal(source.getHotelRecommendationsTotal());
            }
            // HOTEL_RECOMMENDATIONS_SINGLE
            if (source.getHotelRecommendationsSingle() != null) {
                target.setHotelRecommendationsSingle(source.getHotelRecommendationsSingle());
            }
            // HOTEL_RECOMMENDATIONS_FAMILY
            if (source.getHotelRecommendationsFamily() != null) {
                target.setHotelRecommendationsFamily(source.getHotelRecommendationsFamily());
            }
            // HOTEL_RECOMMENDATIONS_COUPLES
            if (source.getHotelRecommendationsCouples() != null) {
                target.setHotelRecommendationsCouples(source.getHotelRecommendationsCouples());
            }
            // HOTEL_RECOMMENDATIONS_FRIENDS
            if (source.getHotelRecommendationsFriends() != null) {
                target.setHotelRecommendationsFriends(source.getHotelRecommendationsFriends());
            }
            // HOTEL_RECOMMENDATIONS_BEACH_HOLIDAY
            if (source.getHotelRecommendationsBeachHoliday() != null) {
                target.setHotelRecommendationsBeachHoliday(source.getHotelRecommendationsBeachHoliday());
            }
            // HOTEL_RECOMMENDATIONS_BUSINESS_TRIP
            if (source.getHotelRecommendationsBusinessTrip() != null) {
                target.setHotelRecommendationsBusinessTrip(source.getHotelRecommendationsBusinessTrip());
            }
            // HOTEL_RECOMMENDATIONS_CITY_BREAK
            if (source.getHotelRecommendationsCityBreak() != null) {
                target.setHotelRecommendationsCityBreak(source.getHotelRecommendationsCityBreak());
            }
            // HOTEL_RECOMMENDATIONS_WELLNESS
            if (source.getHotelRecommendationsWellness() != null) {
                target.setHotelRecommendationsWellness(source.getHotelRecommendationsWellness());
            }
            // HOTEL_QUALIFIERS
            if (source.getHotelQualifiers() != null) {
                target.setHotelQualifiers(new ArrayList<>(source.getHotelQualifiers()));
            }
            // HOTEL_ROOM_CODES
            if (source.getHotelRoomCodes() != null) {
                target.setHotelRoomCodes(new ArrayList<>(source.getHotelRoomCodes()));
            }
            // HOTEL_ROOM_BOOKING_CODES
            if (source.getHotelRoomBookingCodes() != null) {
                target.setHotelRoomBookingCodes(new ArrayList<>(source.getHotelRoomBookingCodes()));
            }
            // HOTEL_ROOM_VIEW_CODES
            if (source.getHotelRoomViewCodes() != null) {
                target.setHotelRoomViewCodes(new ArrayList<>(source.getHotelRoomViewCodes()));
            }
            // HOTEL_ROOM_ATTRIBUTES
            if (source.getHotelRoomAttributes() != null) {
                target.setHotelRoomAttributes(new ArrayList<>(source.getHotelRoomAttributes()));
            }
            // HOTEL_BOARD_CODES
            if (source.getHotelBoardCodes() != null) {
                target.setHotelBoardCodes(new ArrayList<>(source.getHotelBoardCodes()));
            }
        }
    }
}
