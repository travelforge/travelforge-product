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

package org.travelforge.product.service.packages;

import lombok.Data;
import org.travelforge.product.service.FlightProperties;
import org.travelforge.product.service.HotelProperties;
import org.travelforge.product.service.ProductProperties;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author Matthias Deck
 */
@Data
public class PackageProductProperties implements ProductProperties, FlightProperties, HotelProperties, Serializable {

    private List<Integer> productGroups;
    private List<String> tourOperatorCodes;
    private Integer travellersAdults;
    private List<Integer> travellersChildrenAge;
    private List<LocalDate> travellersChildrenDateOfBirth;
    private LocalDate travelPeriodDepartureDate;
    private Integer travelPeriodDepartureDateOffset;
    private Integer travelPeriodDepartureDatePreOffset;
    private Integer travelPeriodDepartureDatePostOffset;
    private List<DayOfWeek> travelPeriodDepartureDays;
    private LocalTime travelPeriodDepartureTimeMin;
    private LocalTime travelPeriodDepartureTimeMax;
    private LocalDate travelPeriodReturnDate;
    private Integer travelPeriodReturnDateOffset;
    private Integer travelPeriodReturnDatePreOffset;
    private Integer travelPeriodReturnDatePostOffset;
    private List<DayOfWeek> travelPeriodReturnDays;
    private LocalTime travelPeriodReturnTimeMin;
    private LocalTime travelPeriodReturnTimeMax;
    private List<Integer> travelPeriodDurations;
    private List<String> flightProviders;
    private List<String> flightDepartureAirportCodes;
    private List<String> flightArrivalAirportCodes;
    private List<String> flightAirlineCodes;
    private Integer flightStopOverMax;
    private String flightClass;
    private List<String> flightBookingClasses;
    private Integer flightDistanceMin;
    private Integer flightDistanceMax;
    private Integer flightDurationMin;
    private Integer flightDurationMax;
    private List<String> flightOutboundFlightIds;
    private List<String> flightInboundFlightIds;
    private List<String> flightOutboundFlightCodes;
    private List<String> flightInboundFlightCodes;
    private List<Integer> hotelCodes;
    private List<String> hotelProductCodes;
    private Float hotelCategory;
    private String hotelLocation;
    private List<String> hotelLocationCountryCodes;
    private List<Integer> hotelLocationRegionCodes;
    private List<Integer> hotelLocationCityCodes;
    private List<String> hotelAttributes;
    private Integer hotelRatingCount;
    private Float hotelRatingOverAll;
    private Float hotelRatingTotal;
    private Float hotelRatingHotel;
    private Float hotelRatingLocation;
    private Float hotelRatingService;
    private Float hotelRatingCatering;
    private Float hotelRatingSport;
    private Float hotelRatingRoom;
    private Float hotelRecommendationsTotal;
    private Float hotelRecommendationsSingle;
    private Float hotelRecommendationsFamily;
    private Float hotelRecommendationsCouples;
    private Float hotelRecommendationsFriends;
    private Float hotelRecommendationsBeachHoliday;
    private Float hotelRecommendationsBusinessTrip;
    private Float hotelRecommendationsCityBreak;
    private Float hotelRecommendationsWellness;
    private List<String> hotelQualifiers;
    private List<String> hotelRoomCodes;
    private List<String> hotelRoomBookingCodes;
    private List<String> hotelRoomViewCodes;
    private List<String> hotelRoomAttributes;
    private List<String> hotelBoardCodes;
    private List<String> extras;
    private Float priceMin;
    private Float priceMax;

    public PackageProductProperties merge(PackageProductProperties other) {

        PackageProductProperties properties = new PackageProductProperties();

        ProductProperties.merge(properties, this, other);
        FlightProperties.merge(properties, this, other);
        HotelProperties.merge(properties, this, other);

        return properties;
    }
}

