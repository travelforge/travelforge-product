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

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Matthias Deck
 */
public class RequestOptions extends LinkedHashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public RequestOptions() {
    }

    public RequestOptions(Map<? extends String, ?> map) {
        super(map);
    }

    public RequestOptions merge(RequestOptions other) {

        Map<String, Object> options = new LinkedHashMap<>();
        options.putAll(this);
        options.putAll(other);
        options.values().removeIf(Objects::isNull);
        return new RequestOptions(options);
    }

    @Override
    public String toString() {
        return "RequestOptions" + super.toString();
    }
}
