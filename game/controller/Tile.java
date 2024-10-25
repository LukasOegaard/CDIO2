package game.controller;

public enum Tile {
    TOWER(2), CRATER(3), PALACE_GATES(4), COLD_DESERT(5),
    WALLED_CITY(6), MONASTERY(7), BLACK_CAVE(8), HUTS_IN_THE_MOUNTAIN(9),
    THE_WEREWALL(10), THE_PIT(11), GOLDMINE(12);

    private final int value;

    Tile(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
