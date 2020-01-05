package com.edu.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lihaoji
 * @create 2019-12-07 14:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "全局自定义异常")
public class EduException extends RuntimeException{

    @ApiModelProperty(value = "状态码")
    private Integer code;
    @ApiModelProperty(value = "异常消息")
    private String msg;
}
