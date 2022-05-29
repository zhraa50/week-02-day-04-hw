package com.example.studentclass.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;

public class Student {
    @NotEmpty(message = "id is required")
    @Size(min =4 ,max=10)
    private String ID;
    //---------------------------------
    @NotEmpty(message = "name is required")
    @Pattern(regexp = "(?=.[a-z])(?=.[A-Z])" ,message = "only word ")
    private  String name ;
    //------------------------------------------------
    @NotEmpty(message = "age is required")

    private Integer age ;
    //--------------------------------------------
    @NotEmpty(message = "age is required")
    @Pattern(regexp = "(?=.[a-z])(?=.[A-Z])" ,message = "only word ")

    private  String advisorName;
    //-----------------------------------
    @NotEmpty(message = "class is required")

    private ArrayList <Class> classListid;
//----------------------------------------

  @NotEmpty(message = "major is required")
  private String  major;



}
