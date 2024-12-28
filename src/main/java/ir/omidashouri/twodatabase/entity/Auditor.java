package ir.omidashouri.twodatabase.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import ir.omidashouri.twodatabase.helper.PersianDateSerializer;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

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
        createDate = Date.from(getNowTehran().toInstant());
    }

    @PreUpdate
    protected void onUpdate() {
        editDate = Date.from(getNowTehran().toInstant());
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

    private static ZonedDateTime getNowTehran() {
//        ZoneId tehranZone = ZoneId.of("Asia/Tehran");
//        return ZonedDateTime.now(tehranZone);
        ZoneOffset tehranOffset = ZoneOffset.ofHoursMinutes(3, 30);
        return ZonedDateTime.now(tehranOffset);
    }

/*    private String formatDate(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return formatter.format(date);
    }*/
}
