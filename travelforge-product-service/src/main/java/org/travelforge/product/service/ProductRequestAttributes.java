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

/**
 * @author Matthias Deck
 */
public interface ProductRequestAttributes {
    
    List<Integer> getProductGroups();

    List<String> getTourOperatorCodes();

    Integer getTravellersAdults();

    List<Integer> getTravellersChildrenAge();

    List<LocalDate> getTravellersChildrenDateOfBirth();

    LocalDate getTravelPeriodDepartureDate();

    Integer getTravelPeriodDepartureDateOffset();

    Integer getTravelPeriodDepartureDatePreOffset();

    Integer getTravelPeriodDepartureDatePostOffset();

    List<DayOfWeek> getTravelPeriodDepartureDays();

    LocalTime getTravelPeriodDepartureTimeMin();

    LocalTime getTravelPeriodDepartureTimeMax();

    LocalDate getTravelPeriodReturnDate();

    Integer getTravelPeriodReturnDateOffset();

    Integer getTravelPeriodReturnDatePreOffset();

    Integer getTravelPeriodReturnDatePostOffset();

    List<DayOfWeek> getTravelPeriodReturnDays();

    LocalTime getTravelPeriodReturnTimeMin();

    LocalTime getTravelPeriodReturnTimeMax();

    List<Integer> getTravelPeriodDurations();

    List<String> getExtras();

    Float getPriceMin();

    Float getPriceMax();
}
