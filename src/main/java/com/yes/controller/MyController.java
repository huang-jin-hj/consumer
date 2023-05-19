package com.yes.controller;

import com.hjhsf.HJHSFConsumer;
import com.provider.dto.Student;
import com.provider.hsfclient.Provider;
import com.provider.vo.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangJin on 2023/5/19.
 */
@RestController
public class MyController {

    @HJHSFConsumer
    Provider provider;
    @RequestMapping("/hello")
    public Teacher hello(){
        Student student = new Student();
        student.setAge(23);
        student.setName("黄金");
        return provider.test(student);
    }
}
