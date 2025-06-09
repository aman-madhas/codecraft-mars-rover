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
                    if (direction == 'N') {
                        yPosition--;
                    } else if (direction == 'S') {
                        yPosition++;
                    }
                    break;
                }
                case 'L': {
                    if (direction == 'N') {
                        direction = 'W';
                    }
                    break;
                }
                case 'R': {
                    if (direction == 'N') {
                        direction = 'E';
                    }
                    break;
                }
            }
        });
    }
}
