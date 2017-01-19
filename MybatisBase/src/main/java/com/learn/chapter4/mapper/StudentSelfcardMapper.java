package com.learn.chapter4.mapper;

import com.learn.chapter4.po.StudentSelfcardBean;

import java.util.List;

/**
 * Created by bright on 17-1-19.
 */
public interface StudentSelfcardMapper {
    public List<StudentSelfcardBean> findStudentSelfcardByStudentId(int studentId);
}
