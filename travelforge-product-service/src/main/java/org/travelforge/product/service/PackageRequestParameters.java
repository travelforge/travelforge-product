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
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author Matthias Deck
 */
public class PackageRequestParameters implements ProductRequestAttributes, FlightRequestAttributes, HotelRequestAttributes, Serializable {

    private static final long serialVersionUID = 1L;

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
    private List<String> flightDepartureAirportCodes;
    private List<String> flightArrivalAirportCodes;
    private List<String> flightAirlineCodes;
    private Integer flightStopOverMax;
    private List<Integer> hotelCodes;
    private List<String> hotelProductCodes;
    private Float hotelCategory;
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
    private List<String> hotelRoomCodes;
    private List<String> hotelRoomBookingCodes;
    private List<String> hotelRoomViewCodes;
    private List<String> hotelRoomAttributes;
    private List<String> hotelBoardCodes;
    private List<String> extras;
    private Float priceMin;
    private Float priceMax;

    public PackageRequestParameters() {
    }

    public PackageRequestParameters(List<Integer> productGroups, List<String> tourOperatorCodes, Integer travellersAdults, List<Integer> travellersChildrenAge, List<LocalDate> travellersChildrenDateOfBirth, LocalDate travelPeriodDepartureDate, Integer travelPeriodDepartureDateOffset, Integer travelPeriodDepartureDatePreOffset, Integer travelPeriodDepartureDatePostOffset, List<DayOfWeek> travelPeriodDepartureDays, LocalTime travelPeriodDepartureTimeMin, LocalTime travelPeriodDepartureTimeMax, LocalDate travelPeriodReturnDate, Integer travelPeriodReturnDateOffset, Integer travelPeriodReturnDatePreOffset, Integer travelPeriodReturnDatePostOffset, List<DayOfWeek> travelPeriodReturnDays, LocalTime travelPeriodReturnTimeMin, LocalTime travelPeriodReturnTimeMax, List<Integer> travelPeriodDurations, List<String> flightDepartureAirportCodes, List<String> flightArrivalAirportCodes, List<String> flightAirlineCodes, Integer flightStopOverMax, List<Integer> hotelCodes, List<String> hotelProductCodes, Float hotelCategory, List<String> hotelLocationCountryCodes, List<Integer> hotelLocationRegionCodes, List<Integer> hotelLocationCityCodes, List<String> hotelAttributes, Integer hotelRatingCount, Float hotelRatingOverAll, Float hotelRatingTotal, Float hotelRatingHotel, Float hotelRatingLocation, Float hotelRatingService, Float hotelRatingCatering, Float hotelRatingSport, Float hotelRatingRoom, Float hotelRecommendationsTotal, Float hotelRecommendationsSingle, Float hotelRecommendationsFamily, Float hotelRecommendationsCouples, Float hotelRecommendationsFriends, Float hotelRecommendationsBeachHoliday, Float hotelRecommendationsBusinessTrip, Float hotelRecommendationsCityBreak, Float hotelRecommendationsWellness, List<String> hotelRoomCodes, List<String> hotelRoomBookingCodes, List<String> hotelRoomViewCodes, List<String> hotelRoomAttributes, List<String> hotelBoardCodes, List<String> extras, Float priceMin, Float priceMax) {
        this.productGroups = productGroups;
        this.tourOperatorCodes = tourOperatorCodes;
        this.travellersAdults = travellersAdults;
        this.travellersChildrenAge = travellersChildrenAge;
        this.travellersChildrenDateOfBirth = travellersChildrenDateOfBirth;
        this.travelPeriodDepartureDate = travelPeriodDepartureDate;
        this.travelPeriodDepartureDateOffset = travelPeriodDepartureDateOffset;
        this.travelPeriodDepartureDatePreOffset = travelPeriodDepartureDatePreOffset;
        this.travelPeriodDepartureDatePostOffset = travelPeriodDepartureDatePostOffset;
        this.travelPeriodDepartureDays = travelPeriodDepartureDays;
        this.travelPeriodDepartureTimeMin = travelPeriodDepartureTimeMin;
        this.travelPeriodDepartureTimeMax = travelPeriodDepartureTimeMax;
        this.travelPeriodReturnDate = travelPeriodReturnDate;
        this.travelPeriodReturnDateOffset = travelPeriodReturnDateOffset;
        this.travelPeriodReturnDatePreOffset = travelPeriodReturnDatePreOffset;
        this.travelPeriodReturnDatePostOffset = travelPeriodReturnDatePostOffset;
        this.travelPeriodReturnDays = travelPeriodReturnDays;
        this.travelPeriodReturnTimeMin = travelPeriodReturnTimeMin;
        this.travelPeriodReturnTimeMax = travelPeriodReturnTimeMax;
        this.travelPeriodDurations = travelPeriodDurations;
        this.flightDepartureAirportCodes = flightDepartureAirportCodes;
        this.flightArrivalAirportCodes = flightArrivalAirportCodes;
        this.flightAirlineCodes = flightAirlineCodes;
        this.flightStopOverMax = flightStopOverMax;
        this.hotelCodes = hotelCodes;
        this.hotelProductCodes = hotelProductCodes;
        this.hotelCategory = hotelCategory;
        this.hotelLocationCountryCodes = hotelLocationCountryCodes;
        this.hotelLocationRegionCodes = hotelLocationRegionCodes;
        this.hotelLocationCityCodes = hotelLocationCityCodes;
        this.hotelAttributes = hotelAttributes;
        this.hotelRatingCount = hotelRatingCount;
        this.hotelRatingOverAll = hotelRatingOverAll;
        this.hotelRatingTotal = hotelRatingTotal;
        this.hotelRatingHotel = hotelRatingHotel;
        this.hotelRatingLocation = hotelRatingLocation;
        this.hotelRatingService = hotelRatingService;
        this.hotelRatingCatering = hotelRatingCatering;
        this.hotelRatingSport = hotelRatingSport;
        this.hotelRatingRoom = hotelRatingRoom;
        this.hotelRecommendationsTotal = hotelRecommendationsTotal;
        this.hotelRecommendationsSingle = hotelRecommendationsSingle;
        this.hotelRecommendationsFamily = hotelRecommendationsFamily;
        this.hotelRecommendationsCouples = hotelRecommendationsCouples;
        this.hotelRecommendationsFriends = hotelRecommendationsFriends;
        this.hotelRecommendationsBeachHoliday = hotelRecommendationsBeachHoliday;
        this.hotelRecommendationsBusinessTrip = hotelRecommendationsBusinessTrip;
        this.hotelRecommendationsCityBreak = hotelRecommendationsCityBreak;
        this.hotelRecommendationsWellness = hotelRecommendationsWellness;
        this.hotelRoomCodes = hotelRoomCodes;
        this.hotelRoomBookingCodes = hotelRoomBookingCodes;
        this.hotelRoomViewCodes = hotelRoomViewCodes;
        this.hotelRoomAttributes = hotelRoomAttributes;
        this.hotelBoardCodes = hotelBoardCodes;
        this.extras = extras;
        this.priceMin = priceMin;
        this.priceMax = priceMax;
    }

