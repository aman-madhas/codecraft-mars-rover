package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    void emptyCommandFacingNorth() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("");

        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals('N', rover.getDirection());
    }

    @Test
    void invalidCommandFacingNorth() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("X");

        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals('N', rover.getDirection());
    }

    @Test
    void moveFFacingNorth() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("F");

        assertEquals(0, rover.getXPosition());
        assertEquals(1, rover.getYPosition());
        assertEquals('N', rover.getDirection());
    }

    @Test
    void moveBFacingNorth() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("B");

        assertEquals(0, rover.getXPosition());
        assertEquals(-1, rover.getYPosition());
        assertEquals('N', rover.getDirection());
    }

    @Test
    void moveLFacingNorth() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("L");

        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals('W', rover.getDirection());
    }

    @Test
    void moveRFacingNorth() {
        Rover rover = new Rover(0, 0, 'N');
        rover.sendCommand("R");

        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals('E', rover.getDirection());
    }

    @Test
    void emptyCommandFacingSouth() {
        Rover rover = new Rover(0, 0, 'S');
        rover.sendCommand("");

        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals('S', rover.getDirection());
    }

    @Test
    void invalidCommandFacingSouth() {
        Rover rover = new Rover(0, 0, 'S');
        rover.sendCommand("X");

        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals('S', rover.getDirection());
    }

    @Test
    void moveFFacingSouth() {
        Rover rover = new Rover(0, 0, 'S');
        rover.sendCommand("F");

        assertEquals(0, rover.getXPosition());
        assertEquals(-1, rover.getYPosition());
        assertEquals('S', rover.getDirection());
    }

    @Test
    void moveBFacingSouth() {
        Rover rover = new Rover(0, 0, 'S');
        rover.sendCommand("B");

        assertEquals(0, rover.getXPosition());
        assertEquals(1, rover.getYPosition());
        assertEquals('S', rover.getDirection());
    }

    @Test
    void moveLFacingSouth() {
        Rover rover = new Rover(0, 0, 'S');
        rover.sendCommand("L");

        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals('E', rover.getDirection());
    }
}
