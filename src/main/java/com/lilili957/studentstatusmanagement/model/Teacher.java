package com.lilili957.studentstatusmanagement.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {
    private Integer tId;
    private String tName;
    private String tJobTitle;
}
