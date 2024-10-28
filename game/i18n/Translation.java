package game.i18n;

import java.util.Map;

public class Translation {
    
    public static final Map<Language, Map<Message, String>> translations = Map.ofEntries(
        Map.entry(Language.ENGLISH, Map.ofEntries(
            Map.entry(Message.ENTER_PLAYER_NAME, "Please enter your desired player name and press enter!"),
            Map.entry(Message.LANGUAGE_PROMPT, "The following languages are available: " + Language.stringValues() + ". Please enter your desired language and press enter!"),
            Map.entry(Message.CURRENT_PLAYER_BALANCE, "%playerName%'s balance is %playerBalance%"),
            Map.entry(Message.PLAYER_PRESS_TO_ROLL, "%playerName% press enter to roll the dice!"),
            Map.entry(Message.WIN, "%playerName% won the game!")
        )),
        Map.entry(Language.STUPID, Map.ofEntries(
            Map.entry(Message.ENTER_PLAYER_NAME, "enter your name and press a specific key to continue. we won't say which key though"),
            Map.entry(Message.LANGUAGE_PROMPT, "The following languages are available: " + Language.stringValues() + ". Please enter your desired language and press enter!"),
            Map.entry(Message.CURRENT_PLAYER_BALANCE, "%playerName%'s balance is %playerBalance%"),
            Map.entry(Message.PLAYER_PRESS_TO_ROLL, "%playerName% press enter to roll the dice!"),
            Map.entry(Message.WIN, "%playerName% won the game!")
        ))
    );

}
