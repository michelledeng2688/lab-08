package com.example.lab08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CountCityTest {
    @Test
    void testCountCities() {
        CityList cityList = new CityList();
        cityList.addCity(new City("Edmonton", "AB"));
        cityList.addCity(new City("Calgary", "AB"));
        assertEquals(2, cityList.countCities());
    }
}
