package com.sqh.manytab.services.impl;

import com.sqh.manytab.entity.Course;
import com.sqh.manytab.entity.Student;
import com.sqh.manytab.mapper.CourseMapper;
import com.sqh.manytab.mapper.Stu_CorMapper;
import com.sqh.manytab.mapper.StudentMapper;
import com.sqh.manytab.services.ManySerivice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class ManyServiceImpl implements ManySerivice {
    @Resource
    private CourseMapper courseMapper;
    @Resource
    private StudentMapper studentMapper;
    @Resource
    private Stu_CorMapper stu_corMapper;

    @Override
    public Student findStudentById(int stuid) {
        return studentMapper.findById(stuid);
    }

    @Override
    public Course findCourseById(int corid) {
        return courseMapper.findById(corid);
    }

    @Override
    public void insertCorAndStu(Student stu, Course cor) {
        courseMapper.addCor(cor);
        studentMapper.addStu(stu);
        Map map = new HashMap();
        map.put("corid",cor.getCorid());
        map.put("stuid",stu.getStuid());
        stu_corMapper.addStuAndCor(map);
    }

    @Override
    public void deleteStu(int stuid) {
        stu_corMapper.delStu(stuid);
        studentMapper.delStu(stuid);
    }

    @Override
    public void deleteCor(int corid) {
        stu_corMapper.delCor(corid);
        courseMapper.delCor(corid);
    }

    @Override
    public void delStuAndCor(int stuid, int corid) {
        Map mp = new HashMap();
        mp.put("stuid",stuid);
        mp.put("corid",corid);
        stu_corMapper.delSingleCorseByStu(mp);
    }

    @Override
    public void updateStu(int stuid,int oldcorid,int newcorid) {
        Map mp = new HashMap();
        mp.put("stuid",stuid);
        mp.put("oldcorid",oldcorid);
        mp.put("newcorid",newcorid);
        stu_corMapper.modStu(mp);
    }

    @Override
    public void addSingleStuAndCor(int stuid, int corid) {
        Map mp = new HashMap();
        mp.put("stuid",stuid);
        mp.put("corid",corid);
        stu_corMapper.addStuAndCor(mp);
    }
}
