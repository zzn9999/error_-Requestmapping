 package cn.test;


import cn.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;


public class TestSpring {
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StudentService ss = (StudentService) ac.getBean("studentService");
        ss.testSuccess();
    }
}