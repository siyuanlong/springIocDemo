package com.syudy.test;

import com.syudy.beans.Grade;
import com.syudy.beans.Student;
import com.syudy.controller.StuController;
import com.syudy.serviceimp.StudentServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
    springioc执行流程:
    1.导包(五个包)
    2.新建applicationContext.xml文件，文件头表明beans
    3.在配置文件里面根据java类配置bean标签
*/
/*
    注意:创建对象时，当bean标签内的scope=phrtotype或者lazy-init=true时，
    new Class..无法自动创建对象，必须通过getbean实现对象的自动创建;
*/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuController controller = (StuController)ac.getBean("controller");
        controller.controller();

        Student student = (Student)ac.getBean("student");
        System.out.println(student.getSage()+" "+student.getSid()+" "+student.getSname()+" "+student.getSsex());
        List list = student.getList();
        for (Object o : list) {
            System.out.println(o);
        }
        Map map = student.getMap();
        Set set = map.entrySet();
        for (Object o1 :set) {
            System.out.println(o1);
        }
        Grade grade = student.getGrade();
        System.out.println(grade);

        Properties properties = student.getProperties();
        System.out.println(properties);
    }
}
