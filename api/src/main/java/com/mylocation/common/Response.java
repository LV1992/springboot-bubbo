package com.mylocation.common;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/8/30.
 */
public class Response<T> implements Serializable{
    //表示调用是否成功
    private boolean success;
    //错误代码
    private String errorCode;
    //错误信息
    private String errorMsg;
    //返回对象
    private T result;
    //
    public Response(){}

    public static Response<Object> ok(){
        Response<Object> r = new Response<Object>();
        r.success = true;
        r.result = "success";
        return r;
    }

    public static Response<Object> error(String errorCode,String errorMsg){
        Response<Object> r = new Response<Object>();
        r.success = false;
        r.errorCode = errorCode;
        r.errorMsg = errorMsg;
        return r;
    }

    public static Response create(Object result){
        Response<Object> r = new Response<Object>();
        r.success = true;
        r.result = result;
        return r;
    }

    public boolean isSuccess(){
        return success;
    }

}
