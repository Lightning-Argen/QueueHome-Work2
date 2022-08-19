package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<City> set = new TreeSet<>();
        City city1 = new City(77, "Moscow");
        City city2 = new City(1571, "Illinois");
        City city3 = new City(9, "Japan");
        set.add(city1);
        set.add(city2);
        set.add(city3);

        for (City a : set) {
            if (a.getCode() %2 == 1) {
                System.out.println(a);
            }
        }
    }
}