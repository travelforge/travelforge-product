package org.travelforge.product.service;

import org.junit.Test;
import org.travelforge.product.service.packages.PackageProductProperties;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HotelPropertiesTest {

    @Test
    public void merge() {

        Float hotelCategory = 4.5F;

        HotelProperties source1 = new PackageProductProperties();
        source1.setHotelCodes(Arrays.asList(1,2,3));

        HotelProperties source2 = new PackageProductProperties();
        source2.setHotelProductCodes(Arrays.asList("A","B","C"));

        HotelProperties source3 = new PackageProductProperties();
        source3.setHotelAttributes(Arrays.asList("AAA","BBB","CCC"));

        HotelProperties target = new PackageProductProperties();
        target.setHotelCategory(hotelCategory);

        HotelProperties.merge(target, source1, source2, source3);

        assertEquals(source1.getHotelCodes(), target.getHotelCodes());
        assertEquals(source2.getHotelProductCodes(), target.getHotelProductCodes());
        assertEquals(source3.getHotelAttributes(), target.getHotelAttributes());
        assertEquals(hotelCategory, target.getHotelCategory());
    }

    @Test
    public void mergeOverride() {

        HotelProperties source1 = new PackageProductProperties();
        source1.setHotelProductCodes(Arrays.asList("A","B","C"));

        HotelProperties source2 = new PackageProductProperties();
        source2.setHotelProductCodes(Arrays.asList("AA","BB","CC"));

        HotelProperties source3 = new PackageProductProperties();
        source3.setHotelProductCodes(Arrays.asList("AAA","BBB","CCC"));

        HotelProperties target = new PackageProductProperties();

        HotelProperties.merge(target, source1, source2, source3);

        assertEquals(source3.getHotelProductCodes(), target.getHotelProductCodes());
    }


}