package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of City objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();


    /**
     * Constructs an empty CityList
     */
    public CityList() {}


    /**
     * This adds a city to the list if it does not exist
     * @param city      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * This returns a sorted list of cities
     * @return list      return the sorted list
     */
    public List<City>getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This is a function that returns true if the city is in the list and false otherwise
     * @param city          the city to check
     * @return boolean      boolean if list contains city
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }


    /**
     * This is a function that deletes a city if it exists, else throws an exception
     * @param city      city to delete
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        else {
            cities.remove(city);
        }
    }

    /**
     * This is a function that returns the number of cities in the list
     * @return count    count of cities
     */
    public int countCities() {
        return cities.size();
    }
}
