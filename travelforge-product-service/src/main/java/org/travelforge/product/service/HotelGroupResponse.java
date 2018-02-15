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

import org.travelforge.product.model.HotelProductGroup;

import java.util.List;

/**
 * @author Matthias Deck
 */
public class HotelGroupResponse extends HotelResponse {

    private static final long serialVersionUID = 1L;

    private List<HotelProductGroup> productGroups;

    public HotelGroupResponse() {
    }

    public HotelGroupResponse(Context context, List<HotelProductGroup> productGroups) {
        super(context);
        this.productGroups = productGroups;
    }

    public List<HotelProductGroup> getProductGroups() {
        return productGroups;
    }

    public void setProductGroups(List<HotelProductGroup> productGroups) {
        this.productGroups = productGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        HotelGroupResponse that = (HotelGroupResponse) o;

        return productGroups != null ? productGroups.equals(that.productGroups) : that.productGroups == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (productGroups != null ? productGroups.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelGroupResponse{" +
                "context=" + getContext() +
                ", productGroups=" + productGroups +
                "}";
    }
}
