package com.sqh.manytab.mapper;

import com.sqh.manytab.entity.Course;

public interface CourseMapper {
    public Course findById(int corid);
    public void addCor(Course cor);
    public void delCor(int corid);
}
