package com.yupi.springbootinit.model.vo;

import lombok.Data;
import lombok.ToString;

/**
 * BI 的返回结果
 */
@Data
@ToString
public class BiResponse {

    private String genChart;

    private String genResult;

    private Long chartId;

}
