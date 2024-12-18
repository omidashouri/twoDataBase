package ir.omidashouri.twodatabase.entity.postgres;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "TBL_STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;
}
