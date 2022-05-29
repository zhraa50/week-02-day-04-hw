package com.example.studentclass.service;

import com.example.studentclass.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
@RequiredArgsConstructor
public class StudentService {

    private ArrayList<Student> students = new ArrayList();

    private final ClassService classService;
    private final TeacherService teacherService;
    private AdvisorsService advisorsService;


    //get
    public ArrayList<Student> getStudents(Student studentid, Student classlistid) {
        return students;


    }
//--------------------------------------------------
    //post
    public boolean addStudent(Student student) {

        return students.add(student) ;//.add(student);
    }

    //put---------------------------------------------
    public boolean UpdateStudent(Student student, Integer index)
    {
        if (index >= students.size() - 1)
        {
            students.set(index, student);

            return true;

        }
        return false;
    }


    //delet
    public boolean removeStudent(Integer index) {

        if (index >= students.size() - 1) {
            return false;
        }
        students.remove(index);
        return true;

    }

}
