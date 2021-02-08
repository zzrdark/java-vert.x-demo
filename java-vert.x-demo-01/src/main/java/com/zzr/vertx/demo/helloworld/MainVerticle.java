package com.zzr.vertx.demo.helloworld;

import com.zzr.vertx.demo.helloworld.verticle.MyFirstVericle;
import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        vertx.deployVerticle(MyFirstVericle.class.getName());
    }
}
