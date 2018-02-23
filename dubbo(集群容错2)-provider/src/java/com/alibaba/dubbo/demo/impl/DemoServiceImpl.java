package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {

    @Override
    public int mysum(int a, int b) {
        return Integer.parseInt(Integer.toString(a)+Integer.toString(b)+200);
    }

}
