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

        Integer stopOverMax = 1;

        FlightProperties source1 = new PackageProductProperties();
        source1.setFlightDepartureAirportCodes(Arrays.asList("AAA", "BBB"));

        FlightProperties source2 = new PackageProductProperties();
        source2.setFlightArrivalAirportCodes(Arrays.asList("CCC", "DDD"));

        FlightProperties source3 = new PackageProductProperties();
        source3.setFlightAirlineCodes(Arrays.asList("AA", "BB", "CC"));

        FlightProperties target = new PackageProductProperties();
        target.setFlightStopOverMax(stopOverMax);

        FlightProperties.merge(target, source1, source2, source3);

        assertEquals(source1.getFlightDepartureAirportCodes(), target.getFlightDepartureAirportCodes());
        assertEquals(source2.getFlightArrivalAirportCodes(), target.getFlightArrivalAirportCodes());
        assertEquals(source3.getFlightAirlineCodes(), target.getFlightAirlineCodes());
        assertEquals(stopOverMax, target.getFlightStopOverMax());
    }

    @Test
    public void mergeOverride() {

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
}