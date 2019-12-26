package com.larionov.epam;

import com.larionov.epam.service.impl.DemoServiceImpl;


public class Main {
    public static void main(String[] args) throws Exception {
        DemoServiceImpl demoService = new DemoServiceImpl();
        demoService.start();

    }
}
