package org.travelforge.product.service;

import org.junit.Test;
import org.travelforge.product.service.packages.PackageProductProperties;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class FlightPropertiesTest {

    @Test
    public void merge() {

        /*
            FLIGHT_PROVIDERS
            FLIGHT_DEPARTURE_AIRPORT_CODES
            FLIGHT_ARRIVAL_AIRPORT_CODES
            FLIGHT_AIRLINE_CODES
            FLIGHT_STOP_OVER_MAX
            FLIGHT_CLASS
            FLIGHT_BOOKING_CLASSES
            FLIGHT_DISTANCE_MIN
            FLIGHT_DISTANCE_MAX
            FLIGHT_DURATION_MIN
            FLIGHT_DURATION_MAX
            FLIGHT_OUTBOUND_FLIGHT_IDS
            FLIGHT_INBOUND_FLIGHT_IDS
            FLIGHT_OUTBOUND_FLIGHT_CODES
            FLIGHT_INBOUND_FLIGHT_CODES
        */

        FlightProperties source1 = new PackageProductProperties();
        source1.setFlightDepartureAirportCodes(Arrays.asList("AAA", "BBB"));

        FlightProperties source2 = new PackageProductProperties();
        source2.setFlightArrivalAirportCodes(Arrays.asList("CCC", "DDD"));

        FlightProperties source3 = new PackageProductProperties();
        source3.setFlightAirlineCodes(Arrays.asList("AA", "BB", "CC"));

        FlightProperties source4 = new PackageProductProperties();
        source4.setFlightStopOverMax(1);

        FlightProperties target = new PackageProductProperties();

        FlightProperties.merge(target, source1, source2, source3, source4);

        assertEquals(source1.getFlightDepartureAirportCodes(), target.getFlightDepartureAirportCodes());
        assertEquals(source2.getFlightArrivalAirportCodes(), target.getFlightArrivalAirportCodes());
        assertEquals(source3.getFlightAirlineCodes(), target.getFlightAirlineCodes());
        assertEquals(source4.getFlightStopOverMax(), target.getFlightStopOverMax());
    }

    @Test
    public void mergeOverride() {

        /*
            FLIGHT_PROVIDERS
            FLIGHT_DEPARTURE_AIRPORT_CODES
            FLIGHT_ARRIVAL_AIRPORT_CODES
            FLIGHT_AIRLINE_CODES
            FLIGHT_STOP_OVER_MAX
            FLIGHT_CLASS
            FLIGHT_BOOKING_CLASSES
            FLIGHT_DISTANCE_MIN
            FLIGHT_DISTANCE_MAX
            FLIGHT_DURATION_MIN
            FLIGHT_DURATION_MAX
            FLIGHT_OUTBOUND_FLIGHT_IDS
            FLIGHT_INBOUND_FLIGHT_IDS
            FLIGHT_OUTBOUND_FLIGHT_CODES
            FLIGHT_INBOUND_FLIGHT_CODES
        */

        FlightProperties source1 = new PackageProductProperties();
        source1.setFlightDepartureAirportCodes(Collections.singletonList("AAA"));

        FlightProperties source2 = new PackageProductProperties();
        source2.setFlightDepartureAirportCodes(Collections.singletonList("BBB"));

        FlightProperties source3 = new PackageProductProperties();
        source3.setFlightDepartureAirportCodes(Collections.singletonList("CCC"));

        FlightProperties target = new PackageProductProperties();

        FlightProperties.merge(target, source1, source2, source3);

        assertEquals(source3.getFlightDepartureAirportCodes(), target.getFlightDepartureAirportCodes());
    }

    @Test
    public void mergeFlightProviders() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightProviders(Arrays.asList("AAA", "BBB"));
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightProviders(), target.getFlightProviders());
        assertNotSame(source.getFlightProviders(), target.getFlightProviders());
    }

    @Test
    public void mergeFlightDepartureAirportCodes() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightDepartureAirportCodes(Arrays.asList("AAA", "BBB"));
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightDepartureAirportCodes(), target.getFlightDepartureAirportCodes());
        assertNotSame(source.getFlightDepartureAirportCodes(), target.getFlightDepartureAirportCodes());
    }

    @Test
    public void mergeFlightArrivalAirportCodes() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightArrivalAirportCodes(Arrays.asList("AAA", "BBB"));
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightArrivalAirportCodes(), target.getFlightArrivalAirportCodes());
        assertNotSame(source.getFlightArrivalAirportCodes(), target.getFlightArrivalAirportCodes());
    }

    @Test
    public void mergeFlightAirlineCodes() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightAirlineCodes(Arrays.asList("AA", "BB"));
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightAirlineCodes(), target.getFlightAirlineCodes());
        assertNotSame(source.getFlightAirlineCodes(), target.getFlightAirlineCodes());
    }

    @Test
    public void mergeFlightStopOverMax() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightStopOverMax(1);
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightStopOverMax(), target.getFlightStopOverMax());
    }


    @Test
    public void mergeFlightClass() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightClass("economy");
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightClass(), target.getFlightClass());
    }

    @Test
    public void mergeFlightBookingClasses() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightBookingClasses(Arrays.asList("AA", "BB"));
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightBookingClasses(), target.getFlightBookingClasses());
        assertNotSame(source.getFlightBookingClasses(), target.getFlightBookingClasses());
    }

    @Test
    public void mergeFlightDistanceMin() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightDistanceMin(100);
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightDistanceMin(), target.getFlightDistanceMin());
    }

    @Test
    public void mergeFlightDistanceMax() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightDistanceMax(100);
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightDistanceMax(), target.getFlightDistanceMax());
    }

    @Test
    public void mergeFlightDurationMin() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightDurationMin(100);
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightDurationMin(), target.getFlightDurationMin());
    }

    @Test
    public void mergeFlightDurationMax() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightDurationMax(100);
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightDurationMax(), target.getFlightDurationMax());
    }

    @Test
    public void mergeFlightOutboundFlightIds() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightOutboundFlightIds(Arrays.asList("AA", "BB"));
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightOutboundFlightIds(), target.getFlightOutboundFlightIds());
        assertNotSame(source.getFlightOutboundFlightIds(), target.getFlightOutboundFlightIds());
    }

    @Test
    public void mergeFlightInboundFlightIds() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightInboundFlightIds(Arrays.asList("AA", "BB"));
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightInboundFlightIds(), target.getFlightInboundFlightIds());
        assertNotSame(source.getFlightInboundFlightIds(), target.getFlightInboundFlightIds());
    }

    @Test
    public void mergeFlightOutboundFlightCodes() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightOutboundFlightCodes(Arrays.asList("AA", "BB"));
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightOutboundFlightCodes(), target.getFlightOutboundFlightCodes());
        assertNotSame(source.getFlightOutboundFlightCodes(), target.getFlightOutboundFlightCodes());
    }

    @Test
    public void mergeFlightInboundFlightCodes() {

        FlightProperties source = new PackageProductProperties();
        source.setFlightInboundFlightCodes(Arrays.asList("AA", "BB"));
        FlightProperties target = new PackageProductProperties();
        FlightProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getFlightInboundFlightCodes(), target.getFlightInboundFlightCodes());
        assertNotSame(source.getFlightInboundFlightCodes(), target.getFlightInboundFlightCodes());
    }
}