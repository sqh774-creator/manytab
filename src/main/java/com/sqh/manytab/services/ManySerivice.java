package com.sqh.manytab.services;

import com.sqh.manytab.entity.Course;
import com.sqh.manytab.entity.Student;

import java.util.List;

public interface ManySerivice {
    public Student findStudentById(int stuid);
    public Course findCourseById(int corid);
    public void insertCorAndStu(Student stu,Course cor);
    //删除学生 并将改学生上的所有课程都删除
    public void deleteStu(int stuid);
    //删除课程 并将所有上该门课程的素有学员信息删除
    public void deleteCor(int corid);
    //根据用户给定的学生和课程删除对应信息
    public void delStuAndCor(int stuid,int corid);
    public void updateStu(int stuid,int oldcorid,int newcorid);
    public void addSingleStuAndCor(int stuid,int corid);
}
