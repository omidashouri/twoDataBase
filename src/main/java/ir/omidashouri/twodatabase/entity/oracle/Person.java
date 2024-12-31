package ir.omidashouri.twodatabase.entity.oracle;


import com.fasterxml.jackson.annotation.JsonProperty;
import ir.omidashouri.twodatabase.entity.Auditor;
import ir.omidashouri.twodatabase.model.Status;
import ir.omidashouri.twodatabase.model.StatusConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import validators.AgeValidation;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "TBL_PERSON",schema = "admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person extends Auditor<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @SequenceGenerator(name = "person_seq", sequenceName = "TBL_PERSON_SEQ", schema = "admin", allocationSize = 1)
    private Long id;

//    CREATE SEQUENCE admin.PERSON_SEQ START WITH 1 INCREMENT BY 1;

    @JsonProperty("name")
    @Column(name = "NAME")
    private String name;

    @AgeValidation(message = "Value must be greater than 15")
    @JsonProperty("age")
    @Column(name = "AGE")
    private Integer age;

    @Column(name = "staus")
    @Convert(converter = StatusConverter.class)
    private Status status;

}
