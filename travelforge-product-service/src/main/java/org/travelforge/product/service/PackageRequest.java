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

/**
 * @author Matthias Deck
 */
public abstract class PackageRequest implements Serializable {

    private Context context;
    private RequestOptions options;
    private PackageRequestParameters parameters;

    PackageRequest() {
    }

    PackageRequest(Context context, RequestOptions options, PackageRequestParameters parameters) {
        this.context = context;
        this.options = options;
        this.parameters = parameters;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public RequestOptions getOptions() {
        return options;
    }

    public void setOptions(RequestOptions options) {
        this.options = options;
    }

    public PackageRequestParameters getParameters() {
        return parameters;
    }

    public void setParameters(PackageRequestParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageRequest that = (PackageRequest) o;

        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        return parameters != null ? parameters.equals(that.parameters) : that.parameters == null;
    }

    @Override
    public int hashCode() {
        int result = context != null ? context.hashCode() : 0;
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageRequest{" +
                "context=" + context +
                ", options=" + options +
                ", parameters=" + parameters +
                '}';
    }
}
