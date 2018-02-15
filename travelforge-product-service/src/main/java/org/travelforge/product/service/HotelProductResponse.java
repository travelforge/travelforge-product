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

import org.travelforge.product.model.HotelProduct;

import java.util.List;

/**
 * @author Matthias Deck
 */
public class HotelProductResponse extends HotelResponse {

    private static final long serialVersionUID = 1L;

    private PageInfo pageInfo;
    private List<HotelProduct> products;

    public HotelProductResponse() {
    }

    public HotelProductResponse(Context context, PageInfo pageInfo, List<HotelProduct> products) {
        super(context);
        this.pageInfo = pageInfo;
        this.products = products;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<HotelProduct> getProducts() {
        return products;
    }

    public void setProducts(List<HotelProduct> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        HotelProductResponse that = (HotelProductResponse) o;

        if (pageInfo != null ? !pageInfo.equals(that.pageInfo) : that.pageInfo != null) return false;
        return products != null ? products.equals(that.products) : that.products == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pageInfo != null ? pageInfo.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelProductResponse{" +
                "context=" + getContext() +
                ", pageInfo=" + pageInfo +
                ", products=" + products +
                "}";
    }
}
