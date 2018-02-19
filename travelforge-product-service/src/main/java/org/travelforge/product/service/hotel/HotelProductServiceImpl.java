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

package org.travelforge.product.service.hotel;

import org.travelforge.product.service.ProductServiceException;

/**
 * @author Matthias Deck
 */
final class HotelProductServiceImpl implements HotelProductService {

    private final HotelProductServiceConnector connector;

    HotelProductServiceImpl(HotelProductServiceConnector connector) {
        this.connector = connector;
    }

    @Override
    public HotelGroupResponse getHotelGroups(HotelGroupRequest request) throws ProductServiceException {
        return connector.executeHotelGroupRequest(request);
    }

    @Override
    public HotelProductResponse getHotelProducts(HotelProductRequest request) throws ProductServiceException {
        return connector.executeHotelProductRequest(request);
    }

    @Override
    public HotelProductResponse getHotelOffers(HotelOfferRequest request) throws ProductServiceException {
        return connector.executeHotelOfferRequest(request);
    }

    @Override
    public HotelProductResponse getHotelVariants(HotelVariantRequest request) throws ProductServiceException {
        return connector.executeHotelVariantRequest(request);
    }
}
