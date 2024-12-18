package ir.omidashouri.twodatabase.repository.postgres;

import ir.omidashouri.twodatabase.entity.oracle.Person;
import ir.omidashouri.twodatabase.entity.postgres.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
