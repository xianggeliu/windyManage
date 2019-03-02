package com.windymanage.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 学生管理
 */
@RestController
@RequestMapping("/student")
public class StudentCotroller {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/getStudents")
    public List<Student> getStudentList(){
        return null;
    }

    /**
     * 根据uuid 获取学生信息
     * @return
     */
    @GetMapping("/getStudent")
    public String  getStudent(){
        return null;
    }

}
