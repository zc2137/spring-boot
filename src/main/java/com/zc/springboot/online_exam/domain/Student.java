package com.zc.springboot.online_exam.domain;

import lombok.Data;

@Data
public class Student {

    //账号ID
    private Integer ID;
    //用户名
    private String username;
    //密码
    private String password;
    //性别
    private char sex;
    //年龄
    private short age;
    //学号
    private Integer studentID;
    //姓名
    private Integer studentName;
    //班级
    private Integer studentClass;
    //学校
    private String studentSchool;
    //院系
    private String studentDepartment;
    //专业
    private String studentSpeciality;
    //学生邮箱
    private String studentEmail;
    //学生账号的状态 0代表异常  1代表可用
    private byte studentAccountState;
}
