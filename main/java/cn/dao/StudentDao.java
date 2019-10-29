package cn.dao;


import cn.entity.Student;

import java.util.List;

/**
 *
 * Dao层接口
 * getTotal  查询所有
 * addStudent 增加学生
 * updateStudent  更新学生
 * getstudent  查找学生
 */
public interface StudentDao {
    int getTotal();
    void addStudent(Student student);
    void deleteStudent(Student student);
    void updateStudent (int id );
    Student getstudent(int id );
    List<Student> list (int start , int count);

}
