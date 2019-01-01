package com.syudy.serviceimp;

import com.syudy.daoimp.StudentDaoImp;
import com.syudy.service.StudentService;

public class StudentServiceImp implements StudentService {
    private StudentDaoImp studentDaoImp;
    @Override
    public void stu() {
        studentDaoImp.stuTest01();
        System.out.println("执行了service层、、、");
    }

    public StudentDaoImp getStudentDaoImp() {
        return studentDaoImp;
    }

    public void setStudentDaoImp(StudentDaoImp studentDaoImp) {
        System.out.println("创建了dao对象、、、");
        this.studentDaoImp = studentDaoImp;
    }
}
