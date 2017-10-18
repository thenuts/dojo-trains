package com.thoughtworks.trains;

import org.junit.Test;

public class RouteTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionIfTheStartingAndAndEndingTownIsTheSame() {

        Route route = new Route();

        char startingTown = 'A';
        char endingTown = 'A';

        route.calculateDistance(startingTown, endingTown);
    }

    
}
