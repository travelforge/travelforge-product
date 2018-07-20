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

package org.travelforge.product.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Matthias Deck
 */
public class HotelProductGroup extends ProductGroup<HotelProductGroup, HotelProduct> implements Serializable {

    private static final long serialVersionUID = 1L;

    public HotelProductGroup() {
        super();
    }

    public HotelProductGroup(Integer id, String name, Map<String, Object> properties, List<HotelProductGroup> productGroups, List<HotelProduct> products, Map<String, Object> references) {
        super(id, name, properties, productGroups, products, references);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends ProductGroup.Builder<HotelProductGroup.Builder, HotelProductGroup, HotelProduct> {

        @Override
        public HotelProductGroup build() {
            return new HotelProductGroup(id, name, properties, productGroups, products, references);
        }
    }
}
