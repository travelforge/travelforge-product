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

import java.io.Serializable;
import java.util.List;

/**
 * @author Matthias Deck
 */
public class Pagination implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer offset;
    private Integer limit;
    private List<String> sorting;

    public Pagination() {
    }

    public Pagination(Integer offset, Integer limit, List<String> sorting) {
        this.offset = offset;
        this.limit = limit;
        this.sorting = sorting;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public List<String> getSorting() {
        return sorting;
    }

    public void setSorting(List<String> sorting) {
        this.sorting = sorting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pagination that = (Pagination) o;

        if (offset != null ? !offset.equals(that.offset) : that.offset != null) return false;
        if (limit != null ? !limit.equals(that.limit) : that.limit != null) return false;
        return sorting != null ? sorting.equals(that.sorting) : that.sorting == null;
    }

    @Override
    public int hashCode() {
        int result = offset != null ? offset.hashCode() : 0;
        result = 31 * result + (limit != null ? limit.hashCode() : 0);
        result = 31 * result + (sorting != null ? sorting.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "offset=" + offset +
                ", limit=" + limit +
                ", sorting=" + sorting +
                '}';
    }
}