    @Override
    public List<Integer> getProductGroups() {
        return productGroups;
    }

    public void setProductGroups(List<Integer> productGroups) {
        this.productGroups = productGroups;
    }

    @Override
    public List<String> getTourOperatorCodes() {
        return tourOperatorCodes;
    }

    public void setTourOperatorCodes(List<String> tourOperatorCodes) {
        this.tourOperatorCodes = tourOperatorCodes;
    }

    @Override
    public Integer getTravellersAdults() {
        return travellersAdults;
    }

    public void setTravellersAdults(Integer travellersAdults) {
        this.travellersAdults = travellersAdults;
    }

    @Override
    public List<Integer> getTravellersChildrenAge() {
        return travellersChildrenAge;
    }

    public void setTravellersChildrenAge(List<Integer> travellersChildrenAge) {
        this.travellersChildrenAge = travellersChildrenAge;
    }

    @Override
    public List<LocalDate> getTravellersChildrenDateOfBirth() {
        return travellersChildrenDateOfBirth;
    }

    public void setTravellersChildrenDateOfBirth(List<LocalDate> travellersChildrenDateOfBirth) {
        this.travellersChildrenDateOfBirth = travellersChildrenDateOfBirth;
    }

    @Override
    public LocalDate getTravelPeriodDepartureDate() {
        return travelPeriodDepartureDate;
    }

    public void setTravelPeriodDepartureDate(LocalDate travelPeriodDepartureDate) {
        this.travelPeriodDepartureDate = travelPeriodDepartureDate;
    }

    @Override
    public Integer getTravelPeriodDepartureDateOffset() {
        return travelPeriodDepartureDateOffset;
    }

    public void setTravelPeriodDepartureDateOffset(Integer travelPeriodDepartureDateOffset) {
        this.travelPeriodDepartureDateOffset = travelPeriodDepartureDateOffset;
    }

    @Override
    public Integer getTravelPeriodDepartureDatePreOffset() {
        return travelPeriodDepartureDatePreOffset;
    }

    public void setTravelPeriodDepartureDatePreOffset(Integer travelPeriodDepartureDatePreOffset) {
        this.travelPeriodDepartureDatePreOffset = travelPeriodDepartureDatePreOffset;
    }

    @Override
    public Integer getTravelPeriodDepartureDatePostOffset() {
        return travelPeriodDepartureDatePostOffset;
    }

    public void setTravelPeriodDepartureDatePostOffset(Integer travelPeriodDepartureDatePostOffset) {
        this.travelPeriodDepartureDatePostOffset = travelPeriodDepartureDatePostOffset;
    }

    @Override
    public List<DayOfWeek> getTravelPeriodDepartureDays() {
        return travelPeriodDepartureDays;
    }

    public void setTravelPeriodDepartureDays(List<DayOfWeek> travelPeriodDepartureDays) {
        this.travelPeriodDepartureDays = travelPeriodDepartureDays;
    }

    @Override
    public LocalTime getTravelPeriodDepartureTimeMin() {
        return travelPeriodDepartureTimeMin;
    }

    public void setTravelPeriodDepartureTimeMin(LocalTime travelPeriodDepartureTimeMin) {
        this.travelPeriodDepartureTimeMin = travelPeriodDepartureTimeMin;
    }

    @Override
    public LocalTime getTravelPeriodDepartureTimeMax() {
        return travelPeriodDepartureTimeMax;
    }

    public void setTravelPeriodDepartureTimeMax(LocalTime travelPeriodDepartureTimeMax) {
        this.travelPeriodDepartureTimeMax = travelPeriodDepartureTimeMax;
    }

