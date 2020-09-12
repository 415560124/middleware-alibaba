package com.rhy.common.entity.common;


import com.cloud.common.constants.result.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: cloud-service
 * @description: 通用返回类
 * @author: Rhy
 * @create_time: 2020-06-28 09:40
 * @modifier：Rhy
 * @modification_time：2020-06-28 09:40
 **/
@Data
@ApiModel(value="CommonResult", description="通用返回类")
public class CommonResult<T> {

    @ApiModelProperty(value = "系统状态码")
    private long code;

    @ApiModelProperty(value = "返回信息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private T data;

    public CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> success(){
        return success((T)null);
    }
    /**
     * 成功返回自定义提示信息
     * @param message
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> success(String message){
        return new com.cloud.common.utils.bean.CommonResult<T>(ResultCodeEnum.SUCCESS.getCode(),ResultCodeEnum.SUCCESS.getMessage(),null);
    }
    /**
     * 成功返回，自定义数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> success(T data){
        return new com.cloud.common.utils.bean.CommonResult<T>(ResultCodeEnum.SUCCESS.getCode(),ResultCodeEnum.SUCCESS.getMessage(),data);
    }

    /**
     * 成功返回自定义提示信息
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> success(String message, T data) {
        return new com.cloud.common.utils.bean.CommonResult<T>(ResultCodeEnum.SUCCESS.getCode(),message,data);
    }

    /**
     * 失败返回
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> failed(){
        return failed(ResultCodeEnum.FAILED);
    }
    /**
     * 失败返回自定义枚举
     * @param resultCodeEnum
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> failed(ResultCodeEnum resultCodeEnum){
        return new com.cloud.common.utils.bean.CommonResult<T>(resultCodeEnum.getCode(),resultCodeEnum.getMessage(),null);
    }

    /**
     * 失败返回自定义提示信息
     * @param message
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> failed(String message){
        return new com.cloud.common.utils.bean.CommonResult<T>(ResultCodeEnum.FAILED.getCode(),message,null);
    }

    /**
     * 失败返回自定义提示信息及返回值
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> failed(String message, T data){
        return new com.cloud.common.utils.bean.CommonResult<T>(ResultCodeEnum.FAILED.getCode(),message,data);
    }

    /**
     * 参数验证失败返回
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> validateFailed(){
        return failed(ResultCodeEnum.VALIDATE_FAILED);
    }
    /**
     * 参数验证失败自定义提示信息返回
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> validateFailed(String message){
        return new com.cloud.common.utils.bean.CommonResult<T>(ResultCodeEnum.VALIDATE_FAILED.getCode(),message,null);
    }

    /**
     * 参数验证失败自定义返回数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> validateFailed(T data){
        return new com.cloud.common.utils.bean.CommonResult<T>(ResultCodeEnum.VALIDATE_FAILED.getCode(),ResultCodeEnum.VALIDATE_FAILED.getMessage(),data);
    }

    /**
     * 定制化提示，给全局异常用
     * @param code
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> custom(Long code, String message){
        return custom(code,message,null);
    }
    /**
     * 定制化提示，给全局异常用
     * @param code
     * @param message
     * @param data
     * @param <T>
     * @return
     */
    public static <T> com.cloud.common.utils.bean.CommonResult<T> custom(Long code, String message, T data){
        return new com.cloud.common.utils.bean.CommonResult<T>(code,message,data);
    }
}
