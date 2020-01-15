package com.spring.bean;

import javax.persistence.*;

@Table(name = "t_score")
public class Score {
    @Id
    @Column(name = "student_id")
    private Integer studentId;

    @Id
    @Column(name = "course_id")
    private Integer courseId;

    /**
     * @return student_id
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * @param studentId
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * @return course_id
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * @param courseId
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}