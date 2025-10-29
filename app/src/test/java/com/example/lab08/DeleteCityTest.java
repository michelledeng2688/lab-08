package com.example.lab08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DeleteCityTest {
    @Test
    public void testDeleteCity() {
        CityList cityList = new CityList();
        City city = new City("Calgary", "AB");
        cityList.addCity(city);
        // Will fail initially
        cityList.deleteCity(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testDeleteNonexistentCityThrowsException() {
        CityList cityList = new CityList();
        City city = new City("Vancouver", "BC");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.deleteCity(city);
        });
    }
}
