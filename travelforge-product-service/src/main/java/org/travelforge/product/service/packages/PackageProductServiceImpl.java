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

import org.travelforge.product.service.ProductServiceException;

/**
 * @author Matthias Deck
 */
final class PackageProductServiceImpl implements PackageProductService {

    private final PackageProductServiceConnector connector;

    PackageProductServiceImpl(PackageProductServiceConnector connector) {
        this.connector = connector;
    }

    @Override
    public PackageGroupResponse getPackageGroups(PackageGroupRequest request) throws ProductServiceException {
        return connector.executePackageGroupRequest(request);
    }

    @Override
    public PackageProductResponse getPackageProducts(PackageProductRequest request) throws ProductServiceException {
        return connector.executePackageProductRequest(request);
    }

    @Override
    public PackageProductResponse getPackageOffers(PackageOfferRequest request) throws ProductServiceException {
        return connector.executePackageOfferRequest(request);
    }

    @Override
    public PackageProductResponse getPackageVariants(PackageVariantRequest request) throws ProductServiceException {
        return connector.executePackageVariantRequest(request);
    }

    @Override
    public PackageProductResponse getPackageFlightAlternatives(PackageFlightAlternativeRequest request) throws ProductServiceException {
        return connector.executePackageFlightAlternativeRequest(request);
    }
}
