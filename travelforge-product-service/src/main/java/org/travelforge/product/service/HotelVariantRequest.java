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
public class HotelVariantRequest extends HotelRequest implements Pageable {

    private static final long serialVersionUID = 1L;

    private List<String> variants;
    private Pagination pagination;

    public HotelVariantRequest() {
        super();
    }

    public HotelVariantRequest(Context context, RequestOptions options, HotelRequestParameters parameters, List<String> variants, Pagination pagination) {
        super(context, options, parameters);
        this.variants = variants;
        this.pagination = pagination;
    }

    public List<String> getVariants() {
        return variants;
    }

    public void setVariants(List<String> variants) {
        this.variants = variants;
    }

    @Override
    public Pagination getPagination() {
        return pagination;
    }

    @Override
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        HotelVariantRequest that = (HotelVariantRequest) o;

        if (variants != null ? !variants.equals(that.variants) : that.variants != null) return false;
        return pagination != null ? pagination.equals(that.pagination) : that.pagination == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (variants != null ? variants.hashCode() : 0);
        result = 31 * result + (pagination != null ? pagination.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelVariantRequest{" +
                "context=" + getContext() +
                ", options=" + getOptions() +
                ", parameters=" + getParameters() +
                ", variants=" + variants +
                ", pagination=" + pagination +
                '}';
    }
}
