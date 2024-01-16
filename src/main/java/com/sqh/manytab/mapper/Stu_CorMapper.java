package com.sqh.manytab.mapper;

import java.util.Map;

public interface Stu_CorMapper {
    public void addStuAndCor(Map map);
    public void delStu(int stuid);
    public void delCor(int corid);
    public void modStu(Map map);
    //按照学生编号和某门课程编号删除某学员的单门课程
    public void delSingleCorseByStu(Map map);

}
