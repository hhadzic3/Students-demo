package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public void registerNewStudent (@RequestBody Student student) {
        studentService.addNewStudent(student);
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent (@PathVariable("studentId") Long Id){
        studentService.deleteStudent(Id);
    }

    @PutMapping(path = "{studentId}")
    public void updateStundent (
        @PathVariable("studentId") Long Id,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String email) {
        studentService.updateStudent(Id, name, email);
    }
}
