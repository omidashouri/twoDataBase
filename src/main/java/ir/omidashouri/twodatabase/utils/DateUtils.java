package ir.omidashouri.twodatabase.utils;

import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ULocale;
import lombok.extern.slf4j.Slf4j;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Najmeh Abbasi Tehrani
 */
@Slf4j
public final class DateUtils {

    public static final ULocale PERSIAN_ULOC = new ULocale("fa_IR@calendar=persian");

    public static String zonedDateTimeToTehranIso8601(ZonedDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        try {
            ZoneId tehranZone = ZoneId.of(TimeZoneId.ASIA_TEHRAN.getZoneId());
            ZonedDateTime tehranDateTime;
            if (dateTime.getZone().equals(tehranZone)) {
                tehranDateTime = dateTime;
            } else {
                tehranDateTime = dateTime.withZoneSameInstant(tehranZone);
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DatePattern.ISO_8601.toString())
                    .withZone(ZoneOffset.UTC);
            ZonedDateTime utcDateTime = tehranDateTime.withZoneSameInstant(ZoneOffset.UTC);
            return formatter.format(utcDateTime);
        } catch (DateTimeParseException e) {
            log.error("Invalid date-time string: " + dateTime, e);
            return null;
        }
    }

    public static String localDateToString(LocalDate localDate, DatePattern pattern, Locale locale) {
        if (localDate == null) {
            return null;
        }

        TimeZoneId timeZoneId = TimeZoneId.getZoneIdFromLocale(locale);
        ZoneId zoneId = timeZoneId.toZoneId();
        ZonedDateTime localZonedDateTime = localDate.atStartOfDay(zoneId);

        return zonedDateTimeToString(localZonedDateTime, pattern, locale);
    }


    public static String zonedDateTimeToString(ZonedDateTime zonedDateTime, DatePattern pattern, Locale locale) {
        if (zonedDateTime == null) {
            throw new IllegalArgumentException("ZonedDateTime could not be null");
        }

        if (LocaleUtils.PERSIAN_LANG.equals(locale.getLanguage())) {
            zonedDateTime = zonedDateTime.withZoneSameInstant(TimeZoneId.ASIA_TEHRAN.toZoneId());

            long epochMilli = zonedDateTime.toInstant().toEpochMilli();

            Calendar persianCalendar = Calendar.getInstance(PERSIAN_ULOC);
            persianCalendar.setTimeInMillis(epochMilli);

            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern.toString(), PERSIAN_ULOC);
            return convertToLatinDigits(dateFormat.format(persianCalendar));
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern.toString()).withZone(zonedDateTime.getZone());
            return formatter.format(zonedDateTime);
        }
    }

    public static ZonedDateTime localDateToStartDayOfZonedDateTime(LocalDate localDate, ZoneId zoneId) {
        if (localDate == null || zoneId == null) {
            throw new IllegalArgumentException("LocalDate and ZoneId must not be null");
        }
        return localDate.atStartOfDay(zoneId);
    }

    public static ZonedDateTime localDateToEndDayOfZonedDateTime(LocalDate localDate, ZoneId zoneId) {
        if (localDate == null || zoneId == null) {
            throw new IllegalArgumentException("LocalDate and ZoneId must not be null");
        }
        return localDate.atTime(LocalTime.MAX).atZone(zoneId);
    }


    public static String getNowTehran() {
        LocalDate localDateNow = LocalDate.now();
        DatePattern pattern = DatePattern.DATE_BY_HYPHEN_PATTERN;
        Locale locale = LocaleUtils.PERSIAN_LOCALE;
        return DateUtils.localDateToString(localDateNow, pattern, locale);
    }

    public static Date getDateForZonedDateTime(ZoneId zoneId) {
        if (zoneId == null) {
            throw new IllegalArgumentException("ZoneId must not be null");
        }
        return Date.from(ZonedDateTime.now(zoneId).toInstant());
    }

    private static String convertToLatinDigits(String persianDate) {
        if (persianDate == null || persianDate.isEmpty()) {
            return persianDate;
        }

        Map<Character, Character> persianToLatinMap = Map.of(
                '۰', '0', '۱', '1', '۲', '2', '۳', '3', '۴', '4',
                '۵', '5', '۶', '6', '۷', '7', '۸', '8', '۹', '9'
        );

        return persianDate.chars()
                .mapToObj(ch -> (char) ch)
                .map(ch -> persianToLatinMap.getOrDefault(ch, ch))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}