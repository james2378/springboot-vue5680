package com.project.demo.controller;

import com.project.demo.entity.AttendanceCheckIn;
import com.project.demo.service.AttendanceCheckInService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 考勤签到：(AttendanceCheckIn)表控制层
 *
 */
@RestController
@RequestMapping("/attendance_check_in")
public class AttendanceCheckInController extends BaseController<AttendanceCheckIn, AttendanceCheckInService> {

    /**
     * 考勤签到对象
     */
    @Autowired
    public AttendanceCheckInController(AttendanceCheckInService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
