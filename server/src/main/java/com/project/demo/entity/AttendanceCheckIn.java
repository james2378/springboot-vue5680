package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 考勤签到：(AttendanceCheckIn)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AttendanceCheckIn")
public class AttendanceCheckIn implements Serializable {

    // AttendanceCheckIn编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_check_in_id")
    private Integer attendance_check_in_id;

    // 课程编号
    @Basic
    private String course_id;
    // 课程名称
    @Basic
    private String course_name;
    // 班级名称
    @Basic
    private String class_name;
    // 授课教师
    @Basic
    private Integer lecturer;
    // 考勤名称
    @Basic
    private String attendance_name;
    // 学生
    @Basic
    private Integer student;
    // 学生姓名
    @Basic
    private String student_name;
    // 考勤状态
    @Basic
    private String attendance_status;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
