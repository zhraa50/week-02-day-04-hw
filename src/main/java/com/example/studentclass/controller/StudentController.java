package com.example.studentclass.controller;

import com.example.studentclass.model.Api;
import com.example.studentclass.model.Student;
import com.example.studentclass.service.StudentService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor

public class StudentController {
    //-------------------------------------------------------------
    private ArrayList<Student> students = new ArrayList();


    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<ArrayList<Student>> getStudents()
    {
        return ResponseEntity.status(200).body(studentService.getStudents(studentid, classlistid));
    }

    //-add------------------------------------------------------------------
    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody @Valid Student student, Errors errors) {
        if (errors.hasErrors()) {


            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(message);
        }

        boolean isAdded = studentService.addStudent(student);

        if (!isAdded) {
            return ResponseEntity.status(400).body("Server error !");

        }
        return ResponseEntity.status(200).body("New STUDENT  added !");

    }


    //----update--------------------------------------------------------------------
    @PutMapping({"/index ,student"})
    public ResponseEntity<Api> updateStudent(@RequestBody Student student,
                                             @PathVariable Integer index) {
        boolean isUpdat = studentService.UpdateStudent(student, index);
        if (!isUpdat) {
            return ResponseEntity.status(500).body(new Api("Error adding a student", 500));

        }
        return ResponseEntity.status(200).body(new Api("New student  added", 200));
    }

    //  ----delete----------------------------------------------------------
    @DeleteMapping({"/index"})

       public ResponseEntity<Api> deleteStudent(@PathVariable Integer index) {
        boolean isDeleted = studentService.removeStudent(index);

        if (!isDeleted) {
            return ResponseEntity.status(500).body(new Api("Error DELET a student", 500));

        }
        return ResponseEntity.status(200).body(new Api("New student  DELET", 200));
    }}









