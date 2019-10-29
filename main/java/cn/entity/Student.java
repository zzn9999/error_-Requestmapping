package cn.entity;


import java.util.Date;

/**
 * 学生实体类
 *
 */
public class Student {

    private int id;
    private int student_id;
    private String name;
    private int age;
    private String sex;
    private Date birthdays;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdays() {
        return birthdays;
    }

    public void setBirthdays(Date birthdays) {
        this.birthdays = birthdays;
    }


}
