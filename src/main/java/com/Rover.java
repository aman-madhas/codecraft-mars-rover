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

    char getDirection() {
        return direction;
    }

    void sendCommand(String commands) {
        commands.chars().forEach(c -> {
            switch(c) {
                case 'F': {
                    if (direction == 'N') {
                        yPosition++;
                    }
                    break;
                }
                case 'B': {
                    if (direction == 'N') {
                        yPosition--;
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
