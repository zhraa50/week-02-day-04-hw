package com.example.studentclass.controller;

import com.example.studentclass.model.Api;
import com.example.studentclass.model.Teacher;
import com.example.studentclass.service.TeacherService;
import lombok.RequiredArgsConstructor;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
@RestController
@RequestMapping("api/v1/techers")
@RequiredArgsConstructor

public class TeachersController {


    //-------------------------------------------------------------
    private ArrayList<Teacher> teachers = new ArrayList();


    private final TeacherService teacherService;


    @GetMapping
    public ResponseEntity<ArrayList<Teacher>> getTeachers()
    {
        return ResponseEntity.status(200).body(teacherService.getTeacher());

    }

    //-add------------------------------------------------------------------
    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody @Valid
                                                 Teacher teacher, Errors errors)

    {
        if (errors.hasErrors()) {


            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(message);
        }

        boolean isAdded = teacherService.addTeacher(teacher);

        if (!isAdded) {
            return ResponseEntity.status(400).body("Server error !");

        }
        return ResponseEntity.status(200).body("New teacher  added !");

    }


    //----update--------------------------------------------------------------------
    @PutMapping({"/index ,techer"})
    public ResponseEntity<Api> updateStudent(@RequestBody Teacher teacher,
                                             @PathVariable Integer index) {
        boolean isUpdat = teacherService.UpdateTechar(teacher, index);
        if (!isUpdat) {
            return ResponseEntity.status(500).body(new Api("Error adding a student", 500));

        }
        return ResponseEntity.status(200).body(new Api("New student  added", 200));
    }

    //  ----delete----------------------------------------------------------
    @DeleteMapping({"/index"})

    public ResponseEntity<Api> deleteStudent(@PathVariable Integer index) {
        boolean isDeleted = teacherService.removeTeacher(index);

        if (!isDeleted) {
            return ResponseEntity.status(500).body(new Api("Error DELET a student", 500));

        }
        return ResponseEntity.status(200).body(new Api("New student  DELET", 200));
    }}





