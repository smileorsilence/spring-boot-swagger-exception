package com.example.demo.controller;

import com.example.demo.service.dto.CompanyDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author smileorsilence
 * @date 2018/11/28
 */
@Api("企业控制器")
@Slf4j
@Controller
@RequestMapping("/api")
public class CompanyController {

    @ApiOperation(value = "添加企业")
    @PostMapping(value = "/company")
    @ResponseBody
    public String createCompany(CompanyDTO company) {
        return "smileorsilence";
    }

}
