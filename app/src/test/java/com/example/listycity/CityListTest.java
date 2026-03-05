package com.example.listycity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CityListTest {
    /**
     * This makes a mock list for cities
     * @return      mock list of cities
     */
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    
    private City mockCity() {
        return new City("Islamabad", "ICT");
    }
    
    @Test
    void testadd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City city = new City("Karachi", "Sindh");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());

        assertTrue(cityList.getCities().contains(city));
    }


    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Peshawar", "KPK");
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }


    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        City city = new City("Quetta", "Balochistan");
        cityList.add(city);

        // After sorting, Islamabad (I) should come before Peshawar (P)
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        assertEquals(0, city.compareTo(cityList.getCities().get(1)));
    }


    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        City city = new City("Lahore", "Punjab");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));

        City city2 = new City("Abbottabad", "KPK");
        assertFalse(cityList.hasCity(city2));
    }

    @Test
    void testDelete() {
        CityList cityList = mockCityList();
        City city = new City("Bahawalpur", "Punjab");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));

        cityList.delete(city);
        assertTrue(!cityList.hasCity(city));

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city);
        });
    }

    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        City city1 = new City("Sahiwal", "Punjab");
        City city2 = new City("Mardan", "KPK");

        cityList.add(city1);
        cityList.add(city2);
        assertEquals(3, cityList.countCities());
    }
}
