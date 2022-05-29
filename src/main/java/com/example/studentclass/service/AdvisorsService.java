package com.example.studentclass.service;

import com.example.studentclass.model.Advisor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
@RequiredArgsConstructor

public class AdvisorsService {


    //--------------------------
    private ArrayList<Advisor> advisors = new ArrayList();

    private final StudentService studentService;
    private final ClassService classService;
    private final TeacherService teacherService;

    public  ArrayList<Advisor>getAdvisor() {
        return advisors;

    }
//-------------------------------------post
    public boolean addAdvisor(  Advisor advisor) {
        return advisors.add(advisor) ;//.add


    }

    public boolean UpdateAdvisor(Advisor advisor, Integer index)
    {
        if (index >= advisors.size() - 1)
        {
            advisors.set(index, advisor);

            return true;

        }
        return false;


    }


    public boolean removeAdvisore(Integer index) {
        if (index >= advisors.size() - 1) {
            return false;
        }
        advisors.remove(index);
        return true;

    }
    }



