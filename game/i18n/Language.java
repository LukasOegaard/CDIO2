package game.i18n;

public enum Language {
    ENGLISH("english"), STUPID("stupid");

    private String name;

    private Language(String name) {
        this.name = name;
    }

    private String getName() {
        return this.name;
    }

    public static String stringValues() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Language.values().length; i++) {
            sb.append(Language.values()[i].getName());
            if (i < Language.values().length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
