package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    void givenEmptyCommandTheRoverPositionAndDirectionDoNotChange() {
        Rover rover = new Rover();
        assertEquals(0, rover.getXPosition());
//        assertEquals(0, rover.getYPosition());
//        assertEquals(0, rover.getDirection());
    }
}
