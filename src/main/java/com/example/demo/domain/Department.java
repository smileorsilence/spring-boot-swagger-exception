package com.example.demo.domain;

import lombok.Data;

import java.util.Set;

/**
 * @author smileorsilence
 * @date 2018/11/28
 */
@Data
public class Department {

    private Set<Employee> employees;

}
