package com.example.studentclass.service;

import com.example.studentclass.model.Classes;
import com.example.studentclass.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
@RequiredArgsConstructor
public class ClassService {

    private static ArrayList<Classes> ClassList = new ArrayList<>();
    private final StudentService studentService;
    private final TeacherService teacherService;
    private AdvisorsService advisorsService;


//---------------------------------------get class

    public ArrayList<Classes> getClassList() {
        return ClassList;


    }


    //---------------------------------post
    public boolean addClass(Classes class1) {
        return ClassList.add(class1);

    }

    //-----------------------------put
    public boolean UpdateClass(Integer num, Classes class1) {
        if (num >= ClassList.size() - 1) {
            ClassList.set(num, class1);
            return true;
        }
        return false;

    }


    public static boolean removclass(Integer index) {
        if (index >= ClassList.size() - 1) {
            return false;

        }
        ClassList.remove(index);
        return true;
    }
}

    //--------------------------------------------



