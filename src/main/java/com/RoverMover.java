package com;

public class RoverMover {

    int moveForward(int yPosition, char direction) {
        if (direction == 'N') {
            return yPosition+1;
        } else if (direction == 'S') {
            return yPosition-1;
        }
        return yPosition;
    }

    int moveBackward(int yPosition, char direction) {
        if (direction == 'N') {
            return yPosition-1;
        } else if (direction == 'S') {
            return yPosition+1;
        }
        return yPosition;
    }

    char moveLeft(char direction) {
        if (direction == 'N') {
            return 'W';
        } else if (direction == 'S') {
            return 'E';
        }
        return direction;
    }
}
