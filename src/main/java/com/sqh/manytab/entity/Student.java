package com.sqh.manytab.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private int stuid;
    private int corid;
    private String stuname;
    private List<Course> course;
    private Course cor;
}
