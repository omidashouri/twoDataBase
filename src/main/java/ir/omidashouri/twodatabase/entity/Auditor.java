package ir.omidashouri.twodatabase.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ir.omidashouri.twodatabase.helper.PersianDateSerializer;
import ir.omidashouri.twodatabase.utils.DatePattern;
import ir.omidashouri.twodatabase.utils.DateUtils;
import ir.omidashouri.twodatabase.utils.LocaleUtils;
import ir.omidashouri.twodatabase.utils.TimeZoneId;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
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

    public U getCreator() {
        return creator;
    }

    public void setCreator(U creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public U getEditor() {
        return editor;
    }

    public void setEditor(U editor) {
        this.editor = editor;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

/*    private String formatDate(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return formatter.format(date);
    }*/
}
