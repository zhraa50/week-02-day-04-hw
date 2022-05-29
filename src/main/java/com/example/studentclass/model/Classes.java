package com.example.studentclass.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;

public class Classes {

    @NotEmpty(message = "id is required")
    @Size(min =4 ,max=10)
    private String IDclass;
    //---------------------------------
    @NotEmpty(message = "name is required")
    private  String nameclass ;

    private ArrayList <Classes> ClassList1;


    public Classes(String IDclass, String nameclass, ArrayList<Classes> classList1) {
        this.IDclass = IDclass;
        this.nameclass = nameclass;
        this .ClassList1 = new classList1<>();
    }
}




