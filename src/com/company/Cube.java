package com.company;

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
    }

    public void turnClocwise(int side) {
        //TODO
        //turnClocwise clockwise
    }

    public Side getSide(int side) {
        return this.sides[side];
    }

    public int getSize() {
        return this.size;
    }

    public boolean isSolved() {
        //TODO
        return false;
    }
    //etc
}
