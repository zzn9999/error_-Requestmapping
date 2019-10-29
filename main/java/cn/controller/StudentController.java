package cn.controller;

import cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class StudentController {
    private void print(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("类加载");
        }
    }

    @RequestMapping("findAll")
    public  String findAll(){
        System.out.println("查询所有信息");
        return "list";
    }

    @RequestMapping("account/findAll")
    public String findAll_1(Model model){  //存数据， Model对象
        System.out.println("Controller表现层：查询所有账户...");
        return "list";
    }

}




