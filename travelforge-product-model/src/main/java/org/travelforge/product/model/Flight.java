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

package org.travelforge.product.model;

import java.io.Serializable;

/**
 * @author Matthias Deck
 */
public class Flight implements Serializable {

    private static final long serialVersionUID = 1L;

    private String provider;
    private OutboundFlight outbound;
    private InboundFlight inbound;

    public Flight() {
    }

    public Flight(String provider, OutboundFlight outbound, InboundFlight inbound) {
        this.provider = provider;
        this.outbound = outbound;
        this.inbound = inbound;
    }

    public static Builder builder() {
        return new Builder<>();
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public OutboundFlight getOutbound() {
        return outbound;
    }

    public void setOutbound(OutboundFlight outbound) {
        this.outbound = outbound;
    }

    public InboundFlight getInbound() {
        return inbound;
    }

    public void setInbound(InboundFlight inbound) {
        this.inbound = inbound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (provider != null ? !provider.equals(flight.provider) : flight.provider != null) return false;
        if (outbound != null ? !outbound.equals(flight.outbound) : flight.outbound != null) return false;
        return inbound != null ? inbound.equals(flight.inbound) : flight.inbound == null;
    }

    @Override
    public int hashCode() {
        int result = provider != null ? provider.hashCode() : 0;
        result = 31 * result + (outbound != null ? outbound.hashCode() : 0);
        result = 31 * result + (inbound != null ? inbound.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "provider='" + provider + '\'' +
                ", outbound=" + outbound +
                ", inbound=" + inbound +
                '}';
    }

    public static class Builder<T_BUILDER extends Builder, T_FLIGHT extends Flight> {

        protected String provider;
        protected OutboundFlight outbound;
        protected InboundFlight inbound;

        protected Builder() {
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER provider(String provider) {
            this.provider = provider;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER outbound(OutboundFlight outbound) {
            this.outbound = outbound;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_BUILDER inbound(InboundFlight inbound) {
            this.inbound = inbound;
            return (T_BUILDER) this;
        }

        @SuppressWarnings("unchecked")
        public T_FLIGHT build() {
            return (T_FLIGHT) new Flight(provider, outbound, inbound);
        }
    }
}
