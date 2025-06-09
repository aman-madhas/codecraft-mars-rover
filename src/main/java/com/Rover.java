package com;

public class Rover {

    int xPosition;
    int yPosition;
    char direction;

    public Rover(int x, int y, char d) {
        xPosition = x;
        yPosition = y;
        direction = d;
    }

    int getXPosition() {
        return xPosition;
    }

    int getYPosition() {
        return yPosition;
    }

    void sendCommand(String commands) {

    }
}
