package ir.omidashouri.twodatabase.entity.oracle;


import com.fasterxml.jackson.annotation.JsonProperty;
import ir.omidashouri.twodatabase.model.Status;
import ir.omidashouri.twodatabase.model.StatusConverter;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBL_PERSON",schema = "admin")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @SequenceGenerator(name = "person_seq", sequenceName = "TBL_PERSON_SEQ", schema = "admin", allocationSize = 1)
    private Long id;

//    CREATE SEQUENCE admin.PERSON_SEQ START WITH 1 INCREMENT BY 1;

    @JsonProperty("name")
    @Column(name = "NAME")
    private String name;

    @JsonProperty("age")
    @Column(name = "AGE")
    private Integer age;

    @Column(name = "staus")
    @Convert(converter = StatusConverter.class)
    private Status status;

    public Person() {
    }

    public Person(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
