package rubix.logic;

import rubix.logic.Side;

public class Cube {

    public static int NUMSIDES = 6;

    private int size;

    /*
     sides
        4
      0 1 2 3
        5
     */
    private Side[] sides;

    public Cube(int size) {

        Side[] sides = new Side[NUMSIDES];

        for (int i = 0; i < NUMSIDES; i++) {
            //i is also color
            sides[i] = new Side(size, i);
        }
        this.sides = sides;
        this.size = size;
    }

    public void turnClocwise(int side) {
        //TODO

        //turn face
        //  temp copy
        //  two for loops
        //turn sides
        //  copy the correct strip of tiles
        //  set strip for new tile
    }

    public Side getSide(int side) {
        return this.sides[side];
    }

    public int getSize() {
        return this.size;
    }

    public boolean isSolved() {
        for (Side side : sides) {
            if(!side.isOneColor()) {
                return false;
            }
        }
        return true;
    }
//etc
}
