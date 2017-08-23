package rubix.logic;

import java.util.Random;

public class Controller {


    private Cube cube;

    public Controller(int cubeSize) {
        this.cube = new Cube(cubeSize);
    }

    public String shuffle(int turns) {
        Random r = new Random();
        for (int i = 0; i < turns; i++) {
            cube.turnClocwise(r.nextInt());
        }
        return "shuffled " + turns + " times";
    }

    public String cubeIsSolved() {
        return this.cube.isSolved() ? "is solved" : "is not solved";
    }

    public String getSideAsString(int side) {
        String returnString = "side: " + side + "\n";

        Side returnSide = cube.getSide(side);

        for (int i = 0; i < cube.getSize(); i++) {
            for (int j = 0; j < cube.getSize(); j++) {
                returnString += returnSide.getTile(i, j).getColor();
            }
            returnString += "\n";
        }
        return returnString.trim();
    }

    public String turnSide(int side, boolean clockwise) {
        if (clockwise) {
            cube.turnClocwise(side);
        } else {
            cube.turnClocwise(side);
            cube.turnClocwise(side);
            cube.turnClocwise(side);
            cube.turnClocwise(side);
        }

        return "side " + side + " turned " + (clockwise ? "clockwise" : "counterclockwise") + "\n" + this.getSideAsString(side);
    }

    public String resetCube() {
        //TODO asasasas
        int size = this.cube.getSize();
        this.cube = new Cube(size);
        return "cube has been reset";
    }

    public String newCube(int size) {
        this.cube = new Cube(size);
        return "new cube with size " + size;
    }
}
