package com.example.lab08;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class HasCityTest {
    @Test
    public void testHasCity() {
        CityList list = new CityList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }
}
