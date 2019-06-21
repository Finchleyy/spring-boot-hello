package com.ypw.springboothello.genericity;

import lombok.Data;

@Data
class BusinessBO<T extends BaseData> {
    private String businessCode;

    T baseData;
}
