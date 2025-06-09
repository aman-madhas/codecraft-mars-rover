1. Ignore empty instruction
2. Ignore invalid instruction



You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing.
The rover receives a character array of commands. - assumption: execute movement in order of commands left to right "FBLR"
Implement commands that move the rover forward/backward (f,b).
Implement commands that turn the rover left/right (l,r).


1. Given an initial starting point and direction, the current position and direction is known
2. Given an initial starting point 0, 0 and direction N
   When empty command, then current position should be 0, 0 and direction is N
2. Given an initial starting point 0, 0 and direction N
   When command is "X", then current position should be 0, 0 and direction is N
2. Given an initial starting point 0, 0 and direction N
   When command is F, then current position should be 0, 1 and direction is N

| Initial starting point | Initial direction | Commands | Current position | Current direction |
|------------------------|-------------------|----------|------------------|-------------------|
| 0, 0                   | N                 | <EMPTY>  | 0, 0             | N                 |
| 0, 0                   | N                 | X        | 0, 0             | N                 |
| 0, 0                   | N                 | F        | 0, 1             | N                 |
| 0, 0                   | N                 | B        | 0, -1            | N                 |
| 0, 0                   | N                 | L        | 0, 0             | W                 |
| 0, 0                   | N                 | R        | 0, 0             | E                 |
| 0, 0                   | S                 | <EMPTY>  | 0, 0             | S                 |
| 0, 0                   | S                 | X        | 0, 0             | S                 |
| 0, 0                   | S                 | F        | 0, -1            | S                 |
| 0, 0                   | S                 | B        | 0, 1             | S                 |
| 0, 0                   | S                 | L        | 0, 0             | E                 |
| 0, 0                   | S                 | R        | 0, 0             | W                 |
| 0, 0                   | N                 | XJ       | 0, 0             | N                 |
# mutiple commands
# change direction: E, W



