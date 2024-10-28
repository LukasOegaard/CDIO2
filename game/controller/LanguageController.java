package game.controller;

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

    public void setLanguange(Language language) {
        this.language = language;
    }

}
