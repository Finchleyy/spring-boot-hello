package com.ypw.springboothello.json;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author yupengwu
 */
@Data
public class DefaultResults implements Result {
    String code;
    private String errorClass;
    @JSONField(name = "isOk")
    boolean isOk;

    public boolean isY() {
        return false;
    }

    @Override
    public boolean isSuccess() {
        return true;
    }

    @Override
    public boolean isFailure() {
        return false;
    }
}
