package com;

public class Rover {

    private int xPosition;
    private int yPosition;
    private char direction;
    private RoverMover roverMover;

    public Rover(int x, int y, char d) {
        xPosition = x;
        yPosition = y;
        direction = d;
        roverMover = new RoverMover();
    }

    int getXPosition() {
        return xPosition;
    }

    int getYPosition() {
        return yPosition;
    }

    char getDirection() {
        return direction;
    }

    void sendCommand(String commands) {
        commands.chars().forEach(c -> {
            switch(c) {
                case 'F': {
                    yPosition = roverMover.moveForward(yPosition, direction);
                    break;
                }
                case 'B': {
                    yPosition = roverMover.moveBackward(yPosition, direction);
                    break;
                }
                case 'L': {
                    direction = roverMover.moveLeft(direction);
                    break;
                }
                case 'R': {
                    direction = roverMover.moveRight(direction);
                    break;
                }
            }
        });
    }
}
