package cn.service;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Override
    public void testSuccess() {
        System.out.println("success   "+new Date());
    }
}
