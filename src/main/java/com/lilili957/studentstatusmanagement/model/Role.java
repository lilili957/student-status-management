package com.lilili957.studentstatusmanagement.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private Integer rId;
    private String name;
}
