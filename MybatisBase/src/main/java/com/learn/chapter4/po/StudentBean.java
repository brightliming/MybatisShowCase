package com.learn.chapter4.po;

import com.learn.chapter3.enums.Sex;

import java.util.List;

/**
 * Created by bright on 17-1-19.
 */
public class StudentBean {
    private int id;
    private String cnname;
    private Sex sex;
    private String note;
    private List<StudentLectureBean> studentLectureList;
    private StudentSelfcardBean studentSelfcardBean;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public StudentSelfcardBean getStudentSelfcardBean() {
        return studentSelfcardBean;
    }

    public void setStudentSelfcardBean(StudentSelfcardBean studentSelfcardBean) {
        this.studentSelfcardBean = studentSelfcardBean;
    }
    public List<StudentLectureBean> getStudentLectureList() {
        return studentLectureList;
    }

    public void setStudentLectureList(List<StudentLectureBean> studentLectureList) {
        this.studentLectureList = studentLectureList;
    }

}
