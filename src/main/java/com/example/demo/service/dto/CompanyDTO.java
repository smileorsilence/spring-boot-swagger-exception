package com.example.demo.service.dto;

import com.example.demo.domain.Employee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author smileorsilence
 * @date 2018/11/28
 */
@ApiModel("企业")
@Data
public class CompanyDTO {

    @ApiModelProperty("员工")
    private Employee employee;

}
