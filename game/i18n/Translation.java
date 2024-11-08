package game.i18n;

import java.util.Map;

public class Translation {

    public static final Map<Language, Map<Message, String>> translations = Map.ofEntries(
            Map.entry(Language.ENGLISH, Map.ofEntries(
                    Map.entry(Message.ENTER_PLAYER_NAME, "Please enter your desired player name and press enter!"),
                    Map.entry(Message.LANGUAGE_PROMPT,
                            "The following languages are available: " + Language.stringValues()
                                    + ". Please enter your desired language and press enter!"),
                    Map.entry(Message.CURRENT_PLAYER_BALANCE, "%playerName%'s balance is %playerBalance%"),
                    Map.entry(Message.PLAYER_PRESS_TO_ROLL, "%playerName% press enter to roll the dice!"),
                    Map.entry(Message.PLAYER_NAME_UNIQUE_CONSTRAINT_VIOLATION,
                            "A player with that name is already in the game, closing game!"),
                    Map.entry(Message.PLAYER_NAME_ILLEGAl_CHAR, "Player name cannot contain %, closing game!"),
                    Map.entry(Message.WIN, "%playerName% won the game!"),
                    Map.entry(Message.TILE_TOWER, "%playerName% has entered the Tower and found 250 gold pieces!"),
                    Map.entry(Message.TILE_CRATER,
                            "%playerName% fell into a meteor crater and the aliens living there stole 100 gold pieces before you could get away."),
                    Map.entry(Message.TILE_PALACE_GATES,
                            "%playerName% inspected the dead Knight outside the Palace Gate and found 100 gold pieces."),
                    Map.entry(Message.TILE_COLD_DESERT,
                            "You had to rest in the Cold Desert to survive the night. You bought some firewood for 20 gold pieces from a wondering merchant."),
                    Map.entry(Message.TILE_WALLED_CITY,
                            "Crazy lunatics were throwing all their gold of from the Wall. %playerName% managed to gather 180 gold pieces from the ground."),
                    Map.entry(Message.TILE_MONASTARY, "%playerName% entered the monastery."),
                    Map.entry(Message.TILE_BLACK_CAVE,
                            "%playerName% while you went through the black cave you dropped some gold and couldn't find it again due to the dense darkness. You lost 70 gold pieces."),
                    Map.entry(Message.TILE_HUTS_IN_THE_MOUNTAIN,
                            "%playerName% killed a ugly gnome and took 60 gold pieces."),
                    Map.entry(Message.TILE_THE_WEREWALL,
                            "%playerName% walked into the infamous WEREWALL you got so scared you tossed 80 gold pieces in different direction but you got ENERGIZED and moved on"),
                    Map.entry(Message.TILE_THE_PIT,
                            "%playerName% fell into the Pit while counting your gold and dropped 50 gold pieces that fell down a crevice"),
                    Map.entry(Message.TILE_GOLDMINE,
                            "%playerName% you found the rumored abandoned goldmine and found 650 gold pieces.")

            )),
            Map.entry(Language.STUPID, Map.ofEntries(
                    Map.entry(Message.ENTER_PLAYER_NAME,
                            "enter your name and press a specific key to continue. we won't say which key though"),
                    Map.entry(Message.LANGUAGE_PROMPT,
                            "The following languages are available: " + Language.stringValues()
                                    + ". Please enter your desired language and press enter!"),
                    Map.entry(Message.CURRENT_PLAYER_BALANCE, "%playerName%'s balance is %playerBalance%"),
                    Map.entry(Message.PLAYER_PRESS_TO_ROLL, "%playerName% press enter to roll the dice!"),
                    Map.entry(Message.WIN, "%playerName% won the game!"),
                    Map.entry(Message.PLAYER_NAME_UNIQUE_CONSTRAINT_VIOLATION,
                            "A player with that name is already in the game, closing game!"),
                    Map.entry(Message.PLAYER_NAME_ILLEGAl_CHAR, "Player name cannot contain %, closing game!"),
                    Map.entry(Message.TILE_TOWER, "%playerName% has entered the Tower and found 250 gold pieces!"),
                    Map.entry(Message.TILE_CRATER,
                            "%playerName% fell into a meteor crater and the aliens living there stole 100 gold pieces before you could get away."),
                    Map.entry(Message.TILE_PALACE_GATES,
                            "%playerName% inspected the dead Knight outside the Palace Gate and found 100 gold pieces."),
                    Map.entry(Message.TILE_COLD_DESERT,
                            "You had to rest in the Cold Desert to survive the night. You bought some firewood for 20 gold pieces from a wondering merchant."),
                    Map.entry(Message.TILE_WALLED_CITY,
                            "Crazy lunatics were throwing all their gold of from the Wall. %playerName% managed to gather 180 gold pieces from the ground."),
                    Map.entry(Message.TILE_MONASTARY, "%playerName% entered the monastery."),
                    Map.entry(Message.TILE_BLACK_CAVE,
                            "%playerName% while you went through the black cave you dropped some gold and couldn't find it again due to the dense darkness. You lost 70 gold pieces."),
                    Map.entry(Message.TILE_HUTS_IN_THE_MOUNTAIN,
                            "%playerName% killed a ugly gnome and took 60 gold pieces."),
                    Map.entry(Message.TILE_THE_WEREWALL,
                            "%playerName% walked into the infamous WEREWALL you got so scared you tossed 80 gold pieces in different direction but you got ENERGIZED and moved on"),
                    Map.entry(Message.TILE_THE_PIT,
                            "%playerName% fell into the Pit while counting your gold and dropped 50 pieces that fell down a crevice"),
                    Map.entry(Message.TILE_GOLDMINE,
                            "%playerName% you found the rumored abandoned goldmine and found 650 gold pieces.")

            )));

}
