package com.zc.springboot.online_exam.Controller;

import com.zc.springboot.online_exam.domain.Student;
import com.zc.springboot.online_exam.mapping.IStudentMapper;
import com.zc.springboot.online_exam.service.IStudentService;
import com.zc.springboot.online_exam.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTMLDocument;
import java.util.List;

@RestController
@RequestMapping("/student")
public class UserController {

    @Autowired
    private IStudentService studentService;


    @RequestMapping("/findAll")
    public List<Student> findAllStudent(){
        List<Student> allStudent = studentService.findAllStudent();
        return allStudent;
    }

}
