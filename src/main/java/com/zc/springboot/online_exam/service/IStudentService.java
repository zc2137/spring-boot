package com.zc.springboot.online_exam.service;

import com.zc.springboot.online_exam.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {



    /**
     * 查询所以学生的方法
     * @return
     */
    List<Student> findAllStudent();
}
