package org.launchcode;
import java.util.ArrayList;


public class PlanetsArrayList {
    public static void main(String[] args) {

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");

        for (String planet : planets) {
            System.out.println(planet);
        }

        System.out.println(planets.size());
        System.out.println(planets.contains("Mars"));
        System.out.println(planets.indexOf("Venus"));
    }
}
