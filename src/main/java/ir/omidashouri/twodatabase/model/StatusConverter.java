package ir.omidashouri.twodatabase.model;

import jakarta.persistence.AttributeConverter;

public class StatusConverter  implements AttributeConverter<Status, Long> {
    @Override
    public Long convertToDatabaseColumn(Status attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getCode();
    }

    @Override
    public Status convertToEntityAttribute(Long dbData) {
        if (dbData == null) {
            return null;
        }
        return Status.getStatusByCode(dbData);
    }
}
