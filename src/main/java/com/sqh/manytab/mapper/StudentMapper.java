package com.sqh.manytab.mapper;

import com.sqh.manytab.entity.Student;

public interface StudentMapper {
    public Student findById(int stuid);
    public void modStu(Student stu);
    public void delStu(int stuid);
    public void addStu(Student stu);
}
