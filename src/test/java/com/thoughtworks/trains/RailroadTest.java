package com.thoughtworks.trains;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RailroadTest {

    private Railroad railroad = new Railroad();

    @Test(expected=IllegalArgumentException.class)
    public void shouldReturnExceptionIfTheStartingAndAndEndingTownIsTheSame() {
        char startingTown = 'A';
        char endingTown = 'A';

        railroad.calculateDistance(startingTown, endingTown);
    }

    @Test
    public void shouldReturnFiveCalculatingDistanceBetweenAandB() {
        char startingTown = 'A';
        char endingTown = 'B';
        int distance = 5;

        railroad.addRoute(startingTown, endingTown, distance);

        int calculatedDistance = railroad.calculateDistance(startingTown, endingTown);

        assertEquals(5, calculatedDistance);
    }

    @Test
    public void shouldReturnFourCalculatingDistanceBetweenBandC() {
        char startingTown = 'B';
        char endingTown = 'C';
        int distance = 4;

        railroad.addRoute(startingTown, endingTown, distance);

        int calculatedDistance = railroad.calculateDistance(startingTown, endingTown);

        assertEquals(4, calculatedDistance);
    }
}
