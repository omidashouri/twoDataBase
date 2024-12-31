package ir.omidashouri.twodatabase.helper;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import ir.omidashouri.twodatabase.utils.DateUtils;

import java.io.IOException;
import java.util.Date;

public class PersianDateSerializer  extends JsonSerializer<Date> {

    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value != null) {
            gen.writeString(DateUtils.getNowTehran());
        }
    }
}
