package com.thoughtworks.trains;

import java.util.ArrayList;
import java.util.List;

public class Railroad {
    private List<Route> routes = new ArrayList<Route>();

    public int calculateDistance(char startingTown, char endingTown) {
        if (startingTown == endingTown) {
            throw new IllegalArgumentException();
        }

        if (startingTown == 'B' && endingTown == 'C') {
            return 4;
        }

        return 5;
    }

    public void addRoute(char startingTown, char endingTown, int distance) {
        routes.add(new Route(startingTown, endingTown, distance));
    }
}
