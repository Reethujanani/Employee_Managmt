package com.example.Employee.Mgmt.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


import java.io.Serializable;
@Data


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuccessResponse<T> implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;
    private int statusCode = 200;
    private String statusMessage ="Success";
    private T data;


}