    @Override
    public LocalDate getTravelPeriodReturnDate() {
        return travelPeriodReturnDate;
    }

    public void setTravelPeriodReturnDate(LocalDate travelPeriodReturnDate) {
        this.travelPeriodReturnDate = travelPeriodReturnDate;
    }

    @Override
    public Integer getTravelPeriodReturnDateOffset() {
        return travelPeriodReturnDateOffset;
    }

    public void setTravelPeriodReturnDateOffset(Integer travelPeriodReturnDateOffset) {
        this.travelPeriodReturnDateOffset = travelPeriodReturnDateOffset;
    }

    @Override
    public Integer getTravelPeriodReturnDatePreOffset() {
        return travelPeriodReturnDatePreOffset;
    }

    public void setTravelPeriodReturnDatePreOffset(Integer travelPeriodReturnDatePreOffset) {
        this.travelPeriodReturnDatePreOffset = travelPeriodReturnDatePreOffset;
    }

    @Override
    public Integer getTravelPeriodReturnDatePostOffset() {
        return travelPeriodReturnDatePostOffset;
    }

    public void setTravelPeriodReturnDatePostOffset(Integer travelPeriodReturnDatePostOffset) {
        this.travelPeriodReturnDatePostOffset = travelPeriodReturnDatePostOffset;
    }

    @Override
    public List<DayOfWeek> getTravelPeriodReturnDays() {
        return travelPeriodReturnDays;
    }

    public void setTravelPeriodReturnDays(List<DayOfWeek> travelPeriodReturnDays) {
        this.travelPeriodReturnDays = travelPeriodReturnDays;
    }

    @Override
    public LocalTime getTravelPeriodReturnTimeMin() {
        return travelPeriodReturnTimeMin;
    }

    public void setTravelPeriodReturnTimeMin(LocalTime travelPeriodReturnTimeMin) {
        this.travelPeriodReturnTimeMin = travelPeriodReturnTimeMin;
    }

    @Override
    public LocalTime getTravelPeriodReturnTimeMax() {
        return travelPeriodReturnTimeMax;
    }

    public void setTravelPeriodReturnTimeMax(LocalTime travelPeriodReturnTimeMax) {
        this.travelPeriodReturnTimeMax = travelPeriodReturnTimeMax;
    }

    @Override
    public List<Integer> getTravelPeriodDurations() {
        return travelPeriodDurations;
    }

    public void setTravelPeriodDurations(List<Integer> travelPeriodDurations) {
        this.travelPeriodDurations = travelPeriodDurations;
    }

    @Override
    public List<String> getFlightDepartureAirportCodes() {
        return flightDepartureAirportCodes;
    }

    public void setFlightDepartureAirportCodes(List<String> flightDepartureAirportCodes) {
        this.flightDepartureAirportCodes = flightDepartureAirportCodes;
    }

    @Override
    public List<String> getFlightArrivalAirportCodes() {
        return flightArrivalAirportCodes;
    }

    public void setFlightArrivalAirportCodes(List<String> flightArrivalAirportCodes) {
        this.flightArrivalAirportCodes = flightArrivalAirportCodes;
    }

    @Override
    public List<String> getFlightAirlineCodes() {
        return flightAirlineCodes;
    }

    public void setFlightAirlineCodes(List<String> flightAirlineCodes) {
        this.flightAirlineCodes = flightAirlineCodes;
    }

    @Override
    public Integer getFlightStopOverMax() {
        return flightStopOverMax;
    }

    public void setFlightStopOverMax(Integer flightStopOverMax) {
        this.flightStopOverMax = flightStopOverMax;
    }

    @Override
    public List<Integer> getHotelCodes() {
        return hotelCodes;
    }

    public void setHotelCodes(List<Integer> hotelCodes) {
        this.hotelCodes = hotelCodes;
    }

    @Override
    public List<String> getHotelProductCodes() {
        return hotelProductCodes;
    }

    public void setHotelProductCodes(List<String> hotelProductCodes) {
        this.hotelProductCodes = hotelProductCodes;
    }

    @Override
    public Float getHotelCategory() {
        return hotelCategory;
    }

    public void setHotelCategory(Float hotelCategory) {
        this.hotelCategory = hotelCategory;
    }

    @Override
    public List<String> getHotelLocationCountryCodes() {
        return hotelLocationCountryCodes;
    }

    public void setHotelLocationCountryCodes(List<String> hotelLocationCountryCodes) {
        this.hotelLocationCountryCodes = hotelLocationCountryCodes;
    }

    @Override
    public List<Integer> getHotelLocationRegionCodes() {
        return hotelLocationRegionCodes;
    }

    public void setHotelLocationRegionCodes(List<Integer> hotelLocationRegionCodes) {
        this.hotelLocationRegionCodes = hotelLocationRegionCodes;
    }

    @Override
    public List<Integer> getHotelLocationCityCodes() {
        return hotelLocationCityCodes;
    }

    public void setHotelLocationCityCodes(List<Integer> hotelLocationCityCodes) {
        this.hotelLocationCityCodes = hotelLocationCityCodes;
    }

    @Override
    public List<String> getHotelAttributes() {
        return hotelAttributes;
    }

    public void setHotelAttributes(List<String> hotelAttributes) {
        this.hotelAttributes = hotelAttributes;
    }

    @Override
    public Integer getHotelRatingCount() {
        return hotelRatingCount;
    }

