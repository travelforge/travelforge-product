package org.travelforge.product.service;

import org.junit.Test;
import org.travelforge.product.service.packages.PackageProductProperties;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class ProductPropertiesTest {

    @Test
    public void merge() {

        Float priceMin = 1000F;

        ProductProperties source1 = new PackageProductProperties();
        source1.setTravellersAdults(2);

        ProductProperties source2 = new PackageProductProperties();
        source2.setTravelPeriodDurations(Arrays.asList(6,7,8));

        ProductProperties source3 = new PackageProductProperties();
        source3.setExtras(Arrays.asList("A", "B", "C"));

        ProductProperties target = new PackageProductProperties();
        target.setPriceMin(priceMin);

        ProductProperties.merge(target, source1, source2, source3);

        assertEquals(source1.getTravellersAdults(), target.getTravellersAdults());
        assertEquals(source2.getTravelPeriodDurations(), target.getTravelPeriodDurations());
        assertEquals(source3.getExtras(), target.getExtras());
        assertEquals(priceMin, target.getPriceMin());
    }

    @Test
    public void mergeOverride() {

        ProductProperties source1 = new PackageProductProperties();
        source1.setTravelPeriodDurations(Arrays.asList(4,5));

        ProductProperties source2 = new PackageProductProperties();
        source2.setTravelPeriodDurations(Arrays.asList(6,7,8));

        ProductProperties source3 = new PackageProductProperties();
        source3.setTravelPeriodDurations(Arrays.asList(13,14,15));

        ProductProperties target = new PackageProductProperties();

        ProductProperties.merge(target, source1, source2, source3);

        assertEquals(source3.getTravelPeriodDurations(), target.getTravelPeriodDurations());
    }

    @Test
    public void mergeProductGroups() {

        ProductProperties source = new PackageProductProperties();
        source.setProductGroups(Arrays.asList(1,2,3,4,5));
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getProductGroups(), target.getProductGroups());
        assertNotSame(source.getProductGroups(), target.getProductGroups());
    }

    @Test
    public void mergeTourOperatorCodes() {

        ProductProperties source = new PackageProductProperties();
        source.setTourOperatorCodes(Arrays.asList("A","B","C"));
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTourOperatorCodes(), target.getTourOperatorCodes());
        assertNotSame(source.getTourOperatorCodes(), target.getTourOperatorCodes());
    }

    @Test
    public void mergeTravellersAdults() {

        ProductProperties source = new PackageProductProperties();
        source.setTravellersAdults(2);
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravellersAdults(), target.getTravellersAdults());
    }

    @Test
    public void mergeTravellersChildrenAge() {

        ProductProperties source = new PackageProductProperties();
        source.setTravellersChildrenAge(Arrays.asList(5,7));
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravellersChildrenAge(), target.getTravellersChildrenAge());
        assertNotSame(source.getTravellersChildrenAge(), target.getTravellersChildrenAge());
    }

    @Test
    public void mergeTravellersChildrenDateOfBirth() {

        ProductProperties source = new PackageProductProperties();
        source.setTravellersChildrenDateOfBirth(Collections.singletonList(LocalDate.now()));
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravellersChildrenDateOfBirth(), target.getTravellersChildrenDateOfBirth());
        assertNotSame(source.getTravellersChildrenDateOfBirth(), target.getTravellersChildrenDateOfBirth());
    }

    @Test
    public void mergeTravelPeriodDepartureDate() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodDepartureDate(LocalDate.now());
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodDepartureDate(), target.getTravelPeriodDepartureDate());
    }

    @Test
    public void mergeTravelPeriodDepartureDateOffset() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodDepartureDateOffset(1);
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodDepartureDateOffset(), target.getTravelPeriodDepartureDateOffset());
    }


    @Test
    public void mergeTravelPeriodDepartureDatePreOffset() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodDepartureDatePreOffset(1);
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodDepartureDatePreOffset(), target.getTravelPeriodDepartureDatePreOffset());
    }

    @Test
    public void mergeTravelPeriodDepartureDatePostOffset() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodDepartureDatePostOffset(1);
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodDepartureDatePostOffset(), target.getTravelPeriodDepartureDatePostOffset());
    }

    @Test
    public void mergeTravelPeriodDepartureDays() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodDepartureDays(Arrays.asList(DayOfWeek.SUNDAY, DayOfWeek.MONDAY));
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodDepartureDays(), target.getTravelPeriodDepartureDays());
        assertNotSame(source.getTravelPeriodDepartureDays(), target.getTravelPeriodDepartureDays());
    }

    @Test
    public void mergeTravelPeriodDepartureTimeMin() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodDepartureTimeMin(LocalTime.now());
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodDepartureTimeMin(), target.getTravelPeriodDepartureTimeMin());
    }

    @Test
    public void mergeTravelPeriodDepartureTimeMax() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodDepartureTimeMax(LocalTime.now());
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodDepartureTimeMax(), target.getTravelPeriodDepartureTimeMax());
    }

    @Test
    public void mergeTravelPeriodReturnDate() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodReturnDate(LocalDate.now());
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodReturnDate(), target.getTravelPeriodReturnDate());
    }

    @Test
    public void mergeTravelPeriodReturnDateOffset() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodReturnDateOffset(1);
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodReturnDateOffset(), target.getTravelPeriodReturnDateOffset());
    }

    @Test
    public void mergeTravelPeriodReturnDatePreOffset() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodReturnDatePreOffset(1);
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodReturnDatePreOffset(), target.getTravelPeriodReturnDatePreOffset());
    }

    @Test
    public void mergeTravelPeriodReturnDatePostOffset() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodReturnDatePostOffset(1);
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodReturnDatePostOffset(), target.getTravelPeriodReturnDatePostOffset());
    }

    @Test
    public void mergeTravelPeriodReturnDays() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodReturnDays(Arrays.asList(DayOfWeek.SUNDAY, DayOfWeek.MONDAY));
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodReturnDays(), target.getTravelPeriodReturnDays());
        assertNotSame(source.getTravelPeriodReturnDays(), target.getTravelPeriodReturnDays());
    }

    @Test
    public void mergeTravelPeriodReturnTimeMin() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodReturnTimeMin(LocalTime.now());
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodReturnTimeMin(), target.getTravelPeriodReturnTimeMin());
    }


    @Test
    public void mergeTravelPeriodReturnTimeMax() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodReturnTimeMax(LocalTime.now());
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodReturnTimeMax(), target.getTravelPeriodReturnTimeMax());
    }

    @Test
    public void mergeTravelPeriodDurations() {

        ProductProperties source = new PackageProductProperties();
        source.setTravelPeriodDurations(Arrays.asList(6,7,8));
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getTravelPeriodDurations(), target.getTravelPeriodDurations());
        assertNotSame(source.getTravelPeriodDurations(), target.getTravelPeriodDurations());
    }

    @Test
    public void mergeExtras() {

        ProductProperties source = new PackageProductProperties();
        source.setExtras(Arrays.asList("A","B","C"));
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getExtras(), target.getExtras());
        assertNotSame(source.getExtras(), target.getExtras());
    }

    @Test
    public void mergePriceMin() {

        ProductProperties source = new PackageProductProperties();
        source.setPriceMin(100F);
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getPriceMin(), target.getPriceMin());
    }

    @Test
    public void mergePriceMax() {

        ProductProperties source = new PackageProductProperties();
        source.setPriceMax(100F);
        ProductProperties target = new PackageProductProperties();
        ProductProperties.merge(target, source);
        assertEquals(source, target);
        assertEquals(source.getPriceMax(), target.getPriceMax());
    }
}