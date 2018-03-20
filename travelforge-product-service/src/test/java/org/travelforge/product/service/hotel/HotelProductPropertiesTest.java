package org.travelforge.product.service.hotel;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HotelProductPropertiesTest {

    @Test
    public void merge() {

        HotelProductProperties source = new HotelProductProperties();

        // TODO: implement me!

        HotelProductProperties target = new HotelProductProperties();
        target.merge(source);

        assertEquals(source, target);
    }
}