package com.example.studentclass.controller;

import com.example.studentclass.model.Api;
import com.example.studentclass.model.Classes;
import com.example.studentclass.model.Student;
import com.example.studentclass.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;


@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/student")


public class ClasssController {
    //-------------------------------------------
    private ArrayList<Classes> ClassList = new ArrayList();

    private final ClassService classService;


    @GetMapping
    public ResponseEntity<ArrayList<Classes>> getClassList() {
        return ResponseEntity.status(200).body(classService.getClassList());
    }

    //-add------------------------------------------------------------------
    @PostMapping
    public ResponseEntity<String> addClass(@RequestBody @Valid Classes class1, Errors errors) {
        if (errors.hasErrors()) {


            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(message);
        }
        boolean isAdded = classService.addClass(class1);


        if (!isAdded) {
            return ResponseEntity.status(400).body("Server error !");

        }
        return ResponseEntity.status(200).body("New STUDENT  added !");

    }


    //----update--------------------------------------------------------------------
    @PutMapping({"/index .class"})

    public ResponseEntity<Api> updateClass(@RequestBody Integer num, @PathVariable Classes class1) {
        boolean isUpdat = classService.UpdateClass(num, class1);

        if (!isUpdat) {
            return ResponseEntity.status(500).body(new Api("Error adding a class", 500));

        }
        return ResponseEntity.status(200).body(new Api("New student  class", 200));
    }

    //  ----delete----------------------------------------------------------
    @DeleteMapping({"/index"})

    public ResponseEntity<Api> deleteStudent(@PathVariable Integer index) {
        boolean isDeleted = classService.removclass(index);

        if (!isDeleted) {

            return ResponseEntity.status(500).body(new Api("Error DELET a class", 200));

        }

        return ResponseEntity.status(200).body(new Api("New class  DELET", 200));

    }

}