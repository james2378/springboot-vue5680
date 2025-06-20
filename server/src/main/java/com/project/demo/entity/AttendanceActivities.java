package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 考勤活动：(AttendanceActivities)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AttendanceActivities")
public class AttendanceActivities implements Serializable {

    // AttendanceActivities编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_activities_id")
    private Integer attendance_activities_id;

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
    // 开始时间
    @Basic
    private Timestamp start_time;
    // 结束时间
    @Basic
    private Timestamp end_time;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
