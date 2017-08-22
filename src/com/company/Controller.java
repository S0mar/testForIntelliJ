package com.company;

import java.util.Random;

public class Controller {

    //shuffle
    //etc
    private Cube cube;

    public Controller(int cubeSize) {
        this.cube = new Cube(cubeSize);
    }

    public void shuffle(int turns) {
        Random r = new Random();
        for(int i = 0; i < turns; i++) {
            cube.turnClocwise(r.nextInt());
        }
    }

    public String getSide(int side) {
        String returnString = "side: " + side + "\n";

        Side returnSide = cube.getSide(side);

        for (int i = 0; i < cube.getSize(); i++) {
            for (int j = 0; j < cube.getSize(); j++) {
                returnString += returnSide.getTile(i,j).getColor();
            }
            returnString += "\n";
        }
        return returnString.trim();
    }
}
