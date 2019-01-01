package com.syudy.controller;

import com.syudy.serviceimp.StudentServiceImp;

public class StuController {
    private StudentServiceImp studentServiceImp;

    public void controller(){
        studentServiceImp.stu();
        System.out.println("执行了controller层、、、");
    }

    public StudentServiceImp getStudentServiceImp() {
        return studentServiceImp;
    }

    public void setStudentServiceImp(StudentServiceImp studentServiceImp) {
        this.studentServiceImp = studentServiceImp;
        System.out.println("创建了service对象、、、");
    }
}
