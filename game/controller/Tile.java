package game.controller;

public enum Tile {
    TOWER("Tower", 2, 250, false),
    CRATER("Crater", 3, -100, false),
    PALACE_GATES("Palace gates", 4, 100, false),
    COLD_DESERT("Cold desert", 5, -20, false),
    WALLED_CITY("Walled city", 6, 180, false),
    MONASTERY("Monastery", 7, 0, false),
    BLACK_CAVE("Black cave", 8, -70, false),
    HUTS_IN_THE_MOUNTAIN("Huts in the mountain", 9, 60, false),
    THE_WEREWALL("The Werewall", 10, -80, true),
    THE_PIT("The pit", 11, -50, false),
    GOLDMINE("Goldmine", 12, 650, false);

    private final String name;
    private final int value;
    private final int scoreConsequence;
    private final boolean grantsExtraTurn;

    Tile(String name, int value, int scoreConsequence, boolean grantsExtraTurn) {
        this.name = name;
        this.value = value;
        this.scoreConsequence = scoreConsequence;
        this.grantsExtraTurn = grantsExtraTurn;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public int getConsequence() {
        return this.scoreConsequence;
    }

    public boolean grantsExtraTurn() {
        return this.grantsExtraTurn;
    }

}
