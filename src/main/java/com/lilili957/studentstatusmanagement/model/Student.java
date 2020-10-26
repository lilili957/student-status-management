package com.lilili957.studentstatusmanagement.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Integer sId;
    private String SName;
    private String sex;
    private String clzss;
    private String department;
    private String major;
    private String rewOrPun;
}