    public void setHotelRatingCount(Integer hotelRatingCount) {
        this.hotelRatingCount = hotelRatingCount;
    }

    @Override
    public Float getHotelRatingOverAll() {
        return hotelRatingOverAll;
    }

    public void setHotelRatingOverAll(Float hotelRatingOverAll) {
        this.hotelRatingOverAll = hotelRatingOverAll;
    }

    @Override
    public Float getHotelRatingTotal() {
        return hotelRatingTotal;
    }

    public void setHotelRatingTotal(Float hotelRatingTotal) {
        this.hotelRatingTotal = hotelRatingTotal;
    }

    @Override
    public Float getHotelRatingHotel() {
        return hotelRatingHotel;
    }

    public void setHotelRatingHotel(Float hotelRatingHotel) {
        this.hotelRatingHotel = hotelRatingHotel;
    }

    @Override
    public Float getHotelRatingLocation() {
        return hotelRatingLocation;
    }

    public void setHotelRatingLocation(Float hotelRatingLocation) {
        this.hotelRatingLocation = hotelRatingLocation;
    }

    @Override
    public Float getHotelRatingService() {
        return hotelRatingService;
    }

    public void setHotelRatingService(Float hotelRatingService) {
        this.hotelRatingService = hotelRatingService;
    }

    @Override
    public Float getHotelRatingCatering() {
        return hotelRatingCatering;
    }

    public void setHotelRatingCatering(Float hotelRatingCatering) {
        this.hotelRatingCatering = hotelRatingCatering;
    }

    @Override
    public Float getHotelRatingSport() {
        return hotelRatingSport;
    }

    public void setHotelRatingSport(Float hotelRatingSport) {
        this.hotelRatingSport = hotelRatingSport;
    }

    @Override
    public Float getHotelRatingRoom() {
        return hotelRatingRoom;
    }

    public void setHotelRatingRoom(Float hotelRatingRoom) {
        this.hotelRatingRoom = hotelRatingRoom;
    }

    @Override
    public Float getHotelRecommendationsTotal() {
        return hotelRecommendationsTotal;
    }

    public void setHotelRecommendationsTotal(Float hotelRecommendationsTotal) {
        this.hotelRecommendationsTotal = hotelRecommendationsTotal;
    }

    @Override
    public Float getHotelRecommendationsSingle() {
        return hotelRecommendationsSingle;
    }

    public void setHotelRecommendationsSingle(Float hotelRecommendationsSingle) {
        this.hotelRecommendationsSingle = hotelRecommendationsSingle;
    }

    @Override
    public Float getHotelRecommendationsFamily() {
        return hotelRecommendationsFamily;
    }

    public void setHotelRecommendationsFamily(Float hotelRecommendationsFamily) {
        this.hotelRecommendationsFamily = hotelRecommendationsFamily;
    }

    @Override
    public Float getHotelRecommendationsCouples() {
        return hotelRecommendationsCouples;
    }

    public void setHotelRecommendationsCouples(Float hotelRecommendationsCouples) {
        this.hotelRecommendationsCouples = hotelRecommendationsCouples;
    }

    @Override
    public Float getHotelRecommendationsFriends() {
        return hotelRecommendationsFriends;
    }

    public void setHotelRecommendationsFriends(Float hotelRecommendationsFriends) {
        this.hotelRecommendationsFriends = hotelRecommendationsFriends;
    }

    @Override
    public Float getHotelRecommendationsBeachHoliday() {
        return hotelRecommendationsBeachHoliday;
    }

    public void setHotelRecommendationsBeachHoliday(Float hotelRecommendationsBeachHoliday) {
        this.hotelRecommendationsBeachHoliday = hotelRecommendationsBeachHoliday;
    }

    @Override
    public Float getHotelRecommendationsBusinessTrip() {
        return hotelRecommendationsBusinessTrip;
    }

    public void setHotelRecommendationsBusinessTrip(Float hotelRecommendationsBusinessTrip) {
        this.hotelRecommendationsBusinessTrip = hotelRecommendationsBusinessTrip;
    }

    @Override
    public Float getHotelRecommendationsCityBreak() {
        return hotelRecommendationsCityBreak;
    }

    public void setHotelRecommendationsCityBreak(Float hotelRecommendationsCityBreak) {
        this.hotelRecommendationsCityBreak = hotelRecommendationsCityBreak;
    }

    @Override
    public Float getHotelRecommendationsWellness() {
        return hotelRecommendationsWellness;
    }

    public void setHotelRecommendationsWellness(Float hotelRecommendationsWellness) {
        this.hotelRecommendationsWellness = hotelRecommendationsWellness;
    }

    @Override
    public List<String> getHotelRoomCodes() {
        return hotelRoomCodes;
    }

    public void setHotelRoomCodes(List<String> hotelRoomCodes) {
        this.hotelRoomCodes = hotelRoomCodes;
    }

    @Override
    public List<String> getHotelRoomBookingCodes() {
        return hotelRoomBookingCodes;
    }

    public void setHotelRoomBookingCodes(List<String> hotelRoomBookingCodes) {
        this.hotelRoomBookingCodes = hotelRoomBookingCodes;
    }

    @Override
    public List<String> getHotelRoomViewCodes() {
        return hotelRoomViewCodes;
    }

    public void setHotelRoomViewCodes(List<String> hotelRoomViewCodes) {
        this.hotelRoomViewCodes = hotelRoomViewCodes;
    }

