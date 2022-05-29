package com.example.studentclass.controller;

import com.example.studentclass.model.Api;
import com.example.studentclass.model.Advisor;
import com.example.studentclass.service.AdvisorsService;
import lombok.RequiredArgsConstructor;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/advisore")
@RequiredArgsConstructor

public class advisorsComtroller {

    private ArrayList<Advisor> advisors = new ArrayList();


    private final AdvisorsService advisorsServic;;

    @GetMapping
    public ResponseEntity<Object> getAdvisor()
    {

        return ResponseEntity.status(200).body(advisorsServic.getAdvisor());
    }

    //-add------------------------------------------------------------------
    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody @Valid Advisor advisor, Errors errors) {
        if (errors.hasErrors()) {


            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(message);
        }

        boolean isAdded = advisorsServic.addAdvisor(advisor);

        if (!isAdded) {
            return ResponseEntity.status(400).body("Server error !");

        }
        return ResponseEntity.status(200).body("New advisore  added !");

    }


    //----update--------------------------------------------------------------------
    @PutMapping({"/index ,student"})
    public ResponseEntity<Api> updateStudent(@RequestBody Advisor advisor,
                                             @PathVariable Integer index) {
        boolean isUpdat = advisorsServic.UpdateAdvisor(advisor, index);
        if (!isUpdat) {
            return ResponseEntity.status(500).body(new Api("Error adding a student", 500));

        }
        return ResponseEntity.status(200).body(new Api("New advisor  added", 200));
    }

    //  ----delete----------------------------------------------------------
    @DeleteMapping({"/index"})

    public ResponseEntity<Api> deleteStudent(@PathVariable Integer index) {
        boolean isDeleted = advisorsServic.removeAdvisore(index);

        if (!isDeleted) {
            return ResponseEntity.status(500).body(new Api("Error DELET a student", 500));

        }
        return ResponseEntity.status(200).body(new Api("New student  DELET", 200));
    }}

