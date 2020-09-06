package com.zc.springboot.online_exam.mail;

import cn.hutool.extra.mail.MailUtil;
import net.bytebuddy.implementation.InvokeDynamic;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class TestMail {

    @Test
    public void test(){

        for (int i = 0; i < 100; i++) {
            MailUtil.send("1016504798@qq.com", "验证码", "邮件来自deam测试，你的验证码是2556666", false);
        }

    }
}
