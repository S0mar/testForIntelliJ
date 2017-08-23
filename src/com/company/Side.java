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

    public boolean isOneColor() {
        int temp = tiles[0][0].getColor();

        for (Tile[] tiles : tiles) {
            for (Tile tile : tiles) {
                if(temp != tile.getColor()) {
                    return false;
                }
            }
        }
        return true;
    }

    public Tile[][] getTiles() {
        return this.tiles;
    }

    public void setTile(int x, int y, int color) {
        this.tiles[x][y].setColor(color);
    }

    public Tile getTile(int x, int y) {
        return this.tiles[x][y];
    }
}
