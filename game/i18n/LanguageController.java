package i18n;

import configuration.Config;
import model.Player;

public class LanguageController {

    private static LanguageController instance;

    private Language language;

    private LanguageController() {
        this.language = Language.ENGLISH;
    }

    public static LanguageController getInstance() {
        if (instance == null) {
            instance = new LanguageController();
        }
        return instance;
    }

    public Language getLanguage() {
        return this.language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getMessage(Message message, Player player) {
        String _message = Translation.translations.get(this.language).get(message);

        if (!_message.contains(Config.PLACEHOLDER_CHAR)) {
            return _message;
        }

        return _message.replace(Config.PLACEHOLDER_CHAR + "playerName" + Config.PLACEHOLDER_CHAR, player.getName())
                .replace(Config.PLACEHOLDER_CHAR + "playerBalance" + Config.PLACEHOLDER_CHAR,
                        Integer.toString(player.getAccount().getBalance()));
    }

}
