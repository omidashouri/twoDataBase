package ir.omidashouri.twodatabase.services;

import ir.omidashouri.twodatabase.entity.postgres.Student;
import ir.omidashouri.twodatabase.repository.postgres.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {
    
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student Student) {
        Student newStudent = new Student();
        newStudent.setName(Student.getName());
        newStudent.setAge(Student.getAge());
        Student savedStudent = studentRepository.save(Student);
        return savedStudent;
    }

    public void eraseStudent(Long id) {
        Optional<Student> Student = studentRepository.findById(id);
        Student.ifPresent(studentRepository::delete);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
