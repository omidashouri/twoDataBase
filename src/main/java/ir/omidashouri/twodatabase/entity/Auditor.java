package ir.omidashouri.twodatabase.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ir.omidashouri.twodatabase.helper.PersianDateSerializer;
import ir.omidashouri.twodatabase.utils.DateUtils;
import ir.omidashouri.twodatabase.utils.TimeZoneId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Auditor<U> {

    @Column(name = "creator", updatable = false)
    @CreatedBy
    protected U creator;

    @Column(name = "create_date", updatable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonSerialize(using = PersianDateSerializer.class)
    protected Date createDate;

    @Column(name = "editor")
    @LastModifiedBy
    protected U editor;

    @Column(name = "edit_date")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonSerialize(using = PersianDateSerializer.class)
    protected Date editDate;

    @PrePersist
    protected void onCreate() {
        createDate = DateUtils.getDateForZonedDateTime(TimeZoneId.ASIA_TEHRAN.toZoneId());
    }

    @PreUpdate
    protected void onUpdate() {
        editDate = DateUtils.getDateForZonedDateTime(TimeZoneId.ASIA_TEHRAN.toZoneId());
    }

/*    private String formatDate(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return formatter.format(date);
    }*/
}
