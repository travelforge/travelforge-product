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

package org.travelforge.product.service;

import java.util.List;

/**
 * @author Matthias Deck
 */
public interface HotelRequestAttributes {

    List<Integer> getHotelCodes();

    List<String> getHotelProductCodes();

    Float getHotelCategory();

    List<String> getHotelLocationCountryCodes();

    List<Integer> getHotelLocationRegionCodes();

    List<Integer> getHotelLocationCityCodes();

    List<String> getHotelAttributes();

    Integer getHotelRatingCount();

    Float getHotelRatingOverAll();

    Float getHotelRatingTotal();

    Float getHotelRatingHotel();

    Float getHotelRatingLocation();

    Float getHotelRatingService();

    Float getHotelRatingCatering();

    Float getHotelRatingSport();

    Float getHotelRatingRoom();

    Float getHotelRecommendationsTotal();

    Float getHotelRecommendationsSingle();

    Float getHotelRecommendationsFamily();

    Float getHotelRecommendationsCouples();

    Float getHotelRecommendationsFriends();

    Float getHotelRecommendationsBeachHoliday();

    Float getHotelRecommendationsBusinessTrip();

    Float getHotelRecommendationsCityBreak();

    Float getHotelRecommendationsWellness();

    List<String> getHotelRoomCodes();

    List<String> getHotelRoomBookingCodes();

    List<String> getHotelRoomViewCodes();

    List<String> getHotelRoomAttributes();

    List<String> getHotelBoardCodes();
}
