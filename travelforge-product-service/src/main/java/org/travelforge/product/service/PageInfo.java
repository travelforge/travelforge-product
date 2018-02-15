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

/**
 * @author Matthias Deck
 */
public class PageInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer resultsFrom;
    private Integer resultsPerPage;
    private Integer resultsTotal;

    public PageInfo() {
    }

    public PageInfo(Integer resultsFrom, Integer resultsPerPage, Integer resultsTotal) {
        this.resultsFrom = resultsFrom;
        this.resultsPerPage = resultsPerPage;
        this.resultsTotal = resultsTotal;
    }

    public Integer getResultsFrom() {
        return resultsFrom;
    }

    public void setResultsFrom(Integer resultsFrom) {
        this.resultsFrom = resultsFrom;
    }

    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public Integer getResultsTotal() {
        return resultsTotal;
    }

    public void setResultsTotal(Integer resultsTotal) {
        this.resultsTotal = resultsTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PageInfo pageInfo = (PageInfo) o;

        if (resultsFrom != null ? !resultsFrom.equals(pageInfo.resultsFrom) : pageInfo.resultsFrom != null)
            return false;
        if (resultsPerPage != null ? !resultsPerPage.equals(pageInfo.resultsPerPage) : pageInfo.resultsPerPage != null)
            return false;
        return resultsTotal != null ? resultsTotal.equals(pageInfo.resultsTotal) : pageInfo.resultsTotal == null;
    }

    @Override
    public int hashCode() {
        int result = resultsFrom != null ? resultsFrom.hashCode() : 0;
        result = 31 * result + (resultsPerPage != null ? resultsPerPage.hashCode() : 0);
        result = 31 * result + (resultsTotal != null ? resultsTotal.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "resultsFrom=" + resultsFrom +
                ", resultsPerPage=" + resultsPerPage +
                ", resultsTotal=" + resultsTotal +
                '}';
    }
}
