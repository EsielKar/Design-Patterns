package com.esielkar.proxy;

import java.util.Random;

public class Proxy implements ServiceInterface {
    private final Service realService;

    public Proxy(Service service) {
        realService = service;
    }

    private boolean checkAccess() {
        return new Random().nextInt() % 2 == 0;

    }

    @Override
    public void operation() {
        System.out.println("Proxy: operation");
        if (checkAccess()) {
            realService.operation();
        }
    }

}
