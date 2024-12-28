package ir.omidashouri.twodatabase.helper;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.util.PersianCalendar;
import com.ibm.icu.util.ULocale;

import java.io.IOException;
import java.util.Date;

public class PersianDateSerializer  extends JsonSerializer<Date> {

    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value != null) {
            // Convert to Persian date format using ICU4J
            PersianCalendar persianCalendar = new PersianCalendar();
            persianCalendar.setTime(value);

            DateFormat persianDateFormat = DateFormat.getDateTimeInstance(
                    DateFormat.MEDIUM, DateFormat.MEDIUM, new ULocale("fa_IR")
            );

            String formattedDate = persianDateFormat.format(persianCalendar);
            gen.writeString(formattedDate); // Write the formatted string
        }
    }
}
