package com.thoughtworks.trains;

import org.junit.Assert;
import org.junit.Test;

public class RouteTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionIfTheStartingAndAndEndingTownIsTheSame() {

        Route route = new Route();

        char startingTown = 'A';
        char endingTown = 'A';

        route.calculateDistance(startingTown, endingTown);
    }

    @Test
    public void shouldReturnFiveCalculatingDistanceBetweenAandB() {

        Route route = new Route();

        char startingTown = 'A';
        char endingTown = 'B';

        int distance = route.calculateDistance(startingTown, endingTown);

        Assert.assertEquals(5, distance);
    }

    @Test
    public void shouldReturnFourCalculatingDistanceBetweenBandC() {
        Route route = new Route();

        char startingTown = 'B';
        char endingTown = 'C';

        int distance = route.calculateDistance(startingTown, endingTown);

        Assert.assertEquals(4, distance);
    }
}
