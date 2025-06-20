package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 特殊申报：(SpecialDeclaration)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SpecialDeclaration")
public class SpecialDeclaration implements Serializable {

    // SpecialDeclaration编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "special_declaration_id")
    private Integer special_declaration_id;

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
    // 申报内容
    @Basic
    private String declaration_content;



    // 审核状态
    @Basic
    private String examine_state;








    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
