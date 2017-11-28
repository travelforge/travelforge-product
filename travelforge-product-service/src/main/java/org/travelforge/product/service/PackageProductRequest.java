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

/**
 * @author Matthias Deck
 */
public class PackageProductRequest extends PackageRequest implements Pageable {

    private static final long serialVersionUID = 1L;

    private Pagination pagination;

    public PackageProductRequest() {
    }

    public PackageProductRequest(Context context, RequestOptions options, PackageRequestParameters parameters, Pagination pagination) {
        super(context, options, parameters);
        this.pagination = pagination;
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

        PackageProductRequest that = (PackageProductRequest) o;

        return pagination != null ? pagination.equals(that.pagination) : that.pagination == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pagination != null ? pagination.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageProductRequest{" +
                "context=" + getContext() +
                ", options=" + getOptions() +
                ", parameters=" + getParameters() +
                ", pagination=" + pagination +
                '}';
    }
}
