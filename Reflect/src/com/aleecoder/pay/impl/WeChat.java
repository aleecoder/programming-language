package com.aleecoder.pay.impl;

import com.aleecoder.pay.MeiTuan;

/**
 * @author HuanyuLee
 * @date 2022/3/15
 */
public class WeChat implements MeiTuan {
    @Override
    public void payOnline() {
        System.out.println("正在使用微信支付......");
    }
}
