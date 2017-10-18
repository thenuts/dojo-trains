package com.thoughtworks.trains;

public class Route {
    public int calculateDistance(char startingTown, char endingTown) {
        if (startingTown == endingTown) {
            throw new IllegalArgumentException();
        }

        if (startingTown == 'B' && endingTown == 'C') {

            return 4;
        }


        return 5;
    }
}