    @Override
    public List<String> getHotelRoomAttributes() {
        return hotelRoomAttributes;
    }

    public void setHotelRoomAttributes(List<String> hotelRoomAttributes) {
        this.hotelRoomAttributes = hotelRoomAttributes;
    }

    @Override
    public List<String> getHotelBoardCodes() {
        return hotelBoardCodes;
    }

    public void setHotelBoardCodes(List<String> hotelBoardCodes) {
        this.hotelBoardCodes = hotelBoardCodes;
    }

    @Override
    public List<String> getExtras() {
        return extras;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    @Override
    public Float getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(Float priceMin) {
        this.priceMin = priceMin;
    }

    @Override
    public Float getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(Float priceMax) {
        this.priceMax = priceMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageRequestParameters that = (PackageRequestParameters) o;

        if (productGroups != null ? !productGroups.equals(that.productGroups) : that.productGroups != null)
            return false;
        if (tourOperatorCodes != null ? !tourOperatorCodes.equals(that.tourOperatorCodes) : that.tourOperatorCodes != null)
            return false;
        if (travellersAdults != null ? !travellersAdults.equals(that.travellersAdults) : that.travellersAdults != null)
            return false;
        if (travellersChildrenAge != null ? !travellersChildrenAge.equals(that.travellersChildrenAge) : that.travellersChildrenAge != null)
            return false;
        if (travellersChildrenDateOfBirth != null ? !travellersChildrenDateOfBirth.equals(that.travellersChildrenDateOfBirth) : that.travellersChildrenDateOfBirth != null)
            return false;
        if (travelPeriodDepartureDate != null ? !travelPeriodDepartureDate.equals(that.travelPeriodDepartureDate) : that.travelPeriodDepartureDate != null)
            return false;
        if (travelPeriodDepartureDateOffset != null ? !travelPeriodDepartureDateOffset.equals(that.travelPeriodDepartureDateOffset) : that.travelPeriodDepartureDateOffset != null)
            return false;
        if (travelPeriodDepartureDatePreOffset != null ? !travelPeriodDepartureDatePreOffset.equals(that.travelPeriodDepartureDatePreOffset) : that.travelPeriodDepartureDatePreOffset != null)
            return false;
        if (travelPeriodDepartureDatePostOffset != null ? !travelPeriodDepartureDatePostOffset.equals(that.travelPeriodDepartureDatePostOffset) : that.travelPeriodDepartureDatePostOffset != null)
            return false;
        if (travelPeriodDepartureDays != null ? !travelPeriodDepartureDays.equals(that.travelPeriodDepartureDays) : that.travelPeriodDepartureDays != null)
            return false;
        if (travelPeriodDepartureTimeMin != null ? !travelPeriodDepartureTimeMin.equals(that.travelPeriodDepartureTimeMin) : that.travelPeriodDepartureTimeMin != null)
            return false;
        if (travelPeriodDepartureTimeMax != null ? !travelPeriodDepartureTimeMax.equals(that.travelPeriodDepartureTimeMax) : that.travelPeriodDepartureTimeMax != null)
            return false;
        if (travelPeriodReturnDate != null ? !travelPeriodReturnDate.equals(that.travelPeriodReturnDate) : that.travelPeriodReturnDate != null)
            return false;
        if (travelPeriodReturnDateOffset != null ? !travelPeriodReturnDateOffset.equals(that.travelPeriodReturnDateOffset) : that.travelPeriodReturnDateOffset != null)
            return false;
        if (travelPeriodReturnDatePreOffset != null ? !travelPeriodReturnDatePreOffset.equals(that.travelPeriodReturnDatePreOffset) : that.travelPeriodReturnDatePreOffset != null)
            return false;
        if (travelPeriodReturnDatePostOffset != null ? !travelPeriodReturnDatePostOffset.equals(that.travelPeriodReturnDatePostOffset) : that.travelPeriodReturnDatePostOffset != null)
            return false;
        if (travelPeriodReturnDays != null ? !travelPeriodReturnDays.equals(that.travelPeriodReturnDays) : that.travelPeriodReturnDays != null)
            return false;
        if (travelPeriodReturnTimeMin != null ? !travelPeriodReturnTimeMin.equals(that.travelPeriodReturnTimeMin) : that.travelPeriodReturnTimeMin != null)
            return false;
        if (travelPeriodReturnTimeMax != null ? !travelPeriodReturnTimeMax.equals(that.travelPeriodReturnTimeMax) : that.travelPeriodReturnTimeMax != null)
            return false;
        if (travelPeriodDurations != null ? !travelPeriodDurations.equals(that.travelPeriodDurations) : that.travelPeriodDurations != null)
            return false;
        if (flightDepartureAirportCodes != null ? !flightDepartureAirportCodes.equals(that.flightDepartureAirportCodes) : that.flightDepartureAirportCodes != null)
            return false;
        if (flightArrivalAirportCodes != null ? !flightArrivalAirportCodes.equals(that.flightArrivalAirportCodes) : that.flightArrivalAirportCodes != null)
            return false;
        if (flightAirlineCodes != null ? !flightAirlineCodes.equals(that.flightAirlineCodes) : that.flightAirlineCodes != null)
            return false;
        if (flightStopOverMax != null ? !flightStopOverMax.equals(that.flightStopOverMax) : that.flightStopOverMax != null)
            return false;
        if (hotelCodes != null ? !hotelCodes.equals(that.hotelCodes) : that.hotelCodes != null) return false;
        if (hotelProductCodes != null ? !hotelProductCodes.equals(that.hotelProductCodes) : that.hotelProductCodes != null)
            return false;
        if (hotelCategory != null ? !hotelCategory.equals(that.hotelCategory) : that.hotelCategory != null)
            return false;
        if (hotelLocationCountryCodes != null ? !hotelLocationCountryCodes.equals(that.hotelLocationCountryCodes) : that.hotelLocationCountryCodes != null)
            return false;
        if (hotelLocationRegionCodes != null ? !hotelLocationRegionCodes.equals(that.hotelLocationRegionCodes) : that.hotelLocationRegionCodes != null)
            return false;
        if (hotelLocationCityCodes != null ? !hotelLocationCityCodes.equals(that.hotelLocationCityCodes) : that.hotelLocationCityCodes != null)
            return false;
        if (hotelAttributes != null ? !hotelAttributes.equals(that.hotelAttributes) : that.hotelAttributes != null)
            return false;
        if (hotelRatingCount != null ? !hotelRatingCount.equals(that.hotelRatingCount) : that.hotelRatingCount != null)
            return false;
        if (hotelRatingOverAll != null ? !hotelRatingOverAll.equals(that.hotelRatingOverAll) : that.hotelRatingOverAll != null)
            return false;
        if (hotelRatingTotal != null ? !hotelRatingTotal.equals(that.hotelRatingTotal) : that.hotelRatingTotal != null)
            return false;
        if (hotelRatingHotel != null ? !hotelRatingHotel.equals(that.hotelRatingHotel) : that.hotelRatingHotel != null)
            return false;
        if (hotelRatingLocation != null ? !hotelRatingLocation.equals(that.hotelRatingLocation) : that.hotelRatingLocation != null)
            return false;
        if (hotelRatingService != null ? !hotelRatingService.equals(that.hotelRatingService) : that.hotelRatingService != null)
            return false;
        if (hotelRatingCatering != null ? !hotelRatingCatering.equals(that.hotelRatingCatering) : that.hotelRatingCatering != null)
            return false;
        if (hotelRatingSport != null ? !hotelRatingSport.equals(that.hotelRatingSport) : that.hotelRatingSport != null)
            return false;
        if (hotelRatingRoom != null ? !hotelRatingRoom.equals(that.hotelRatingRoom) : that.hotelRatingRoom != null)
            return false;
        if (hotelRecommendationsTotal != null ? !hotelRecommendationsTotal.equals(that.hotelRecommendationsTotal) : that.hotelRecommendationsTotal != null)
            return false;
        if (hotelRecommendationsSingle != null ? !hotelRecommendationsSingle.equals(that.hotelRecommendationsSingle) : that.hotelRecommendationsSingle != null)
            return false;
        if (hotelRecommendationsFamily != null ? !hotelRecommendationsFamily.equals(that.hotelRecommendationsFamily) : that.hotelRecommendationsFamily != null)
            return false;
        if (hotelRecommendationsCouples != null ? !hotelRecommendationsCouples.equals(that.hotelRecommendationsCouples) : that.hotelRecommendationsCouples != null)
            return false;
        if (hotelRecommendationsFriends != null ? !hotelRecommendationsFriends.equals(that.hotelRecommendationsFriends) : that.hotelRecommendationsFriends != null)
            return false;
        if (hotelRecommendationsBeachHoliday != null ? !hotelRecommendationsBeachHoliday.equals(that.hotelRecommendationsBeachHoliday) : that.hotelRecommendationsBeachHoliday != null)
            return false;
        if (hotelRecommendationsBusinessTrip != null ? !hotelRecommendationsBusinessTrip.equals(that.hotelRecommendationsBusinessTrip) : that.hotelRecommendationsBusinessTrip != null)
            return false;
        if (hotelRecommendationsCityBreak != null ? !hotelRecommendationsCityBreak.equals(that.hotelRecommendationsCityBreak) : that.hotelRecommendationsCityBreak != null)
            return false;
        if (hotelRecommendationsWellness != null ? !hotelRecommendationsWellness.equals(that.hotelRecommendationsWellness) : that.hotelRecommendationsWellness != null)
            return false;
        if (hotelRoomCodes != null ? !hotelRoomCodes.equals(that.hotelRoomCodes) : that.hotelRoomCodes != null)
            return false;
        if (hotelRoomBookingCodes != null ? !hotelRoomBookingCodes.equals(that.hotelRoomBookingCodes) : that.hotelRoomBookingCodes != null)
            return false;
        if (hotelRoomViewCodes != null ? !hotelRoomViewCodes.equals(that.hotelRoomViewCodes) : that.hotelRoomViewCodes != null)
            return false;
        if (hotelRoomAttributes != null ? !hotelRoomAttributes.equals(that.hotelRoomAttributes) : that.hotelRoomAttributes != null)
            return false;
        if (hotelBoardCodes != null ? !hotelBoardCodes.equals(that.hotelBoardCodes) : that.hotelBoardCodes != null)
            return false;
        if (extras != null ? !extras.equals(that.extras) : that.extras != null) return false;
        if (priceMin != null ? !priceMin.equals(that.priceMin) : that.priceMin != null) return false;
        return priceMax != null ? priceMax.equals(that.priceMax) : that.priceMax == null;
    }

    @Override
    public int hashCode() {
        int result = productGroups != null ? productGroups.hashCode() : 0;
        result = 31 * result + (tourOperatorCodes != null ? tourOperatorCodes.hashCode() : 0);
        result = 31 * result + (travellersAdults != null ? travellersAdults.hashCode() : 0);
        result = 31 * result + (travellersChildrenAge != null ? travellersChildrenAge.hashCode() : 0);
        result = 31 * result + (travellersChildrenDateOfBirth != null ? travellersChildrenDateOfBirth.hashCode() : 0);
        result = 31 * result + (travelPeriodDepartureDate != null ? travelPeriodDepartureDate.hashCode() : 0);
        result = 31 * result + (travelPeriodDepartureDateOffset != null ? travelPeriodDepartureDateOffset.hashCode() : 0);
        result = 31 * result + (travelPeriodDepartureDatePreOffset != null ? travelPeriodDepartureDatePreOffset.hashCode() : 0);
        result = 31 * result + (travelPeriodDepartureDatePostOffset != null ? travelPeriodDepartureDatePostOffset.hashCode() : 0);
        result = 31 * result + (travelPeriodDepartureDays != null ? travelPeriodDepartureDays.hashCode() : 0);
        result = 31 * result + (travelPeriodDepartureTimeMin != null ? travelPeriodDepartureTimeMin.hashCode() : 0);
        result = 31 * result + (travelPeriodDepartureTimeMax != null ? travelPeriodDepartureTimeMax.hashCode() : 0);
        result = 31 * result + (travelPeriodReturnDate != null ? travelPeriodReturnDate.hashCode() : 0);
        result = 31 * result + (travelPeriodReturnDateOffset != null ? travelPeriodReturnDateOffset.hashCode() : 0);
        result = 31 * result + (travelPeriodReturnDatePreOffset != null ? travelPeriodReturnDatePreOffset.hashCode() : 0);
        result = 31 * result + (travelPeriodReturnDatePostOffset != null ? travelPeriodReturnDatePostOffset.hashCode() : 0);
        result = 31 * result + (travelPeriodReturnDays != null ? travelPeriodReturnDays.hashCode() : 0);
        result = 31 * result + (travelPeriodReturnTimeMin != null ? travelPeriodReturnTimeMin.hashCode() : 0);
        result = 31 * result + (travelPeriodReturnTimeMax != null ? travelPeriodReturnTimeMax.hashCode() : 0);
        result = 31 * result + (travelPeriodDurations != null ? travelPeriodDurations.hashCode() : 0);
        result = 31 * result + (flightDepartureAirportCodes != null ? flightDepartureAirportCodes.hashCode() : 0);
        result = 31 * result + (flightArrivalAirportCodes != null ? flightArrivalAirportCodes.hashCode() : 0);
        result = 31 * result + (flightAirlineCodes != null ? flightAirlineCodes.hashCode() : 0);
        result = 31 * result + (flightStopOverMax != null ? flightStopOverMax.hashCode() : 0);
        result = 31 * result + (hotelCodes != null ? hotelCodes.hashCode() : 0);
        result = 31 * result + (hotelProductCodes != null ? hotelProductCodes.hashCode() : 0);
        result = 31 * result + (hotelCategory != null ? hotelCategory.hashCode() : 0);
        result = 31 * result + (hotelLocationCountryCodes != null ? hotelLocationCountryCodes.hashCode() : 0);
        result = 31 * result + (hotelLocationRegionCodes != null ? hotelLocationRegionCodes.hashCode() : 0);
        result = 31 * result + (hotelLocationCityCodes != null ? hotelLocationCityCodes.hashCode() : 0);
        result = 31 * result + (hotelAttributes != null ? hotelAttributes.hashCode() : 0);
        result = 31 * result + (hotelRatingCount != null ? hotelRatingCount.hashCode() : 0);
        result = 31 * result + (hotelRatingOverAll != null ? hotelRatingOverAll.hashCode() : 0);
        result = 31 * result + (hotelRatingTotal != null ? hotelRatingTotal.hashCode() : 0);
        result = 31 * result + (hotelRatingHotel != null ? hotelRatingHotel.hashCode() : 0);
        result = 31 * result + (hotelRatingLocation != null ? hotelRatingLocation.hashCode() : 0);
        result = 31 * result + (hotelRatingService != null ? hotelRatingService.hashCode() : 0);
        result = 31 * result + (hotelRatingCatering != null ? hotelRatingCatering.hashCode() : 0);
        result = 31 * result + (hotelRatingSport != null ? hotelRatingSport.hashCode() : 0);
        result = 31 * result + (hotelRatingRoom != null ? hotelRatingRoom.hashCode() : 0);
        result = 31 * result + (hotelRecommendationsTotal != null ? hotelRecommendationsTotal.hashCode() : 0);
        result = 31 * result + (hotelRecommendationsSingle != null ? hotelRecommendationsSingle.hashCode() : 0);
        result = 31 * result + (hotelRecommendationsFamily != null ? hotelRecommendationsFamily.hashCode() : 0);
        result = 31 * result + (hotelRecommendationsCouples != null ? hotelRecommendationsCouples.hashCode() : 0);
        result = 31 * result + (hotelRecommendationsFriends != null ? hotelRecommendationsFriends.hashCode() : 0);
        result = 31 * result + (hotelRecommendationsBeachHoliday != null ? hotelRecommendationsBeachHoliday.hashCode() : 0);
        result = 31 * result + (hotelRecommendationsBusinessTrip != null ? hotelRecommendationsBusinessTrip.hashCode() : 0);
        result = 31 * result + (hotelRecommendationsCityBreak != null ? hotelRecommendationsCityBreak.hashCode() : 0);
        result = 31 * result + (hotelRecommendationsWellness != null ? hotelRecommendationsWellness.hashCode() : 0);
        result = 31 * result + (hotelRoomCodes != null ? hotelRoomCodes.hashCode() : 0);
        result = 31 * result + (hotelRoomBookingCodes != null ? hotelRoomBookingCodes.hashCode() : 0);
        result = 31 * result + (hotelRoomViewCodes != null ? hotelRoomViewCodes.hashCode() : 0);
        result = 31 * result + (hotelRoomAttributes != null ? hotelRoomAttributes.hashCode() : 0);
        result = 31 * result + (hotelBoardCodes != null ? hotelBoardCodes.hashCode() : 0);
        result = 31 * result + (extras != null ? extras.hashCode() : 0);
        result = 31 * result + (priceMin != null ? priceMin.hashCode() : 0);
        result = 31 * result + (priceMax != null ? priceMax.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageRequestParameters{" +
                "productGroups=" + productGroups +
                ", tourOperatorCodes=" + tourOperatorCodes +
                ", travellersAdults=" + travellersAdults +
                ", travellersChildrenAge=" + travellersChildrenAge +
                ", travellersChildrenDateOfBirth=" + travellersChildrenDateOfBirth +
                ", travelPeriodDepartureDate=" + travelPeriodDepartureDate +
                ", travelPeriodDepartureDateOffset=" + travelPeriodDepartureDateOffset +
                ", travelPeriodDepartureDatePreOffset=" + travelPeriodDepartureDatePreOffset +
                ", travelPeriodDepartureDatePostOffset=" + travelPeriodDepartureDatePostOffset +
                ", travelPeriodDepartureDays=" + travelPeriodDepartureDays +
                ", travelPeriodDepartureTimeMin=" + travelPeriodDepartureTimeMin +
                ", travelPeriodDepartureTimeMax=" + travelPeriodDepartureTimeMax +
                ", travelPeriodReturnDate=" + travelPeriodReturnDate +
                ", travelPeriodReturnDateOffset=" + travelPeriodReturnDateOffset +
                ", travelPeriodReturnDatePreOffset=" + travelPeriodReturnDatePreOffset +
                ", travelPeriodReturnDatePostOffset=" + travelPeriodReturnDatePostOffset +
                ", travelPeriodReturnDays=" + travelPeriodReturnDays +
                ", travelPeriodReturnTimeMin=" + travelPeriodReturnTimeMin +
                ", travelPeriodReturnTimeMax=" + travelPeriodReturnTimeMax +
                ", travelPeriodDurations=" + travelPeriodDurations +
                ", flightDepartureAirportCodes=" + flightDepartureAirportCodes +
                ", flightArrivalAirportCodes=" + flightArrivalAirportCodes +
                ", flightAirlineCodes=" + flightAirlineCodes +
                ", flightStopOverMax=" + flightStopOverMax +
                ", hotelCodes=" + hotelCodes +
                ", hotelProductCodes=" + hotelProductCodes +
                ", hotelCategory=" + hotelCategory +
                ", hotelLocationCountryCodes=" + hotelLocationCountryCodes +
                ", hotelLocationRegionCodes=" + hotelLocationRegionCodes +
                ", hotelLocationCityCodes=" + hotelLocationCityCodes +
                ", hotelAttributes=" + hotelAttributes +
                ", hotelRatingCount=" + hotelRatingCount +
                ", hotelRatingOverAll=" + hotelRatingOverAll +
                ", hotelRatingTotal=" + hotelRatingTotal +
                ", hotelRatingHotel=" + hotelRatingHotel +
                ", hotelRatingLocation=" + hotelRatingLocation +
                ", hotelRatingService=" + hotelRatingService +
                ", hotelRatingCatering=" + hotelRatingCatering +
                ", hotelRatingSport=" + hotelRatingSport +
                ", hotelRatingRoom=" + hotelRatingRoom +
                ", hotelRecommendationsTotal=" + hotelRecommendationsTotal +
                ", hotelRecommendationsSingle=" + hotelRecommendationsSingle +
                ", hotelRecommendationsFamily=" + hotelRecommendationsFamily +
                ", hotelRecommendationsCouples=" + hotelRecommendationsCouples +
                ", hotelRecommendationsFriends=" + hotelRecommendationsFriends +
                ", hotelRecommendationsBeachHoliday=" + hotelRecommendationsBeachHoliday +
                ", hotelRecommendationsBusinessTrip=" + hotelRecommendationsBusinessTrip +
                ", hotelRecommendationsCityBreak=" + hotelRecommendationsCityBreak +
                ", hotelRecommendationsWellness=" + hotelRecommendationsWellness +
                ", hotelRoomCodes=" + hotelRoomCodes +
                ", hotelRoomBookingCodes=" + hotelRoomBookingCodes +
                ", hotelRoomViewCodes=" + hotelRoomViewCodes +
                ", hotelRoomAttributes=" + hotelRoomAttributes +
                ", hotelBoardCodes=" + hotelBoardCodes +
                ", extras=" + extras +
                ", priceMin=" + priceMin +
                ", priceMax=" + priceMax +
                '}';
    }
}

