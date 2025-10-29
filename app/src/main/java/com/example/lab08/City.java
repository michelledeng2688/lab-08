package com.example.lab08;

// add a comment
public class City implements Comparable<City>{
    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    public String getCityName(){
        return this.city;
    }

    public String getProvinceName(){
        return this.province;
    }

    // To make "contains" work properly in tests
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City cityObj = (City) o;
        return this.city.equals(cityObj.city)
                && this.province.equals(cityObj.province);
    }

    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}
