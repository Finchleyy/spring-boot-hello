package com.ypw.springboothello.genericity;

public interface BusinessManager {
    <T extends BaseData> void handleMethod(BusinessBO<T> businessBO);
}
