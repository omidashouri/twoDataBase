package ir.omidashouri.twodatabase.utils;

import java.util.Locale;

public abstract class LocaleUtils {
    public static final String PERSIAN = "Persian";
    public static final String PERSIAN_LANG = "fa";
    public static final Locale PERSIAN_LOCALE = new Locale("fa", "IR", "");
    public static final Locale ENGLISH_LOCALE;

    public LocaleUtils() {
    }

    public static boolean isPersian(Locale locale) {
        return locale != null && "fa".equals(locale.getLanguage());
    }

    static {
        ENGLISH_LOCALE = Locale.ENGLISH;
    }
}
