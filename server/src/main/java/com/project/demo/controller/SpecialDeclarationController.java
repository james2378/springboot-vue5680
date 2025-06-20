package com.project.demo.controller;

import com.project.demo.entity.SpecialDeclaration;
import com.project.demo.service.SpecialDeclarationService;
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
 * 特殊申报：(SpecialDeclaration)表控制层
 *
 */
@RestController
@RequestMapping("/special_declaration")
public class SpecialDeclarationController extends BaseController<SpecialDeclaration, SpecialDeclarationService> {

    /**
     * 特殊申报对象
     */
    @Autowired
    public SpecialDeclarationController(SpecialDeclarationService service) {
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
