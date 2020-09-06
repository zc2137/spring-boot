package com.zc.springboot.online_exam;

import cn.hutool.extra.mail.MailUtil;
import com.zc.springboot.online_exam.domain.Student;
import com.zc.springboot.online_exam.mapping.IStudentMapper;
import com.zc.springboot.online_exam.service.IStudentService;
import com.zc.springboot.online_exam.service.impl.StudentServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootOnlineExamApplicationTests {

    @Test
    void contextLoads() {
        for (int i = 0; i < 100; i++) {
            MailUtil.send("2766719059@qq.com", "测试信息", "邮件来自deam测试.........please", false);
        }

    }
    @Autowired
    private SqlSession sqlSession;


    @Test
    public void mybatisTest(){
        IStudentService studentService = new StudentServiceImpl();
        List<Student> allStudent = studentService.findAllStudent();
        System.out.println(allStudent);
    }

}
