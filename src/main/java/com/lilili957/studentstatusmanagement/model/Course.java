package com.lilili957.studentstatusmanagement.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Course implements Serializable {
    private Integer cId;
    private String sName;
    private Teacher teacher;
    private Integer credit;

}
