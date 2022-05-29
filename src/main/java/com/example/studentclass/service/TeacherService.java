package com.example.studentclass.service;

import com.example.studentclass.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
@RequiredArgsConstructor
public class TeacherService {

    private ArrayList<Teacher> teachers = new ArrayList();
    private final StudentService studentService;
    private final ClassService classService;
    private AdvisorsService advisorsService;


    public ArrayList<Teacher> getTeacher() {
        return teachers;

    }

    public boolean addTeacher(Teacher teacher) {
        return teachers.add(teacher);
    }

    public boolean UpdateTechar(Teacher teacher, Integer index) {
        if (index >= teachers.size() - 1)
        {
            teachers.set(index, teacher);

            return true;

        }
        return false;
    }

    public boolean removeTeacher(Integer index) {
        if (index >= teachers.size() - 1) {
            return false;
        }
        teachers.remove(index);
        return true;


    }
}
