package com.zc.springboot.online_exam.service.impl;

import com.zc.springboot.online_exam.domain.Student;
import com.zc.springboot.online_exam.mapping.IStudentMapper;
import com.zc.springboot.online_exam.service.IStudentService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentMapper studentMapper = null;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    @Cacheable(value = "UserInfoList", keyGenerator = "simpleKeyGenerator")
    public List<Student> findAllStudent() {
        System.out.println("查询数据库");
        return studentMapper.findAllStudent();
    }
}
