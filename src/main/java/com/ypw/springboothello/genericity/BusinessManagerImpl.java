package com.ypw.springboothello.genericity;

import org.springframework.stereotype.Service;

@Service
public class BusinessManagerImpl implements BusinessManager {
    @Override
    public <T extends BaseData> void handleMethod(BusinessBO<T> businessBO) {
        System.out.println(businessBO.getBaseData().getCode());
        System.out.println(businessBO.getBusinessCode());
        System.out.println("handle!~!~!!");
    }
}
