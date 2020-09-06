package com.zc.springboot.online_exam.mapping;


import com.zc.springboot.online_exam.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IStudentMapper {

    @Select( "select * from student" )
    @Results (
        @Result(id = true ,column = "id" ,property = "ID")
    )
    public List<Student> findAllStudent();
}
