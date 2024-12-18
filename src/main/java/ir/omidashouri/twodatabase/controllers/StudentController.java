package ir.omidashouri.twodatabase.controllers;

import ir.omidashouri.twodatabase.entity.postgres.Student;
import ir.omidashouri.twodatabase.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        Student student1 = studentService.addStudent(student);
        return student1;
    }

    @DeleteMapping("/{id}")
    public void eraseStudent(@PathVariable Long id) {
        studentService.eraseStudent(id);
    }

    @GetMapping
    public List<Student> getStudents(){
        List<Student> students = studentService.getStudents();
        return students;
    }
}
