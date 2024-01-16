package com.sqh.manytab.controller;


import com.sqh.manytab.entity.Course;
import com.sqh.manytab.entity.Student;
import com.sqh.manytab.services.ManySerivice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/many")
public class StuCtrl {
    @Resource
    private ManySerivice manySerivice;
    /**
     * 按照学生编号 查询学生同时查询该学生的多门课程
     * @param stuid
     * @return
     */
    @RequestMapping("/findStudents")
    public Student findStu(int stuid){
        return manySerivice.findStudentById(stuid);
    }

    @RequestMapping("/findCourse")
    public Course findCor(int corid){
        return manySerivice.findCourseById(corid);
    }
    @RequestMapping("/insert")
    public String add(Course cor,Student stu){
        manySerivice.insertCorAndStu(stu,cor);
        return "success";
    }
    @RequestMapping("/deleteStu")
    public String delStu(int stuid){
        manySerivice.deleteStu(stuid);
        return "success";
    }
    @RequestMapping("/deleteCor")
    public String delCor(int corid){
        manySerivice.deleteCor(corid);
        return "success";
    }
    @RequestMapping("/delSingle")
    public String delSingle(int stuid,int corid){
        manySerivice.delStuAndCor(stuid, corid);
        return "success";
    }

    @RequestMapping("/mod")
    public String mod(int stuid,int oldcorid,int newcorid){
        manySerivice.updateStu(stuid,oldcorid,newcorid);
        return "success";
    }

    @RequestMapping("/singleAdd")
    public String singleAdd(int stuid,int corid){
        manySerivice.addSingleStuAndCor(stuid,corid);
        return "success";
    }
}

