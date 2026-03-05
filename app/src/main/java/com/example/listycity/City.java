package com.example.listycity;

/**
 * This is a class that defines a single city
 */
public class City implements Comparable<Object> {
    private String city;
    private String province;


    /**
     * Constructor
     * @param city          new city
     * @param province      new province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }


    /**
     * This is a function that returns the name of the city
     * @return city
     */
    public String getCity() {
        return this.city;
    }


    /**
     * This is a function that sets the name of the city
     * @param city      city to set
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * This is a function that returns the name of the province
     * @return province name
     */
    public String getProvince() {
        return this.province;
    }


    /**
     * This is a function that sets the name of the province
     * @param province      the province
     */
    public void setProvince(String province) {
        this.province = province;
    }


    /**
     * This aids in sorting the cities by their names lexicographically
     * @param o     A City object
     * @return      negative integer, 0 or positive integer depending on if the name is
     *              lexicographically less than, equal to or greater than the specified city's
     *              name
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCity());
    }
}
