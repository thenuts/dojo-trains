package com.thoughtworks.trains;

public class Route {

    private char startingTown;
    private char endingTown;
    private int distance;

    public Route(char startingTown, char endingTown, int distance) {
        this.startingTown = startingTown;
        this.endingTown = endingTown;
        this.distance = distance;
    }
}
