package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    void givenEmptyCommandTheRoverPositionAndDirectionDoNotChange() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("");

        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals('N', rover.getDirection());
    }

    @Test
    void givenInvalidCommandTheRoverPositionAndDirectionDoNotChange() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("X");

        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals('N', rover.getDirection());
    }

    @Test
    void moveF() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("F");

        assertEquals(0, rover.getXPosition());
        assertEquals(1, rover.getYPosition());
        assertEquals('N', rover.getDirection());
    }

    @Test
    void moveB() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("B");

        assertEquals(0, rover.getXPosition());
        assertEquals(-1, rover.getYPosition());
        assertEquals('N', rover.getDirection());
    }
}
