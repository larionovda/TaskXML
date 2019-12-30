package com.larionov.epam;

import com.larionov.epam.service.DemoService;
import com.larionov.epam.service.impl.DemoServiceImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DemoService demoService = new DemoServiceImpl();
        demoService.start();
    }
}
