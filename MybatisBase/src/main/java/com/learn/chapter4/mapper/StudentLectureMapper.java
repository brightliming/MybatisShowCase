package com.learn.chapter4.mapper;

import com.learn.chapter4.po.StudentLectureBean;

import java.util.List;

/**
 * Created by bright on 17-1-20.
 */
public interface StudentLectureMapper {
    List<StudentLectureBean> findStudentLectureByStuId(int studentId);
}
