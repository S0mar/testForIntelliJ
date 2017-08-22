package com.company;

public class Side {

    private Tile[][] tiles;

    public Side(int size, int color) {
        Tile[][] tiles = new Tile[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tiles[i][j] = new Tile(color);
            }
        }

        this.tiles = tiles;
    }

    public Side(Tile[][] tiles) {
        this.tiles = tiles;
    }

    public Tile[][] getTiles() {
        return this.tiles;
    }

    public Tile getTile(int x, int y) {
        return this.tiles[x][y];
    }
}
