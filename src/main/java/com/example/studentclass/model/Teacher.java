package com.example.studentclass.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;

public class Teacher {
    @NotEmpty(message = "id is required")
    @Size(min =4 ,max=10)
    private String IDTeacher ;
    //---------------------------------
    @NotEmpty(message = "name is required")
    @Pattern(regexp = "(?=.[a-z])(?=.[A-Z])" ,message = "only word ")
    private  String nameTeacher  ;
    //------------------------------------------------

    @NotEmpty(message = "class is required")

    private ArrayList<Class> classListTeacher ;

}
